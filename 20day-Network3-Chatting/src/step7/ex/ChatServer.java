package step7.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/*
 2. ä�� ���� :  �ټ��� Ŭ���̾�Ʈ���� ä�� ���񽺸� �ϴ� ���� 
    
    	ChatServer :  ArrayList<ServerWorker> ���� 
    					go(){
    					ServerSocket ���� 
    					while loop{
    					accept() 
    					ServerWorker ���� ( sockt �Ҵ� ) 
    					list.add(serverWorker);
    					thread ���� �� start()     					
    					}
						}
						public void broadcast(message){
							for loop -> ����Ʈ �ȿ� �ִ� ServerWorker�� socket�� ����� 
										 PrintWriter�� �̿��� ������ ��� Ŭ���̾�Ʈ���� �޼����� ��� 
						}
						
		ServerWorker( Nested Class) : Socket 				
					 					   run(){}
					 					   chatting(){
					 					   	//Ŭ���̾�Ʈ �޼��� �Է¹޴´� , exit �̸� �����Ѵ� 
					 					   	//�Է¹��� �޼����� broadcast() �� �̿��� ��� Ŭ���̾�Ʈ���� �����Ѵ� 
					 					   	//��������� list.remove(this) ó�� �� ������ �����̽��ϴٸ� ��� Ŭ���̾�Ʈ���� �˸��� 
					 					   }	 	

 */
public class ChatServer {
	//���� Ŭ���̾�Ʈ�� ����Ǿ� ����ϴ� �۾����� ������ �ϴ� ServerWorker�� ����Ʈ�� �����Ͽ� ���� 
	private ArrayList<ServerWorker> list=new ArrayList<ServerWorker>();
	public void go() throws IOException {
		ServerSocket serverSocket=null;
		try{
			serverSocket=new ServerSocket(5432);
			System.out.println("**ChatServer ����**");
			//////////////�� �κп� �ڵ� �ۼ��ϱ�!////////////////////
			
		}finally {
			if(serverSocket!=null)
				serverSocket.close();
		}
	}//go method 
	/*
	 *  ������ ��� Ŭ���̾�Ʈ���� �޼����� ����ϴ� �޼��� 
	 *  list�� ����� ServerWorker�� PrintWriter �� �̿��ؼ� ���� Ŭ���̾�Ʈ�� �Է¹��� 
	 *  �޼����� println() �Ѵ� 
	 */
	public void broadcast(String message) {
		///////////�� �κп� �ڵ� �ۼ��ϱ�!////////////////
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
				System.out.println(clientIp+" ���ܹ߻� "+e.getMessage());
			} finally {
				if(socket!=null) {
					try {
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}//catch
					list.remove(this);//���� ��ü�� ����Ʈ���� �����ȴ� 
					//broadcast method�� �̿��� clientIp ���� �����̽��ϴ� �޼����� �˸��� 
				}//if	
			}//finally			
		}//run
		public void chatting() throws IOException {
			clientIp=socket.getInetAddress().toString();
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw=new PrintWriter(socket.getOutputStream(),true);
			//////////////�� �κп� �ڵ� �ۼ��ϱ�!//////////////////
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

















