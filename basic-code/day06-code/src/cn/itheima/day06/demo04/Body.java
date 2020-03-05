package cn.itheima.day06.demo04;

public class Body {//外部类
    //外部类成员变量
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //外部类方法
    public  void methodBody() {
        System.out.println("外部类方法");
        new Heart().beat();
    }

    public class Heart{//成员内部类
        //内部类方法
        public void beat(){
            System.out.println("心脏怦怦跳！");
            System.out.println("我叫"+name);
    }


    }

}
