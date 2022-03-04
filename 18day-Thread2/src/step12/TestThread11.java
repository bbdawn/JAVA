package step12;
/*
 *  여러 개의 스레드가 데이터를 공유할 수 있다 ( 멀티 스레드 장점 )
 *  하나의 자원을 여러 스레드가 공유해서 사용할 때 반드시 확인해야 하는 점이 있다 
 *  하나의 자원을 공유하여 사용할 때 발생할 수 있는 문제에 대해 확인하는 예제 
 *  -> 멀티 스레딩시 동기화 처리의 필요성에 대한 예제 
 *  
 *  예) 카페에 하나의 화장실 좌석이 있고 
 *  여러 손님이 화장실을 사용하고자 할 때 발생할 수 있는 문제 
 *  아래 코드를 실행해보면 화장실 좌석이 하나인데 여러 손님이 함께 사용하게 되는
 *  상황임 
 *  
 *  step13.TestThread12 에서 이러한 문제를 해결해보자 
 */
public class TestThread11 {
	public static void main(String[] args) {
		Toilet toilet=new Toilet();//공유자원
		Thread t1=new Thread(toilet,"박보검");
		Thread t2=new Thread(toilet,"강하늘");
		t1.start();
		t2.start();
	}
}
