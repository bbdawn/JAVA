package step5;

public class ForLoopService {
	/*
	 * 테라 1잔
	 * 테라 2잔
	 * 테라 ...
	 * 테라 11잔
	 */
	public void printInfo(String item, int count) {
		//for loop를 이용해 출력
		for(int i=1; i<=count; i++) {
			System.out.println(item+" "+i+"잔");
		}//for
	}

	//반복되다가 limit과 같을 경우 반복문을 벗어나게 한다.
	//테라 1잔 ~~~ 3잔
	//break 사용
	public void printInfo2(String item, int count, int limit) {
		for(int i=1; i<=count; i++) {
			System.out.println(item+" "+i+"잔");
			if(i==limit) {
				System.out.println("치사랑");
				break;
			}//if
		}//for
	}
}//class
