// 다수의 스레드가 공유 자원을 이용할 수 있다는 것을 확인하는 예제 

package step11;

public class TestThread10 {
	public static void main(String[] args) {
		SearchServiceWorker sw=new SearchServiceWorker();
		Thread t1=new Thread(sw,"1번 고객에 대한 검색서비스 일꾼 스레드");//일꾼스레드. 직원 
		Thread t2=new Thread(sw,"2번 고객에 대한 검색서비스 일꾼 스레드");
		Thread t3=new Thread(sw,"3번 고객에 대한 검색서비스 일꾼 스레드");
		t1.start();
		t2.start();
		t3.start();
	}
}
