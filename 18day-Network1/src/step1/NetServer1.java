package step1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetServer1 {
	public void go() throws IOException {
		//��ǥ��ȭ
		ServerSocket serverSocket=new ServerSocket(5432);
		System.out.println("**NetServer1 ����**");
		//Ŭ���̾�Ʈ ���� ����ϴ� �����ϸ� ����ȴ�
		//���� �� ��ȯ�Ǵ� ������ ���� Ŭ���̾�Ʈ�� ����� ���� �����̴� 
		//�Ʒ� ������ Ŭ���̾�Ʈ�� ���� ����ϴ� ��ȭ�� 
		Socket socket=serverSocket.accept();
		System.out.println("**client�� ������ ������**");
		//������ Ŭ���̾�Ʈ���� �޼����� ����Ѵ� 
		PrintWriter pw=new PrintWriter(socket.getOutputStream(),true);//autoflush : println() ��� Ŭ���̾�Ʈ�� ��� 
		pw.println("��ſ� ����� �����Դϴ�");
		pw.close();
		socket.close();
		serverSocket.close();
		System.out.println("**NetServer1 ����**");
	}
	public static void main(String[] args) {
		NetServer1 server=new NetServer1();
		try {
			server.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
