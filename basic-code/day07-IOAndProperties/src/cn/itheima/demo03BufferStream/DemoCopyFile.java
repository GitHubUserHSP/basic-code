package cn.itheima.demo03BufferStream;

import java.io.*;

/*使用字节缓冲流复制文件测试速度
* */
public class DemoCopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fis=new FileInputStream("day07-IOAndProperties\\prop1.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        FileOutputStream fos=new FileOutputStream("day07-IOAndProperties\\prop1.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);

        byte[] bytes=new byte[1024];
        int len=0;
        while((len = bis.read(bytes))!=-1)  //使用数组比比使用数组、基本流要快
            bos.write(len);

        long e=System.currentTimeMillis();
        System.out.println(e-s+"毫秒");
    }

}
