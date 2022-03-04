package step06;
/*
 * 하나의 Runnable 하위 클래스에서 다수의 스레드를 생성해서 실행하는 예제
 * 
 * step05에서는 채팅클라이언트 process를 가정했다면 각각의 일이 다른 두개의 스레드 (입력스레드, 출력스레드)를 정의하고
 * 				두개의 스레드를 실행
 * step06에서는 채팅서버 process를 가정한다면 동일한 채팅 서비스를 정의하고 "클라이언트의 수만큼 여러개의 스레드"를 실행
 *	ex) 구글 검색서비스에 다수의 클라이언트가 동시에 입장해서 서비스를 받으면
 *		다수의 클라이언트에게 각각의 검색 서비스를 동시에 처리해야한다
 */
public class TestThread06 {	
	public static void main(String[] args) {
		System.out.println("**main thread 실행**");
		ServerWorker worker=new ServerWorker();
		Thread t1=new Thread(worker,"A 고객상담");
		t1.start();//실행가능상태로 보낸다
		Thread t2=new Thread(worker,"B 고객상담");
		t2.start();//실행가능상태로 보낸다
		Thread t3=new Thread(worker,"C 고객상담");
		t3.start();//실행가능상태로 보낸다
		System.out.println("**main thread 종료**");
	}
}
