package step13;
/*
 * 	멀티 스레딩시 동기화 처리를 적용하는 예제 
 *  
 *  하나의 화장실 좌석에 하나의 손님(스레드)만 사용할 수 있도록 동기화 처리를 한다 
 *  
 *  동기화 처리 : synchronized keyword를 이용해 특정 영역을 단일 스레드 환경으로 만드는 것 
 */
public class TestThread12 {
	public static void main(String[] args) {
		Toilet toilet=new Toilet();
		Thread t1=new Thread(toilet,"박보검");
		Thread t2=new Thread(toilet,"강하늘");
		Thread t3=new Thread(toilet,"유희열");
		t1.start();
		t2.start();
		t3.start();
	}
}
