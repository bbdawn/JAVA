package step5;
/*
    EchoServer�� �ʿ��� ������� 
	ServerSocket : accept() 
	Socket 
	//Ŭ���̾�Ʈ�κ��� �Է¹޴� ��Ʈ��
	BufferedReader>InputStreamReader>socket.getInputStream()
	//Ŭ���̾�Ʈ�� ����ϴ� ��Ʈ�� 
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
