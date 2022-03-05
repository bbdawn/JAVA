package step5.inst;

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
		BufferedReader br=null;//Ŭ���̾�Ʈ�κ��� �Է¹ޱ� ���� ��Ʈ�� 
		PrintWriter pw=null;//Ŭ���̾�Ʈ�� ����ϱ� ���� ��Ʈ�� 
		try {
			serverSocket=new ServerSocket(5432);
			System.out.println("**EchoServer ������**");
			socket=serverSocket.accept();
			String clientIp=socket.getInetAddress().toString();
			System.out.println(clientIp+"���� �����ϼ̽��ϴ�");
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw=new PrintWriter(socket.getOutputStream(),true);//autoflush  println() ��� ��� 
			while(true) { //������ ��ȭ�� ���� �ݺ� 
				String message=br.readLine();//Ŭ���̾�Ʈ�� ���� �޼����� �Է¹޴´�
				if(message==null||message.equals("exit")) {
					System.out.println(clientIp+"���� �����̽��ϴ�");
					break;
				}//if
				System.out.println(clientIp+"���� �޼���:"+message);
				pw.println(message+"*server*");//Ŭ���̾�Ʈ���� �޼����� ����Ѵ� 
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






