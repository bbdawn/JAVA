package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

// 클라이언트가 보낸 메세지를 입력받아 화면에 출력하는 역할 
public class NetServer3 {
	public void go() throws IOException {
		ServerSocket serverSocket=null;
		try {
			serverSocket=new ServerSocket(5432);
			System.out.println("**NetServer3 실행**");
			//다수의 클라이언트에게 서비스 하기 위해 accept() 및 입력 작업을 반복한다 
			while(true) {
			Socket socket=serverSocket.accept();//client 접속하면 실행, 실제 클라이언트와 통신할 일반소켓을 반환 
			String clientIp=socket.getInetAddress().toString();//현재 접속한 client ip를 반환받는다 
			//클라이언트가 보낸 메세지를 입력받기 위한 스트림을 생성한다 
			BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String message=br.readLine();
			System.out.println(clientIp+"님의 메세지:"+message);
			br.close();
			socket.close();
			}			
		}finally {
			if(serverSocket!=null)
				serverSocket.close();
		}
	}
	public static void main(String[] args) {
		NetServer3 server=new NetServer3();
		try {
			server.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}







