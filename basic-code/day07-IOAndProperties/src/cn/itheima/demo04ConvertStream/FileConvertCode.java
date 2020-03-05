package cn.itheima.demo04ConvertStream;

import java.io.*;
//UTF-8转GBK 反转同理 省略
public class FileConvertCode {
    public static void main(String[] args) throws IOException {
        /*FileWriter fw=new FileWriter("day07-IOAndProperties\\before.txt");
        fw.write("转换前：系统默认编码格式UTF-8");
        fw.close();*/
        //不指定编码格式默认为系统默认格式（UTF-8）
        InputStreamReader isr=new InputStreamReader(new FileInputStream("day07-IOAndProperties\\before.txt"));
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("day07-IOAndProperties\\after.txt"),"GBK");


        int len=0;
        while((len=isr.read())!=-1){
            osw.write(len);
        }
        System.out.println("");

        //先关闭写入的流（写完一定读完，读完不一定写完，故先关）
        osw.close();//关闭转换流之前JVM会自动调用flush方法（故可省略osw.flush();）
        isr.close();
    }
}
