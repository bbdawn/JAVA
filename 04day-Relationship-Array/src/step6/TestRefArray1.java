//TestRefArray1 + Person
package step6;

public class TestRefArray1 {

	public static void main(String[] args) {
		// 참조형 데이터(객체)
		
		// 배열 선언
		Person[]pa;
		
		//배열 생성
		pa=new Person[3];
		System.out.println(pa[0]); //null //null(문자열)로 초기화되어있는 상태
		System.out.println(pa.length); //3
		
		//배열 요소 할당
		pa[0]=new Person("아이유",30);
		pa[1]=new Person("박보검",28);
		pa[2]=new Person("RM",26);
		
	
		//pa 배열의 요소의 name을 모두 출력
		//for loop 출력 결과는 아이유 박보검 RM
		
		for(int i=0; i<pa.length; i++) {
			System.out.println(pa[i].getName());
		}
		
		
	}

}
