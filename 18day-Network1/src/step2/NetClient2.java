package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

import common.IP;

public class NetClient2 {
	public void go() throws UnknownHostException, IOException {
		//서버에 접속 
		Socket socket=new Socket(IP.INST,5432);//강사 서버에 접속해본다 
		System.out.println("**NetClient2 실행**");
		//서버가 보낸 메세지를 입력받아 자신의 콘솔에 출력한다 
		//ByteStream을 CharacterStream으로 변환하는 ProcessStream : InputStreamReader를 이용
		InputStreamReader ir=new InputStreamReader(socket.getInputStream());
		BufferedReader br=new BufferedReader(ir);
		String message=br.readLine();
		System.out.println("서버가 보낸 메세지:"+message);
		br.close();
		socket.close();
		System.out.println("**NetClient2 종료**");
	}
	public static void main(String[] args) {
		NetClient2 client=new NetClient2();
		try {
			client.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}








