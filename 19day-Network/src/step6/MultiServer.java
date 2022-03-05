package step6;

import java.io.IOException;
import java.net.ServerSocket;

/*
 	step6
	다수의 클라이언트에게 메아리 서비스하는 서버를 구현 
	서버 : step6.MultiServer - ServerWorker 
	클라이언트 : step5의 EchoClient와 동일 
	
	하나의 서버가 지속적으로 접속을 유지하면서 다수의 클라이언트에게 서비스 하기 위해서는
	프로세스 내부의 실행단위인 Thread를 이용해야 한다 ( 멀티 스레딩 ) 
	( 예 - 콜센터에서 다수의 고객과 상담서비스를 진행하기 위해서는 다수의 직원이 필요하다 ) 
	
	MultiServer 는 클라이언트의 접속을 대기하다가 클라이언트가 접속하면 소켓을 반환,
	ServerWorker(socket)를 이용해 Thread 를 생성하고 start() 시킨다
	이러한 작업을 클라이언트 접속시마다 반복 
	
	ServerWorker 는 실제 개별 클라이언트와 통신하는 클래스 ( 메아리 서비스 )
	할당받은 소켓을 이용해 run() 메서드에서 클라이언트의 메세지를 입력받고 다시 출력하는 작업을 반복
	
	서버소켓 생성 
	while loop{ 
	accept();
	ServerWorker 생성, 생성시 소켓할당 
	Thread 생성 
	start()
	}
 */
public class MultiServer {
	public void go() throws IOException {
		ServerSocket serverSocket=null;
		try {
			//
		}finally {
			if(serverSocket!=null)
				serverSocket.close();
		}
	}
	public static void main(String[] args) {
		try {
			new MultiServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}











