package step2;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public class TestMap2 {
	public static void main(String[] args) {
		//TreeMap을 이용 -> 정렬기능을 확인
		TreeMap<Integer,Food> map=new TreeMap<Integer,Food>();
		map.put(2, new Food(2,"카스",1410));
		map.put(3, new Food(3, "서울우유", 1500));
		map.put(1, new Food(1, "사발면", 900));
		System.out.println(map);//key를 기준으로 오름차순으로 정렬되어 있다. 
		
		//key로 검색
		System.out.println(map.get(1));
		
		//key 말고 value들(음식명)만 별도로 출력하고싶을 때 
		Collection<Food> col=map.values();
		Iterator<Food> it=col.iterator();//Iterator(반복자) 방식을 이용해 반복 열거 할 수 있다. 
		while(it.hasNext()) {
			System.out.println(it.next().getName());
		}
	}//main
}
