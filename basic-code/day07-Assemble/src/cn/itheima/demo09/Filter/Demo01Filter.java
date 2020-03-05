package cn.itheima.demo09.Filter;

import java.io.File;

public class Demo01Filter {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\25220\\Desktop");
        printDir(file);
    }

    private static void printDir(File file) {
        File[] files=file.listFiles(new FileFilterImpl());
        for (File f:files) {
            if (f.isDirectory()){
                printDir(f);
            }else {    //链式编程
                System.out.println(f);
            }
        }


    }
}
