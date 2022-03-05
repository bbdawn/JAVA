package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
	public void go() throws IOException {
		Socket socket=null;
		Scanner scanner=null;//콘솔에서 입력
		PrintWriter pw=null;//서버로 출력	
		BufferedReader br=null;//서버에서 입력 
		try {
			socket=new Socket("127.0.0.1",5432);
			System.out.println("**EchoClient가 서버에 접속**");
			scanner=new Scanner(System.in);
			pw=new PrintWriter(socket.getOutputStream(),true);//autoflush   println() 즉시 출력 
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true) { //지속적인 입출력을 위해 반복문 사용 
				System.out.print("서버에 보낼 메세지:");
				String message=scanner.nextLine();//콘솔에서 입력
				pw.println(message);//서버로 출력
				if(message.equals("exit")) {
					System.out.println("**EchoClient 종료합니다**");
					break;
				}
				String response=br.readLine();//서버가 보낸 메세지를 입력받는다 
				System.out.println("서버에서 입력받은 메세지:"+response);
			}
		}finally {
			if(br!=null)
				br.close();
			if(pw!=null)
				pw.close();
			if(scanner!=null)
				scanner.close();
			if(socket!=null)
				socket.close();
		}
	}
	public static void main(String[] args) {
		EchoClient client=new EchoClient();
		try {
			client.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}





