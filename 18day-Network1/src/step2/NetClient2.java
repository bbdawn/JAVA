package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

import common.IP;

public class NetClient2 {
	public void go() throws UnknownHostException, IOException {
		//������ ���� 
		Socket socket=new Socket(IP.INST,5432);//���� ������ �����غ��� 
		System.out.println("**NetClient2 ����**");
		//������ ���� �޼����� �Է¹޾� �ڽ��� �ֿܼ� ����Ѵ� 
		//ByteStream�� CharacterStream���� ��ȯ�ϴ� ProcessStream : InputStreamReader�� �̿�
		InputStreamReader ir=new InputStreamReader(socket.getInputStream());
		BufferedReader br=new BufferedReader(ir);
		String message=br.readLine();
		System.out.println("������ ���� �޼���:"+message);
		br.close();
		socket.close();
		System.out.println("**NetClient2 ����**");
	}
	public static void main(String[] args) {
		NetClient2 client=new NetClient2();
		try {
			client.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}








