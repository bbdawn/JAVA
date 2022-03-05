package step6;

import java.io.IOException;
import java.net.ServerSocket;

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
	
	�������� ���� 
	while loop{ 
	accept();
	ServerWorker ����, ������ �����Ҵ� 
	Thread ���� 
	start()
	}
 */
public class MultiServer {
	public void go() throws IOException {
		ServerSocket serverSocket=null;
		try {
			//
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











