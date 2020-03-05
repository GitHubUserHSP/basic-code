package cn.itheima.demo03BufferStream;

import java.io.*;
import java.util.HashMap;



public class Demo01TxtContentSort {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> hashMap=new HashMap();
        BufferedReader br=new BufferedReader(new FileReader("day07-IOAndProperties\\in.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("day07-IOAndProperties\\out.txt"));
        String line = null;
        while((line=br.readLine())!=null){
            String[] str=line.split("\\.");
            hashMap.put(str[0],str[1]);
        }
        for (String key : hashMap.keySet()) {
            bw.write(key+"."+hashMap.get(key));
            bw.newLine();
        }
        br.close();
        bw.close();

    }

}
