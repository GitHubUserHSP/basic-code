package cn.itheima.demo05ObjectMethodReference.Exception;
/*用户自定义异常
要求：模拟注册 如果用户已经存在 抛出异常并提示 返回用户已经存在
处理编译时异常两种方法throws声明(一般配合throw使用)和try catch包裹
运行时异常可不处理 交由JVM
* */


import java.util.Scanner;

public class Demo05RegisterException {
    static String[] userName={"张三","李四","王五"};

    public static void main(String[] args) /*throws RegisterException*/ {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        checkUsername(username);
    }

    private static void checkUsername(String username) /*throws RegisterException*/ {
        for (String s : userName) {
            if(username.equals(s)){
                throw new RegisterException("对不起，该用户已存在");
            }
        }
        System.out.println("恭喜你注册成功！");

    }
}
