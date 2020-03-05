package cn.itheima.demo08Recursion.Recursion;

import java.io.File;

/*使用递归和File类实现文件搜索*/
public class Recursion {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\25220\\Desktop");
        printDir(file);
    }

    private static void printDir(File file) {
        File[] files=file.listFiles();
        for (File f:files) {
            if (f.isDirectory()){
                printDir(f);//递归
            }else if (f.toString().toLowerCase().endsWith(".java")){    //链式编程
                System.out.println(f);
            }
        }


    }
}
