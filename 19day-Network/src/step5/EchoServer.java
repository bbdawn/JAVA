package step5;
/*
    EchoServer에 필요한 구성요소 
	ServerSocket : accept() 
	Socket 
	//클라이언트로부터 입력받는 스트림
	BufferedReader>InputStreamReader>socket.getInputStream()
	//클라이언트로 출력하는 스트림 
	PrintWriter>socket.getOutputStream()  
	close()
 */
public class EchoServer {
	public void go() {
		
	}
	public static void main(String[] args) {
		EchoServer server=new EchoServer();
		server.go();
	}
}
