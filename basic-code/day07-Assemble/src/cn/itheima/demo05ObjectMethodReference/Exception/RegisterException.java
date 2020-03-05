package cn.itheima.demo05ObjectMethodReference.Exception;
//用户自定义异常，必须继承
//和重写构造函数
public class RegisterException extends /*Exception*/ RuntimeException{//如果是运行时异常可以不用处理交给(中断处理)

    public RegisterException() {
    }

    public RegisterException(String message){
        super(message);

    }
}
