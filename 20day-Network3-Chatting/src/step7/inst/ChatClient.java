/*
��Ƽ�������� ������ Ŭ���̾�Ʈ���� �� �ʿ����� �����ϱ�
	step7
	1. ä��Ŭ���̾�Ʈ : ��½�����(�ڽ��� �޼����� ������ ���) + �Է½�����(ģ������ �޼����� �����κ��� �Է�)
						-> �� �ΰ��� ��������� ���ÿ� ����(��Ƽ������)�Ǿ�� ��Ȱ�� ä���� �ȴ�
						
						��½����� -> ChatClient main thread�� ���
						�Է½����� -> ReceiverWorker thread�� ���
						
			ChatClient class : 
									go()����{
									Socket ����
									ReceiverWorker Thread ����
									setDaemon(true) -> ChatClient�� ����Ǹ� Receiver Worker Thread ���� �Բ� ����ǵ��� ����
									start()
									������ �ڽ��� �޼����� ����ϴ� ��� ���� (Scanner�κ��� �Է¹޾� ������ ����, exit�� �Է¹����� �����)
									}
			ReceiverWorker Nested(inner) class : run()����
												 receiveMessage() -> Socket�� �̿��ؼ� ģ������ �޼����� �Է¹޾� �ֿܼ� ����ϴ� �۾��� �����Ѵ�
 
 
 
 
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
	private BufferedReader br;//ģ������ �޼����� �Է�
	private Scanner scanner;//�ֿܼ��� �޼����� �Է�
	private PrintWriter pw;//�ڽ��� �޼����� ������ ���
	public void go() throws UnknownHostException, IOException {//��Ĺ�����ϱ� 
		try {
		//socket=new Socket("127.0.0.1",5432);
		socket=new Socket(IP.INST,5432);
		br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		scanner=new Scanner(System.in);
		pw=new PrintWriter(socket.getOutputStream(),true);
		
		System.out.println("**ChatClient ����**");
		//1. ReceiverWorker Thread ����, setDaemon(true), start()
		ReceiverWorker worker=new ReceiverWorker();
		Thread receiverThread=new Thread(worker);//ģ������ �޼����� �����κ��� �Է¹޴� ������(�ϲ�)�� �����Ѵ�
		receiverThread.setDaemon(true);//�ڽ�(receiveThread)�� �����Ų ������(main thread_ChatClient)�� ����Ǹ� �Բ� ����ǵ��� ����
		receiverThread.start();//�ϲ۵� �� ��Ű�� ����!
		
		
		//2. ��ĳ�ʷκ��� �Է¹޾� ������ ���(exit �Է¹��������� ����)
		while(true) {
			String message=scanner.nextLine();
			pw.println(message);
			if(message.equals("exie")) {
				break;
			}
					
		}//while
		
		
		}finally {
			System.out.println("**ChatClient ����**");
			if(scanner!=null)
				scanner.close();
			if(socket!=null)
				socket.close();
		}//finally
	
	}
	
	//Nested Class�� ReceiverWorker�� ����
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
		
		//�����κ��� �޼����� �Է¹޾� �ֿܼ� ���(��� �ݺ�)
		public void receiveMessage() throws IOException {
			while(true) {//ģ������ �޼����� ���������� ��� ����Ǳ�
				
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























