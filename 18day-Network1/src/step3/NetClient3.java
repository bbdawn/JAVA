package step3;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import common.IP;

// ������ �����ؼ� �޼����� ����ϰ� �����ϴ� Ŭ���̾�Ʈ ���α׷� 
public class NetClient3 {
	public void go() throws UnknownHostException, IOException {
		//Socket socket=new Socket("127.0.0.1",5432);
		Socket socket=new Socket(IP.INST,5432);
		System.out.println("**NetClient3 ����**");
		//������ �޼����� ����ϱ� ���� ��Ʈ�� ���� 
		PrintWriter pw=new PrintWriter(socket.getOutputStream(),true);//true : autoflush
		pw.println("��� �����ϼ̽��ϴ�^^");
		System.out.println("**NetClient3 ������ �޼��� ���� �� ����**");
		pw.close();
		socket.close();
	}
	public static void main(String[] args) {
		NetClient3 client=new NetClient3();
		try {
			client.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
