package step14;
// 멀티 스레드 환경에서 동기화 처리의 필요성 및 처리의 예 
// synchronzied 를 이용한 동기화 처리를 하지 않으면
//같은 좌석을 예매하게 된다 -> 동기화 처리가 필요!
// reserve() 메서드에 synchronized를 명시하지 않는 것과
// 하는 것의 실행결과를 비교해본다 
public class TestThread13 {
	public static void main(String[] args) {
		Theater theater=new Theater();
		Thread t1=new Thread(theater,"박보검");
		Thread t2=new Thread(theater,"강하늘");
		t1.start();
		t2.start();
	}
}
