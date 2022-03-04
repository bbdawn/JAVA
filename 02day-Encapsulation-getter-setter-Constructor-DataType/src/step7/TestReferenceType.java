package step7;

public class TestReferenceType {
	public static void main(String[] args) {
		/*
		 * Product : 참조형 타입 reference type
		 * p: 참조변수 reference variable 
		 */
		
		//Product p; 	// 객체 안만들어줌. 생성자 명시해놨기 때문에 
						//상품명,제조사,가격 입력해야함
		Product p=new Product("테라","진로",1410);
		
		//아래 객체를 생성해 참조변수에
		//주소값을 할당하는 메모리 그림은 
		//3일차 칠판.pdf 4page에 있음
		//지역변수는 stack에 저장됨.
		//p-> heap에 있는 객체 참조하는 변수. 
		//객체는 heap에 저장됨.(주소값을 생성함)
		
		Product p2=new Product("카스","두산",1410);
		
		
		//p객체 주소값을 p2 변수에 할당시켜서 참조하게 한다.
		p2=p;
		
		System.out.println(p.getName()); // 결과 : 테라
		System.out.println(p2.getName()); // 결과 : 테라
		
		
		
	}
}
