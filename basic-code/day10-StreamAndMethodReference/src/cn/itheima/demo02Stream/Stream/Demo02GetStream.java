package cn.itheima.demo02Stream.Stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

/*Java8新加入最常用的流接口（并不是一个函数式接口）
 * 获取流的常用方式：
 * -所有Collection（针对单列集合，双列集合需要转换）集合都可以通过stream默认方法获取流
 * -Stream接口的静态方法of可以获取数组对应的流
 */
public class Demo02GetStream {
	public static void main(String[] args){
		//1.把集合转换为Stream流
		List<String> list=new ArrayList<>();
		Stream<String> stream = list.stream();
		
		Set<String> set=new HashSet<>();
		Stream<String> stream2 = set.stream();
		
		Map<String,String> map=new HashMap<>();
		//获取键存储到Set集合
		Set<String> keySet = map.keySet();
		Stream<String> stream3=keySet.stream();
		
		Collection<String> values = map.values();
		Stream<String> stream4 = values.stream();
		//获取键值对（键与值得映射关系）
		Set<Entry<String, String>> entrySet = map.entrySet();
		Stream<Entry<String, String>> stream5 = entrySet.stream();
		//2.把数组转换为Stream流
		Stream<Integer> stream6=Stream.of(1,2,3,4);
		//可变参数可以传递数组
		Integer[] arr={1,2,3,4};
		Stream<Integer> stream7 = Stream.of(arr);
		
		String[] arr2={"a","b","c","d"};
		Stream<String> stream8=Stream.of(arr2);
	}
}
