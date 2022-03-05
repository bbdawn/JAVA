package step5.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public void go() throws IOException {
		ServerSocket serverSocket=null;//대표전화
		Socket socket=null;//상담원전화
		BufferedReader br=null;//클라이언트로부터 입력받기 위한 스트림 
		PrintWriter pw=null;//클라이언트로 출력하기 위한 스트림 
		try {
			serverSocket=new ServerSocket(5432);
			System.out.println("**EchoServer 실행중**");
			socket=serverSocket.accept();
			String clientIp=socket.getInetAddress().toString();
			System.out.println(clientIp+"님이 입장하셨습니다");
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw=new PrintWriter(socket.getOutputStream(),true);//autoflush  println() 즉시 출력 
			while(true) { //지속적 대화를 위해 반복 
				String message=br.readLine();//클라이언트가 보낸 메세지를 입력받는다
				if(message==null||message.equals("exit")) {
					System.out.println(clientIp+"님이 나가셨습니다");
					break;
				}//if
				System.out.println(clientIp+"님의 메세지:"+message);
				pw.println(message+"*server*");//클라이언트에게 메세지를 출력한다 
			}//while
		}finally {
			System.out.println("**EchoServer 종료**");
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






