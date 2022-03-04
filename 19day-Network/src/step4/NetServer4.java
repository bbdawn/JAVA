package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

//review
//서버는 대기하다가 클라이언트가 접속하여 메세지를 출력하면 그 메세지를 입력받아 콘솔에 출력하는 기능
//다수의 클라이언트에게 메세지를 입력하기 위해 accept()부분을 반복한다 
//다수의 클라이언트와 동시접속이 아니라 순차적으로 서비스하는 예제
public class NetServer4 {
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("**NetServer4 실행중**");
			while (true) {//여러 클라이언트의 접속을 순차적으로 처리한다 
				Socket socket = serverSocket.accept();// 대기하다 클라이언트 접속하면 실행, 실제 클라이언트와 통신할 소켓객체반환
				String clientIp=socket.getInetAddress().toString();
				//클라이언트가 보낸 메세지를 입력받는다 (InputStreamReader: ByteStream을 CharacterStream 변환하는 Processing Stream)
				BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				System.out.println(clientIp+"님의 메세지"+br.readLine());
				br.close();
				socket.close();
				
			}
		} finally {
			if (serverSocket != null)
				serverSocket.close();
		}
	}

	public static void main(String[] args) {
		NetServer4 server = new NetServer4();
		try {
			server.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
