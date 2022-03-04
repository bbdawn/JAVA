package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class NetClient1 {
	public void go() throws UnknownHostException, IOException {
		//������ ���� 
		Socket socket=new Socket("127.0.0.1",5432);
		System.out.println("**NetClient1 ����**");
		//������ ���� �޼����� �Է¹޾� �ڽ��� �ֿܼ� ����Ѵ� 
		//ByteStream�� CharacterStream���� ��ȯ�ϴ� ProcessStream : InputStreamReader�� �̿�
		InputStreamReader ir=new InputStreamReader(socket.getInputStream());
		BufferedReader br=new BufferedReader(ir);
		String message=br.readLine();
		System.out.println("������ ���� �޼���:"+message);
		br.close();
		socket.close();
		System.out.println("**NetClient1 ����**");
	}
	public static void main(String[] args) {
		NetClient1 client=new NetClient1();
		try {
			client.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}








