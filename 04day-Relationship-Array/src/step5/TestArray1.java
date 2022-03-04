package step5;

public class TestArray1 {

	public static void main(String[] args) {
		//배열선언
		int[]age;
		//배열 생성
		age=new int[3]; //0으로 초기화되어있는 상태
		System.out.println(age);//배열객체주소값
		System.out.println(age.length);//3 //배열객체길이
		System.out.println(age[0]); //0 //0으로 초기화되어있어서
		System.out.println(age[2]); //0 //0으로 초기화되어있어서
		//System.out.println(age[3]); //error : exception 발생. 2까지만 가능
		
		//배열 요소에 값 할당
		age[0]=22;
		age[1]=33;
		age[2]=25;
		System.out.println(age[1]); //33
		System.out.println("**for loop를 이용해 age 배열 객체의 모든 요소를 출력**");
		//age.length를 이용
		for(int i=0; i<age.length; i++) {
			System.out.println(age[i]);
		}
		
		
		
	}
}//class


