package step7.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/*
 2. 채팅 서버 :  다수의 클라이언트에게 채팅 서비스를 하는 서버 
    
    	ChatServer :  ArrayList<ServerWorker> 생성 
    					go(){
    					ServerSocket 생성 
    					while loop{
    					accept() 
    					ServerWorker 생성 ( sockt 할당 ) 
    					list.add(serverWorker);
    					thread 생성 후 start()     					
    					}
						}
						public void broadcast(message){
							for loop -> 리스트 안에 있는 ServerWorker의 socket에 연결된 
										 PrintWriter를 이용해 접속한 모든 클라이언트에게 메세지를 출력 
						}
						
		ServerWorker( Nested Class) : Socket 				
					 					   run(){}
					 					   chatting(){
					 					   	//클라이언트 메세지 입력받는다 , exit 이면 종료한다 
					 					   	//입력받은 메세지를 broadcast() 를 이용해 모든 클라이언트에게 전달한다 
					 					   	//종료시점에 list.remove(this) 처리 후 누구님 나가셨습니다를 모든 클라이언트에게 알린다 
					 					   }	 	

 */
public class ChatServer {
	//개별 클라이언트와 연결되어 통신하는 작업자의 역할을 하는 ServerWorker를 리스트에 저장하여 관리 
	private ArrayList<ServerWorker> list=new ArrayList<ServerWorker>();
	public void go() throws IOException {
		ServerSocket serverSocket=null;
		try{
			serverSocket=new ServerSocket(5432);
			System.out.println("**ChatServer 실행**");
			//////////////이 부분에 코드 작성하기!////////////////////
			
		}finally {
			if(serverSocket!=null)
				serverSocket.close();
		}
	}//go method 
	/*
	 *  접속한 모든 클라이언트에게 메세지를 출력하는 메서드 
	 *  list에 저장된 ServerWorker의 PrintWriter 를 이용해서 개별 클라이언트가 입력받은 
	 *  메세지를 println() 한다 
	 */
	public void broadcast(String message) {
		///////////이 부분에 코드 작성하기!////////////////
	}
	//nested class
	public class ServerWorker implements Runnable{
		private Socket socket;	
		private String clientIp;
		private BufferedReader br;
		private PrintWriter pw;
		
		public ServerWorker(Socket socket) {
			super();
			this.socket = socket;
		}
		@Override
		public void run() {
			try {
				chatting();
			} catch (IOException e) {
				System.out.println(clientIp+" 예외발생 "+e.getMessage());
			} finally {
				if(socket!=null) {
					try {
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}//catch
					list.remove(this);//현재 객체가 리스트에서 삭제된다 
					//broadcast method를 이용해 clientIp 님이 나가셨습니다 메세지를 알린다 
				}//if	
			}//finally			
		}//run
		public void chatting() throws IOException {
			clientIp=socket.getInetAddress().toString();
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw=new PrintWriter(socket.getOutputStream(),true);
			//////////////이 부분에 코드 작성하기!//////////////////
		}
	}
	public static void main(String[] args) {
		try {
			new ChatServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

















