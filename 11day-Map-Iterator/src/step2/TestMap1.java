package step2;

import java.util.LinkedHashMap;

public class TestMap1 {
	public static void main(String[] args) {
		Food f1=new Food(1,"테라", 1410);
		Food f2=new Food(2,"진라면", 1100);
		Food f3=new Food(3,"고향만두", 5000);
		
		//Map에 key value 쌍으로 저장
		//Integer는 key의 타입, Food는 value의 타입
		LinkedHashMap<Integer,Food> map=new LinkedHashMap<Integer,Food>();
		map.put(f1.getId(), f1); //key와 value 쌍으로 저장
		map.put(f2.getId(), f2);
		map.put(f3.getId(), f3);
		
		//key로 value를 검색
		//id2인 key로 검색
		Food rf=map.get(2);
		System.out.println(rf.getName()+" "+rf.getPrice());
		System.out.println(map.get(3));
		System.out.println(map);//입력 순서대로 출력 
		System.out.println(map.size());//3
		//key를 이용해 삭제 
		System.out.println(map.remove(1)+" 삭제");
		System.out.println(map);
		//key는 유일해야 한다. 만약 동일한 key 다시 추가(put) 되었을 때는 value가 update 된다 
		System.out.println(map.put(2, new Food(2,"신라면",1500))+" 정보가 신라면으로 업데이트");
		System.out.println(map);
	}

}
