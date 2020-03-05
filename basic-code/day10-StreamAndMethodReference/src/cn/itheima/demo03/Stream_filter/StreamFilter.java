package cn.itheima.demo03.Stream_filter;

import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {
        Stream<String> stream=Stream.of("张三丰","赵敏","张翠山","张无忌","周芷若");
        Stream<String> stream1 = stream.filter((String name) -> {return name.startsWith("张");});

        stream1.forEach(name-> System.out.println(name));
        /*Stream属于管道流，只能被消费（使用）一次
        第一个Stream流调用完方法，数据会流到下一个Stream上 前一个流会关闭 调用会报异常
        java.lang.IllegalStateException: stream has already been operated upon or closed
        * */
        //stream.forEach(name->{System.out.println(name);});
    }
}
