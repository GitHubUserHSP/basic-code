package cn.itheima.demo02FileUpload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*文件上传案列的客户端：读取本地文件，上传到服务器，读取服务器回写的数据
* */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("d:\\a.txt");
        Socket socket=new Socket("127.0.0.1",8888);
        OutputStream os = socket.getOutputStream();

        byte[] bytes=new byte[1024];
        int len=0;
        while((len=fis.read(bytes))!=-1){
            os.write(bytes,0,len);//往服务器写数据
        }
        socket.shutdownOutput();//为循环加上结束条件即可解决 因未碰到结束标志而阻塞

        InputStream is = socket.getInputStream();
        while((len=is.read(bytes))!=-1)
        System.out.println(new String (bytes,0,len));

        fis.close();
        socket.close();

    }
}
