package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
	public void go() throws IOException {
		Socket socket=null;
		Scanner scanner=null;//�ֿܼ��� �Է�
		PrintWriter pw=null;//������ ���
		BufferedReader br=null;//�������� �Է�
		
		try {
			socket=new Socket("127.0.0.1",5432);
			System.out.println("**EchoClient�� ������ ����**");
			scanner=new Scanner(System.in);
			pw=new PrintWriter(socket.getOutputStream(),true);//true-> autoflush() //println()�������ǹ���
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true) {//���������� ������� ���� �ݺ��� ���
				System.out.println("������ ���� �޼���");
				String message=scanner.nextLine();//�ֿܼ��� �Է��ϰ�
				pw.println(message);//������ ���
				if(message.equals("exit")) {
					System.out.println("**EchoClient �����մϴ� **");
					break;
				}
				String response=br.readLine();//������ ���� �޼����� �Է¹޴´� 
				System.out.println("�������� �Է¹��� �޼���: "+response);
			}
		
		}finally {
			if(br!=null)
				br.close();
			if(pw!=null)
				pw.close();
			if(scanner!=null)
				scanner.close();
			if(socket!=null)
				socket.close();
		}
	}
	public static void main(String[] args) {
		EchoClient client=new EchoClient();
		try {
			client.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
