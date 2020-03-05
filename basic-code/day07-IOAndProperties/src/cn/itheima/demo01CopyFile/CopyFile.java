package cn.itheima.demo01CopyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//一次读一个字符、一次读多个字符（Byte[]实现）
public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\a.txt");
        FileOutputStream fos=new FileOutputStream("E:\\a.txt");

        /*int length=0;
        while ((length=fis.read())!=-1)
            fos.write(length);*/

        byte[] bytes=new byte[1024];
        int length=0;
        while ((length=fis.read(bytes))!=-1)
            fos.write(bytes,0,length);//从字节数组中的索引0开始读了length个


        fos.close();
        fis.close();
    }
}
