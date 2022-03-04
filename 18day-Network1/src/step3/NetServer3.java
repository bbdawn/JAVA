package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

// Ŭ���̾�Ʈ�� ���� �޼����� �Է¹޾� ȭ�鿡 ����ϴ� ���� 
public class NetServer3 {
	public void go() throws IOException {
		ServerSocket serverSocket=null;
		try {
			serverSocket=new ServerSocket(5432);
			System.out.println("**NetServer3 ����**");
			//�ټ��� Ŭ���̾�Ʈ���� ���� �ϱ� ���� accept() �� �Է� �۾��� �ݺ��Ѵ� 
			while(true) {
			Socket socket=serverSocket.accept();//client �����ϸ� ����, ���� Ŭ���̾�Ʈ�� ����� �Ϲݼ����� ��ȯ 
			String clientIp=socket.getInetAddress().toString();//���� ������ client ip�� ��ȯ�޴´� 
			//Ŭ���̾�Ʈ�� ���� �޼����� �Է¹ޱ� ���� ��Ʈ���� �����Ѵ� 
			BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String message=br.readLine();
			System.out.println(clientIp+"���� �޼���:"+message);
			br.close();
			socket.close();
			}			
		}finally {
			if(serverSocket!=null)
				serverSocket.close();
		}
	}
	public static void main(String[] args) {
		NetServer3 server=new NetServer3();
		try {
			server.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}







