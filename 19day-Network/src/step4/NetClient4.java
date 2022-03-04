package step4;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import common.IP;

public class NetClient4 {
	public void go() throws IOException {
		Socket socket=new Socket(IP.INST,5432);
		System.out.println("**NetClient4 ������ ����**");
		PrintWriter pw=new PrintWriter(socket.getOutputStream(),true);//true: autoflush�� println()���� ��� ����ϴ� ����
		//�ַܼκ��� �Է¹ޱ� ���� ��ĳ�� ����
		Scanner scanner=new Scanner(System.in);
		System.out.print("������ ���� �޼���: ");
		String message=scanner.nextLine();
		pw.println(message);//������ ���� 
		System.out.println("������ ���ۿϷ�");
		scanner.close();
		pw.close();
		socket.close();
		System.out.println("**NetClient4 ����**");
	}
	
	public static void main(String[] args) {
		NetClient4 client=new NetClient4();
		try {
			client.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
