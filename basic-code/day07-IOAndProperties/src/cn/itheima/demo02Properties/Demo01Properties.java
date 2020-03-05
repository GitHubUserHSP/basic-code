package cn.itheima.demo02Properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo01Properties {
    public static void main(String[] args) throws IOException {
        //show01();
        //show02();
        show03();
    }



    private static void show01() {
        Properties prop=new Properties();
        prop.setProperty("古力娜扎","17");
        prop.setProperty("迪丽热巴","18");
        prop.setProperty("马儿扎哈","19");

        Set<String> set = prop.stringPropertyNames();
        for (String s : set) {
            String o = prop.getProperty(s);
            System.out.println(s+"="+o);
        }
    }

    private static void show02() throws IOException {
        Properties prop=new Properties();
        prop.setProperty("古力娜扎","17");
        prop.setProperty("迪丽热巴","18");
        prop.setProperty("马儿扎哈","19");

        FileWriter fw=new FileWriter("day07-IOAndProperties\\prop1.txt");
        //prop.store(OutputStream out,String comment);//字节流 comment为注释，一般为 ""
        //prop.store(Writer writer,String comment);字符流
        prop.store(fw,"save file");//把集合中的数据持久化到硬盘
        fw.close();

    }
    private static void show03() throws IOException {

        Properties prop=new Properties();
        //#注释txt里的东西 打印不会显示
        FileReader fr=new FileReader("day07-IOAndProperties\\prop1.txt");
        prop.load(fr);
        Set<String> key = prop.stringPropertyNames();
        for (String k : key) {
            String o = prop.getProperty(k);
            System.out.println(k+"="+o);

        }
        fr.close();
    }
}
