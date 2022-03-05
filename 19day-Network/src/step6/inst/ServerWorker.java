package step6.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
//���� ���� Ŭ���̾�Ʈ�� ����ϴ� ��ü ( �޾Ƹ� ���� ���� )
public class ServerWorker implements Runnable{
	private Socket socket;
	private String clientIp;
	public ServerWorker(Socket socket) {
		super();
		this.socket = socket;
	}
	@Override
	public void run() {
		clientIp=socket.getInetAddress().toString();
		System.out.println(clientIp+"�� �����ϼ̽��ϴ�");
		try {
			echo();
		} catch (IOException e) {
			System.out.println(clientIp+"�� �������� "+e.getMessage());
		}		
		System.out.println(clientIp+"�� �����̽��ϴ�");
	}
	public void echo() throws IOException {
		BufferedReader br=null;
		PrintWriter pw=null;
		try {
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw=new PrintWriter(socket.getOutputStream(),true);//true autoflush
			while(true) {
				String message=br.readLine();//Ŭ���̾�Ʈ�κ��� �Է�
				if(message==null||message.equals("exit")) {
					break;
				}
				System.out.println(clientIp+":"+message);
				pw.println(message+"*server*");//Ŭ���̾�Ʈ�� ���
			}
		}finally {
			if(pw!=null)
				pw.close();
			if(br!=null)
				br.close();
		}
	}//echo
}//class













