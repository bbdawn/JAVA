package step7.inst;

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
			while(true) {
				Socket socket=serverSocket.accept();
				ServerWorker serverWorker=new ServerWorker(socket);
				list.add(serverWorker);
				Thread thread=new Thread(serverWorker);
				thread.start();
			}
			
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
		for(int i=0; i<list.size();i++) {
			list.get(i).pw.println(message);//������ ��� Ŭ���̾�Ʈ���� �޼����� ����Ѵ� 
		}
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
					broadcast(clientIp+"���� �����̽��ϴ�");
				}//if	
			}//finally			
		}//run
		public void chatting() throws IOException {
			clientIp=socket.getInetAddress().toString();
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw=new PrintWriter(socket.getOutputStream(),true);
			broadcast(clientIp+"���� �����ϼ̽��ϴ�");//���������� ������ ��� ����ڿ��� �˸��� 
			while(true) {
				String message=br.readLine();
				if(message==null||message.equals("exit")) {
					break;
				}//if
				broadcast(clientIp+"��: "+message);//��� ä��Ŭ���̾�Ʈ���� �޼����� ����Ѵ� 
			}//while
			
		}//chatting method
	}//nested class
	public static void main(String[] args) {
		try {
			new ChatServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

















