package step2;

public class Test2DArray {
	public static void main(String[] args) {
		//2차원 배열 테스트
		int rain[][]=new int[3][12];//3년간 매월(12개월) 강유량 저장하려함
		System.out.println(rain[0]);//첫번째 배열(1년차) 객체 주소값 출력
		System.out.println(rain[1].length);//2년차 배열의 길이
		//첫해의 1월에 강우량 100을 저장
		rain[0][0]=100;
		//마지막 3년차의 12월에 강우량 150을 저장
		rain[2][11]=150;
		System.out.println(rain[2][11]);
		System.out.println("********************");
		
		//경기 중학고 총 3학년. 1학년 3개반, 2학년 4개반, 3학년 6개반
		int[][]school=new int[3][]; //1차원(1학년,2학년,3학년) 정해줌
	 	school[0]=new int[3];//1학년 -> 3개반 생성
	 	school[1]=new int[4];//2학년 -> 4개반 생성
	 	school[2]=new int[6];//3학년 -> 5개반 생성
	 	
	 	//경기 중학교 마지막 학년의 마지막 반에 20명을 할당
	 	school[2][5]=20; //3학년 6반
	 	int i=school.length-1; //2 //학년의 마지막 인덱스 // length는 총 길이이고 
	 	int j=school[i].length-1;//5 //반의 마지막 인덱스 // index는 0부터 시작하므로 -1을 해준다
	 	System.out.println(school[i][j]); 
	 	System.out.println(school[2][5]);
	 	
	}

}


