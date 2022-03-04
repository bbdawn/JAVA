package step2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetServer2 {
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("**NetServer2 ������**");
			int count=1;
			while (true) {
				Socket socket = serverSocket.accept();// ����ϴ� Ŭ���̾�Ʈ �����ϸ� ����
				String clientIp=socket.getInetAddress().toString();//������ Ŭ���̾�Ʈ ip�� �޾ƿ´�
				PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
				pw.println(clientIp+"�� �ݰ�����! "+count);
				System.out.println(clientIp+" client���� �޼����� ���! "+count);
				count++;
				pw.close();
				socket.close();
			}
		} finally {
			if (serverSocket != null)
				serverSocket.close();
		}
	}

	public static void main(String[] args) {
		NetServer2 server = new NetServer2();
		try {
			server.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
