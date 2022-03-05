package step6.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
//실제 개별 클라이언트와 통신하는 객체 ( 메아리 서비스 제공 )
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
		System.out.println(clientIp+"님 입장하셨습니다");
		try {
			echo();
		} catch (IOException e) {
			System.out.println(clientIp+"님 강제종료 "+e.getMessage());
		}		
		System.out.println(clientIp+"님 나가셨습니다");
	}
	public void echo() throws IOException {
		BufferedReader br=null;
		PrintWriter pw=null;
		try {
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw=new PrintWriter(socket.getOutputStream(),true);//true autoflush
			while(true) {
				String message=br.readLine();//클라이언트로부터 입력
				if(message==null||message.equals("exit")) {
					break;
				}
				System.out.println(clientIp+":"+message);
				pw.println(message+"*server*");//클라이언트로 출력
			}
		}finally {
			if(pw!=null)
				pw.close();
			if(br!=null)
				br.close();
		}
	}//echo
}//class













