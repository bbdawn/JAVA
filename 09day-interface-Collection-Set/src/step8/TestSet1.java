package step8;

import java.util.LinkedHashSet;

public class TestSet1 {
	public static void main(String[] args) {
		//<String> : Generic 요소의 타입을 지정 -> set의 요소를 String으로 제한한다
		//LinkedHashSet: 중복인정x, 요소 추가 순서를 보장
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("박보검");
		set.add("아이유");
		set.add("박보검"); //set은 중복을 인정하지 않는다
		System.out.println(set);//toString()이 내부적으로 호출 -> 2명 박보검, 아이유
		System.out.println(set.size());//2
		set.clear();//싹 비우기
		System.out.println(set);
		
		//Generic test
		//LinkedHashSet set2=new LinkedHashSet();
		//set2.add("치킨");
		//set2.add(100); //다른 형의 데이터가 저장 가능 -> 자료구조 요소의 타입 안정성을 저해 -> Generic을 권장
	
		LinkedHashSet<Integer> pointSet=new LinkedHashSet<Integer>(); //정수형 자료만 저장하는 자료구조체
		pointSet.add(100);
		pointSet.add(200);
		//pointSet.add("이백"); //error: Generic에서 명시한 타입의 요소가 아니므로 error
		pointSet.add(100);//중복을 인정하지 않음!
		System.out.println(pointSet.size()); //2
		System.out.println(pointSet.isEmpty()); //false //비어있으면 true
		pointSet.clear();//모든 요소를 지운다
		System.out.println(pointSet.isEmpty()); //true //비어있으므로 true
		
	
	
	}
}
