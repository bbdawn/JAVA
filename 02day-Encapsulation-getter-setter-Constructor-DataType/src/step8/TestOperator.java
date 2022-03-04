package step8;

public class TestOperator {
	public static void main(String[] args) {
		//자바 연산자 테스트
		
		int i=7;
		int j=3;
		System.out.println(i*j); //곱하기 	//21
		System.out.println(i/j); //몫 		//2
		System.out.println(i%j); //나머지	//1
		System.out.println(i==j); //같은지 비교 // false
		System.out.println(i=j); //할당
		System.out.println(i==j); //같은지 비교 // true (할당했으니까)
		boolean flag=false;
		System.out.println(flag); 				//false
		System.out.println(!flag); 				//true
		
		System.out.println("**증감연산자**");
		int k=7;
		System.out.println(k++);	//실행 후 증가 //7
		System.out.println(k); 					  //8
		System.out.println(++k);	//증가 후 실행 //9
		System.out.println(k);					  //9
		System.out.println(--k); 	//감소 후 실행 //8
		System.out.println(++k);	//실행 후 감소 //8	
		System.out.println("**************");
		
		int money=100;
		//money 변수에 200을 누적 
		//money = money + 200;
		//위 코드를 줄여서 표현하면 아래와 같다
		money+=200;
		System.out.println(money);
		//기존 money에서 100을 차감해본다
		money-=100;
		System.out.println(money);
		
		System.out.println("**삼항연산자**");
		/*
		 *  (조건식) ? 식1 : 식2
		 *  //조건식이 true이면 식1이 수행, false이면 식2가 수행
		 */
		int x=10;
		int result=(x>0) ? x+1 : x-1;
		System.out.println(result);
		/*
		 *  and 연산(&&), or연산(||)
		 *  
		 *  and연산 (&&)
		 *  true	true 	->	true
		 *  true	false	->	false
		 *  false	true	->	false
		 *  false	false	->	false
		 *  
		 *  or연산 (||)
		 *  true	true 	->	true
		 *  true	false	->	true
		 *  false	true	->	true
		 *  false	false	->	false
		 */
	}
}






