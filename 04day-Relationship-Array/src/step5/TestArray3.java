package step5;

public class TestArray3 {

	public static void main(String[] args) {
		// 배열의 선언 생성 할당을 동시에
		int[]point={700, 200, 400, 900, 1000};
		int num = 500;
		
		//point 배열 요소 중 num을 초과하는 요소들만 출력
		//for loop, if
		for(int i=0; i<point.length; i++) {
			if(point[i]>num) {
				System.out.println(point[i]);
			}//if
		}//for
		
	}
}
