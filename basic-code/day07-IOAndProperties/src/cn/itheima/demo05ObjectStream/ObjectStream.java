package cn.itheima.demo05ObjectStream;

import java.io.*;
import java.util.ArrayList;

public class ObjectStream {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        ArrayList<Person> arrayList=new ArrayList<>();
        arrayList.add(new Person("张三",18));
        arrayList.add(new Person("李四",21));
        arrayList.add(new Person("王五",19));
        arrayList.add(new Person("赵六",20));

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("day07-IOAndProperties\\stream.txt"));
        oos.writeObject(arrayList);
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("day07-IOAndProperties\\stream.txt"));
        Object o = ois.readObject();
        ArrayList<Person> arrayList1=(ArrayList<Person>)o;
        for (Person person : arrayList1) {
            System.out.println(person);
        }
        oos.close();
        ois.close();
    }

}
