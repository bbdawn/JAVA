package step4;

import java.util.ArrayList;

import step3.Friend;

public class TestList2 {
	public static void main(String[] args) {
		ArrayList<Friend> list=new ArrayList<Friend>();
		list.add(new Friend("강하늘",500));
		list.add(new Friend("아이유",300));
		list.add(new Friend("박보검",400));
	
	
		//for loop를 이용해서 list 요소의 name을 모두 출력(getName())
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getName());
		}
		System.out.println("***********************");
		
		//for loop를 이용해서 list요소 중 400이하의 money가 있는 친구의 이름을 출력해보기
		int num=400;
		  for(int i=0; i<list.size(); i++) {
			if(list.get(i).getMoney() <= num) {
				System.out.println(list.get(i).getName());
			}//if
		  }//for		
		
		  System.out.println("***********************");
		
		//for loop를 이용해서 list 요소 중 name 아이유에 해당하는 친구의 money를 출력
		//문자열 비교시에는 ==연산자가 아니라 equals메서드를 이용한다
		  String name="아이유";
		  for(int j=0; j<list.size(); j++) {
			if(name.equals(list.get(j).getName())) {
				System.out.println(list.get(j).getMoney());
			}//if
		  }//for
		System.out.println("*******toString() 오버라이딩*********");
		System.out.println(list.get(0)); //주소값나왐
		System.out.println(list.get(0)); //step3 Friend 가서 alt+shift+s 들어가서 toString overriding 한 뒤 입력하니까 실제 객체 정보 반환되어 출력됨
	
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}
}
