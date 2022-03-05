package step6.inst;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 	step6
	�ټ��� Ŭ���̾�Ʈ���� �޾Ƹ� �����ϴ� ������ ���� 
	���� : step6.MultiServer - ServerWorker 
	Ŭ���̾�Ʈ : step5�� EchoClient�� ���� 
	
	�ϳ��� ������ ���������� ������ �����ϸ鼭 �ټ��� Ŭ���̾�Ʈ���� ���� �ϱ� ���ؼ���
	���μ��� ������ ��������� Thread�� �̿��ؾ� �Ѵ� ( ��Ƽ ������ ) 
	( �� - �ݼ��Ϳ��� �ټ��� ���� ��㼭�񽺸� �����ϱ� ���ؼ��� �ټ��� ������ �ʿ��ϴ� ) 
	
	MultiServer �� Ŭ���̾�Ʈ�� ������ ����ϴٰ� Ŭ���̾�Ʈ�� �����ϸ� ������ ��ȯ,
	ServerWorker(socket)�� �̿��� Thread �� �����ϰ� start() ��Ų��
	�̷��� �۾��� Ŭ���̾�Ʈ ���ӽø��� �ݺ� 
	
	ServerWorker �� ���� ���� Ŭ���̾�Ʈ�� ����ϴ� Ŭ���� ( �޾Ƹ� ���� )
	�Ҵ���� ������ �̿��� run() �޼��忡�� Ŭ���̾�Ʈ�� �޼����� �Է¹ް� �ٽ� ����ϴ� �۾��� �ݺ� 
 */
public class MultiServer {
	public void go() throws IOException {
		ServerSocket serverSocket=null;
		try {
			serverSocket=new ServerSocket(5432);
			System.out.println("**MultiServer**");
			while(true) {
				Socket socket=serverSocket.accept();//����ϴ� Ŭ���̾�Ʈ �����ϸ� ����, ���� Ŭ���̾�Ʈ�� ����� ������ ��ȯ 
				//�������� ��ȭ�� ��ȭ�⸦ �Ҵ��Ѵ� 
				ServerWorker worker=new ServerWorker(socket);
				Thread thread=new Thread(worker);
				thread.start();
			}
		}finally {
			if(serverSocket!=null)
				serverSocket.close();
		}
	}
	public static void main(String[] args) {
		try {
			new MultiServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
















