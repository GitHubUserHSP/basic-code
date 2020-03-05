package cn.itheima.demo09.Filter;

import java.io.File;
import java.io.FileFilter;

/*用Lambda表达式简化过滤器*/
public class Demo02Filter {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\25220\\Desktop");
        printDir(file);
    }

    private static void printDir(File file) {
        /*File[] files=file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.isDirectory()){
                    return true;
                }
                return pathname.getName().toLowerCase().endsWith(".java");//上面三行还可简化
            }
        });*/
        //若接口中只有一个抽象方法用Lambda简化后
        /*File[] files=file.listFiles((File pathname)->{
            return pathname.isDirectory()||pathname.getName().toLowerCase().endsWith(".java");
        });*/
        //根据Lambda规则继续简化
        File[] files=file.listFiles(pathname->pathname.isDirectory()||pathname.getName().toLowerCase().endsWith(".java"));
        for (File f:files) {
            if (f.isDirectory()){
                printDir(f);
            }else {    //链式编程
                System.out.println(f);
            }
        }


    }
}
