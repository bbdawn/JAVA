package step5;
/*
 	EchoClient에 필요한 구성요소 
	Socket
	//콘솔에서 입력받는 스캐너
	Scanner
	//서버로 출력하는 스트림
	PrintWriter>socket.getOutputStream()
	//서버에서 입력받는 스트림
	BufferedReader>InputStreamReader>socket.getInputStream()
 */
public class EchoClient {
	public void go() {
		
	}
	public static void main(String[] args) {
		EchoClient client=new EchoClient();
		client.go();
	}
}
