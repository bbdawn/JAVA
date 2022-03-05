package step6;

public class ServerWorker implements Runnable{
	/*
	private Socket socket;	
	public ServerWorker(Socket socket) {
		super();
		this.socket = socket;
	}
	*/
	@Override
	public void run() {
		echo();		
	}
	/*	BufferedReader
	 *  PrintWriter 를 이용한 메아리 서비스 
	 */
	public void echo() {
		
	}
}
