package cn.itheima.demo02Stream.Stream;
//forEach方法用来遍历流中的数据，是一个终结方法，遍历后不能调用Stream中的其他方法
import java.util.stream.Stream;

public class Demo03StreamForEach {
	public static void main(String[] args){
		Stream<Integer> stream = Stream.of(1,2,3,4);
		//优化过lambda的写法
		stream.forEach(in->System.out.println(in));
		
	}
}
