package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

// review 
// ������ ����ϴٰ� Ŭ���̾�Ʈ�� �����Ͽ� �޼����� ����ϸ� �� �޼����� �Է¹޾� �ֿܼ� ����ϴ� ��� 
// �ټ��� Ŭ���̾�Ʈ���� �޼����� �Է��ϱ� ���� accept() �κ��� �ݺ��Ѵ� 
// �ټ��� Ŭ���̾�Ʈ�� ���� ������ �ƴ϶� ���������� �����ϴ� ���� 
public class NetServer4 {
	public void go() throws IOException {
		ServerSocket serverSocket=null;
		try {
			serverSocket=new ServerSocket(5432);
			System.out.println("**NetServer4 ������**");
			while(true) {// ���� Ŭ���̾�Ʈ�� ������ ���������� ó���Ѵ� 
			//����ϴ� Ŭ���̾�Ʈ �����ϸ� ����, ���� Ŭ���̾�Ʈ�� ����� ���� ��ü�� ��ȯ
			Socket socket=serverSocket.accept();
			String clientIp=socket.getInetAddress().toString();
			System.out.println(clientIp+"�� �����ϼ̽��ϴ�");
			//Ŭ���̾�Ʈ�� ���� �޼����� �Է¹޴´� ( InputStreamReader : ByteStream�� CharacterStream ��ȯ�ϴ� Processing Stream
			BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println(clientIp+"���� �޼���:"+br.readLine());
			br.close();
			socket.close();
			}
		}finally {
			if(serverSocket!=null)
				serverSocket.close();
		}
	}
	public static void main(String[] args) {
		NetServer4 server=new NetServer4();
		try {
			server.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
