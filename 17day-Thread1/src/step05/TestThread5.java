package step05;
/*
 * ��Ƽ ������ ����
 * ä�� Ŭ���̾�Ʈ ���μ���(main thread + ģ������ �޼����� �����κ��� �Է¹޴� thread + �ڽ��� �޼����� ������ ����ϴ� thread)
 */
public class TestThread5 {
	public static void main(String[] args) {
		Thread inputThread=new Thread(new InputWorker());
		Thread outputThread=new Thread(new OutputWorker());
		inputThread.start();
		outputThread.start();
		System.out.println("**main thread ����**");
	}
}
