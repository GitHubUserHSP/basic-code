package cn.itheima.demo02FileUpload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(8888);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();

        File file=new File("e:\\upload");
        if (!file.exists()){
            file.mkdir();
        }

      //  FileOutputStream fos=new FileOutputStream("e:\\upload\\a.txt");   //写相对路径不会出错（不推荐）
//        FileOutputStream fos=new FileOutputStream(file+"a.txt");//用此句会出错在e 盘下面创建uploada.txt
        FileOutputStream fos=new FileOutputStream(file+"\\a.txt");//解决上述问题


        byte[] bytes=new byte[1024];
        int len=0;
        while((len=is.read(bytes))!=-1){
            fos.write(bytes,0,len);//往服务器的硬盘写入数据
        }

        OutputStream os = socket.getOutputStream();
        os.write("上传成功".getBytes());

        /*is.close();
        os.close();来源于socket关socket即可*/
        fos.close();
        socket.close();
        server.close();



    }
}
