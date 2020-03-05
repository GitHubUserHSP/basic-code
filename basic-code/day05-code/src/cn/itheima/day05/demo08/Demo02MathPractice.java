package cn.itheima.day05.demo08;
/*题目：
计算-10.9~5.8之间，绝对值大于6或者小于2.1的整数有几个分别是：
*/
public class Demo02MathPractice {
    public static void main(String[] args) {
        double min=-10.9;
        double max=5.8;

        int count=0;
        for(int i=(int)min;i<=max;i++) {
            if (6 < Math.abs(i) || Math.abs(i) < 2.1) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("符合条件的有"+count+"个");

        }
    }