package step1;
/*
 * Throwable class�� �ڽ� (sub) class��
 * Error�� Exception�� �ִ�
 * Error: �ɰ��� ����, ���� ������ �ʿ�
 * Exception : ����, ���������� ���� ó���� ���� ���α׷��� ����
 */

//���Ƿ� ���ΰ� �߻��ϴ� �ڵ带 �����ؼ� Ȯ���غ��� -> ���� ������ �ʿ�
class ErrorDemo{
	public void go() {
		System.out.println("go");
		stop();
	}//go
	public void stop() {
		System.out.println("stop");
		go();
	}//stop
}//ErrorDemo


//�� ��쿡�� java.lang.StackOverflowError�� �߻��ϰ� try catch�� �ǹ̾��� �ڵ带 �����ؾ��Ѵ�. 
public class TestError {
	public static void main(String[] args) {
		ErrorDemo e=new ErrorDemo();
		e.go();		
	}//main
}
