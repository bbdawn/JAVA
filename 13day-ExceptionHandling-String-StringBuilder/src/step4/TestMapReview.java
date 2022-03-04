package step4;

import java.util.LinkedHashMap;

public class TestMapReview {
	public static void main(String[] args) {
		LinkedHashMap<String,Friend> map=new LinkedHashMap<String,Friend>();
		
		Friend f1=new Friend("아이유", 30);
		//map에 요소를 추가, key는 name, value는 Friend Object
		map.put(f1.getName(),f1);		
		map.put("rm",new Friend("rm",25));
		System.out.println(map);
		
		//key로 검색
		System.out.println(map.get("rm"));
		
		//특정 key가 map에 존재하는 지 여부를 확인
		System.out.println(map.containsKey("rm"));//rm이라는 key가 존재하므로 true
		System.out.println(map.containsKey("bts"));//bts라는 key가 존재하지 않으므로 false
		
		//삭제
		System.out.println(map.remove("아이유"));//삭제 후 삭제 대상을 반환
		System.out.println(map);
		
		//수정
		System.out.println(map.put("rm", new Friend("rm",35)));
		System.out.println(map);
	
	}
}
