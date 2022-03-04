/*
package step3;

import java.util.ArrayList;

public class TestGeneric2 {
	public static void main(String[] args) {
	/*	
		//Generic을 사용하지 않는 list (generic 안써서 warning뜸)
		ArrayList list=new ArrayList();
		list.add(new Friend("아이유", 30)); //object type의 매개변수에 Frined Object가 할당되었으므로 upcasting된 것
		
		//첫번째 요소 index0의 요소 객체의 name을 get해서 출력해보기
		Object o=list.get(0);
		//Friend의 getName()을 호출하기 위해서는 Object Down Casting이 필요 (부모타입이니까 friend o로 바꿔서 실행해야함)
		System.out.println(((Friend)o).getName());
		
		//Generic을 사용하는 list: 위와 비교 -> Object Down Casting 절차를 감소
		ArrayList<Friend> gList=new ArrayList<Friend>();
		gList.add(new Friend("박보검", 28));
		System.out.println(gList.get(0).getName()); //Generic을 적용했으므로 별도의 down casting 없이 바로 접근 가능
		
		
		
	}
}

*/
