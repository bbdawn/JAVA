package step1;

import java.util.ArrayList;

public class TestList1 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("치킨");
		list.add("맥주");
		list.add("스파게티");
		list.add("맥주");
		System.out.println(list.size());//4
		System.out.println(list); //치킨 맥주 스파게티 맥주
		System.out.println(list.get(0)); //치킨 //index는 0부터 시작함 
		
		//마지막 요소를 반환받아 출력
		System.out.println(list.get(3));//맥주
		System.out.println(list.get(list.size()-1)); //맥주 //위와 동일한 결과. 마지막 요소 index를 모를때에는 size()-1을 이용하면 됨!
		
		//index1인 맥주를 삭제
		System.out.println(list.remove(1)+" 삭제");//remove()는 삭제후에 삭제한 요소를 반환
		System.out.println(list);//치킨, 스파게티, 맥주 //index1에 있던 맥주 삭제됨
		
		//index2인 맥주를 소주로 수정
		System.out.println(list.set(2, "소주")+ " 수정"); //set()은 수정 후에 수정전 요소를 반환한다.
		System.out.println(list);
		
		//for loop를 이용해서 요소를 출력
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		list.clear(); //모든 요소를 삭제
		System.out.println(list);
	}
}


























