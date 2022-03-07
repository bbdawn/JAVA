/*
멀티스레딩이 서버와 클라이언트에서 왜 필요한지 이해하기
	step7
	1. 채팅클라이언트 : 출력스레드(자신의 메세지를 서버로 출력) + 입력스레드(친구들의 메세지를 서버로부터 입력)
						-> 이 두개의 실행단위가 동시에 실행(멀티스레드)되어야 원활한 채팅이 된다
						
						출력스레드 -> ChatClient main thread가 담당
						입력스레드 -> ReceiverWorker thread가 담당
						
			ChatClient class : 
									go()구현{
									Socket 생성
									ReceiverWorker Thread 생성
									setDaemon(true) -> ChatClient가 종료되면 Receiver Worker Thread 또한 함께 종료되도록 설정
									start()
									서버로 자신의 메세지를 출력하는 기능 정의 (Scanner로부터 입력받아 서버로 지속, exit를 입력받으면 종료됨)
									}
			ReceiverWorker Nested(inner) class : run()정의
												 receiveMessage() -> Socket을 이용해서 친구들의 메세지를 입력받아 콘솔에 출력하는 작업을 지속한다
 
 
 
 
 */
package step7.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import common.IP;

public class ChatClient {
	private Socket socket;
	private BufferedReader br;//친구들의 메세지를 입력
	private Scanner scanner;//콘솔에서 메세지를 입력
	private PrintWriter pw;//자신의 메세지를 서버로 출력
	public void go() throws UnknownHostException, IOException {//소캣생성하기 
		try {
		//socket=new Socket("127.0.0.1",5432);
		socket=new Socket(IP.INST,5432);
		br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		scanner=new Scanner(System.in);
		pw=new PrintWriter(socket.getOutputStream(),true);
		
		System.out.println("**ChatClient 실행**");
		//1. ReceiverWorker Thread 생성, setDaemon(true), start()
		ReceiverWorker worker=new ReceiverWorker();
		Thread receiverThread=new Thread(worker);//친구들의 메세지를 서버로부터 입력받는 스레드(일꾼)을 생성한다
		receiverThread.setDaemon(true);//자신(receiveThread)을 실행시킨 스레드(main thread_ChatClient)가 종료되면 함께 종료되도록 설정
		receiverThread.start();//일꾼들 일 시키기 시작!
		
		
		//2. 스캐너로부터 입력받아 서버로 출력(exit 입력받을때까지 지속)
		while(true) {
			String message=scanner.nextLine();
			pw.println(message);
			if(message.equals("exie")) {
				break;
			}
					
		}//while
		
		
		}finally {
			System.out.println("**ChatClient 종료**");
			if(scanner!=null)
				scanner.close();
			if(socket!=null)
				socket.close();
		}//finally
	
	}
	
	//Nested Class로 ReceiverWorker를 정의
	public class ReceiverWorker implements Runnable{

		
		@Override
		public void run() {
			try {
			receiveMessage();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			
		}
		
		//서버로부터 메세지를 입력받아 콘솔에 출력(계속 반복)
		public void receiveMessage() throws IOException {
			while(true) {//친구들의 메세지가 있을때까지 계속 실행되기
				
					String message=br.readLine();
					if(message==null)
						break;
					System.out.println(message);
		}	
	}
	public static void main(String[] args) {
		try {
			new ChatClient().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}























