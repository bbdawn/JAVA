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
package step7.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChatClient {
	private Socket socket;
	private BufferedReader br;//ģ������ �޼����� �Է�
	private Scanner scanner;//�ֿܼ��� �޼����� �Է�
	private PrintWriter pw;//�ڽ��� �޼����� ������ ���
	public void go() throws UnknownHostException, IOException {//��Ĺ�����ϱ� 
		try {
		socket=new Socket("127.0.0.1",5432);
		br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		scanner=new Scanner(System.in);
		pw=new PrintWriter(socket.getOutputStream(),true);
		
		//1. ReceiverWorker Thread ����, setDaemon(true), start()
		//2. ��ĳ�ʷκ��� �Է¹޾� ������ ���(exit �Է¹��������� ����)
		
		}finally {
			if(scanner!=null)
				scanner.close();
			if(socket!=null)
				socket.close();
		}
	
	}
	
	//Nested Class�� ReceiverWorker�� ����
	public class ReceiverWorker implements Runnable{

		@Override
		public void run() {
			receiveMessage();
			
		}
		
		//�����κ��� �޼����� �Է¹޾� �ֿܼ� ���(��� �ݺ�)
		public void receiveMessage() {
			
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























