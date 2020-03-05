package cn.itheima.demo03FileUploadOptimize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;


public class TCPClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\a.txt");

        Socket socket=new Socket("127.0.0.1",8888);
        OutputStream os = socket.getOutputStream();

        byte[] bytes=new byte[1024];//加快读取速度
        int len=0;
        while ((len=fis.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
        socket.shutdownOutput();

        InputStream is = socket.getInputStream();//读取服务器回传的数据
        while((len=is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }

        fis.close();
        socket.close();

    }
}
