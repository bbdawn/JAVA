package step3;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import common.IP;

// 서버에 접속해서 메세지를 출력하고 종료하는 클라이언트 프로그램 
public class NetClient3 {
	public void go() throws UnknownHostException, IOException {
		//Socket socket=new Socket("127.0.0.1",5432);
		Socket socket=new Socket(IP.INST,5432);
		System.out.println("**NetClient3 실행**");
		//서버에 메세지를 출력하기 위한 스트림 생성 
		PrintWriter pw=new PrintWriter(socket.getOutputStream(),true);//true : autoflush
		pw.println("모두 수고하셨습니다^^");
		System.out.println("**NetClient3 서버에 메세지 전송 후 종료**");
		pw.close();
		socket.close();
	}
	public static void main(String[] args) {
		NetClient3 client=new NetClient3();
		try {
			client.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
