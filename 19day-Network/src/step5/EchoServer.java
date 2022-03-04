package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public void go() throws IOException {
		ServerSocket serverSocket=null;//��ǥ��ȭ
		Socket socket=null;//������ȭ
		BufferedReader br=null;//Ŭ���̾�Ʈ�κ��� �Է��� �ޱ� ���� ��Ʈ��
		PrintWriter pw=null;//Ŭ���̾�Ʈ�� ����ϱ� ���� ��Ʈ��
		try {
			serverSocket=new ServerSocket(5432);
			System.out.println("EchoServer ������");
			socket=serverSocket.accept();
			String clientIp=socket.getInetAddress().toString();
			System.out.println(clientIp+"���� �����ϼ̽��ϴ�");
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw=new PrintWriter(socket.getOutputStream(),true);//true->autoflush println()��� ����ϴ� ����. close�ϸ� ��µǴ°� �ƴ϶� �ٷιٷ� ��µǾ���ϱ� ���� 
			while(true) {
				String message=br.readLine();//Ŭ���̾�Ʈ�� ���� �޼����� �Է¹޴´�
				if(message==null||message.equals("exit")) {
					System.out.println(clientIp+"���� �����̽��ϴ�");
					break;
				}//if
				//������ ����ϱ�
				System.out.println(clientIp+"���� �޼���: "+message);
				pw.println(message+"*server*");//Ŭ���̾�Ʈ�� ���� �޼����� ����Ѵ�
			}//while
		}finally {
			System.out.println("**EchoServer ����**");
			if(pw!=null)
				pw.close();
			if(br!=null)
				br.close();
			if(socket!=null)
				socket.close();
			if(serverSocket!=null)
				serverSocket.close();
			
		}
	}
	public static void main(String[] args) {
		EchoServer server=new EchoServer();
		try {
			server.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
