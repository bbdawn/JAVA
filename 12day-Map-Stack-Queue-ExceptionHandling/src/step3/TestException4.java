package step3;

import javax.print.attribute.standard.NumberOfDocuments;

/*
 * finally 블럭에 대한 예제
 * try{
 * 
 * }catch(Exception e){
 * 		예외처리(대안흐름)
 * }finally{
 * 		항상 실행
 * }
 * 
 * 
 *아래 예제는 Integer.parseInt코드라인에서 스물둘이라는 NumberFormat이 아닌 정보를 입력해서
 *정수로 변환할 수 없음을 알리는 NumberException이 발생되는데
 *catch구문에 다른 예외타입인 NullPointerException을 명시해서 고의로 예외처리에 실패하도록 구성
 *!!!이런 경우에도 finally 영역은 항상 실행되는 것을 알기 위한 예제!!!
 *즉 정상 실행, 예외처리실행, 예외를 처리하지 못하여 비정상 종료되는 모든 경우에도
 *finally 구문은 언제나 실행된다는 것을 알 수 있다. 
 *ex.atm기에서 어떤 경우에도 카드는 고객에게 돌려줘야하는 것처럼.
 */
public class TestException4 {
	public static void main(String[] args) {
		String age="22";
		System.out.println(age+1);//문자열이므로 221
		
		//테스트를 위해 고의로 age 정보를 정수 포맷이 아니라 문자 포맷으로 할당
		age="스물둘";
		
		try {
		//문자열을 정수로 변환
		int ageNum=Integer.parseInt(age);
		System.out.println(ageNum+1);//23
	//	}catch(NumberFormatException e) {
	//		System.out.println("정수포맷으로 입력해주세요! 대안 실행");
		}catch(NullPointerException e) { //test를 위해 고의로 다른 exception 타입으로 catch 명시
			System.out.println("NULL~");
		}finally{
			System.out.println("finally영역은 항상 실행");
		}
		
		
		
		System.out.println("프로그램 정상 수행");
	}
	
	
	
	
	
	

}//class
