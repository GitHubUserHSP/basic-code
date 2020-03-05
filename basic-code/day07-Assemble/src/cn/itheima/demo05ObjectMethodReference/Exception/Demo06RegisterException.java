package cn.itheima.demo05ObjectMethodReference.Exception;
/*用户自定义异常
要求：模拟注册 如果用户已经存在 抛出异常并提示 返回用户已经存在
* */


import java.util.Scanner;

public class Demo06RegisterException {
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
                try {
                    throw new RegisterException("对不起，该用户已存在");
                } catch (RegisterException e) {
                    e.printStackTrace();
                }
            }
            return;//当用try catch包裹时虽然异常出现，但程序会往下进行可加return终止
        }
        System.out.println("恭喜你注册成功！");

    }
}
