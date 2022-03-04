package step4;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import common.IP;

public class NetClient4 {
	public void go() throws IOException {
		Socket socket=new Socket(IP.INST,5432);
		System.out.println("**NetClient4 서버에 접속**");
		PrintWriter pw=new PrintWriter(socket.getOutputStream(),true);//true: autoflush로 println()실행 즉시 출력하는 역할
		//콘솔로부터 입력받기 위해 스캐너 생성
		Scanner scanner=new Scanner(System.in);
		System.out.print("서버에 보낼 메세지: ");
		String message=scanner.nextLine();
		pw.println(message);//서버에 전송 
		System.out.println("서버에 전송완료");
		scanner.close();
		pw.close();
		socket.close();
		System.out.println("**NetClient4 종료**");
	}
	
	public static void main(String[] args) {
		NetClient4 client=new NetClient4();
		try {
			client.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
