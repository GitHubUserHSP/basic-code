package cn.itheima.demo04BSTCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) throws IOException{
		ServerSocket server=new ServerSocket(8088);
		/*浏览器解析服务器回写的HTML页面，页面中如果有图片，浏览器会单独开启一个线程读取服务器图片
		我们得让服务器一直处于监听状态，客户端请求一次，服务器回写一次
		* */
		while(true){
			new Thread(new Runnable() {
				@Override
				public void run() {
					try{
						Socket socket = server.accept();
						InputStream is = socket.getInputStream();
						/*byte[] bytes=new byte[1024];
						int len=0;
						while((len=is.read(bytes))!=-1){
							System.out.println(new String(bytes,0,len));
						}*/
						BufferedReader br=new BufferedReader(new InputStreamReader(is));
						String line = br.readLine();
						String[] splitStr = line.split(" ");
						String htmlPath = splitStr[1].substring(1);

						FileInputStream fis=new FileInputStream(htmlPath);
						OutputStream os = socket.getOutputStream();
						//写入HTTP协议响应头，固定写法
						os.write("HTTP/1.1 200 OK\r\n".getBytes());
						os.write("Content-Type:text/html\r\n".getBytes());
						//必须写入空行，否则浏览器不解析
						os.write("\r\n".getBytes());
						//一读一写 实现文件复制 把服务器读到的html文件回传到客户端
						byte[] bytes=new byte[1024];
						int len=0;
						while((len=fis.read(bytes))!=-1){
							os.write(bytes,0,len);
						}
						fis.close();
						socket.close();
					}catch (IOException e){
						e.printStackTrace();
					}
				}
			}).start();
		}
		//server.close();
	}

}
