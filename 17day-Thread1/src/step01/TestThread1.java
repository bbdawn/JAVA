package step01;
/*
 *  step1 ���� ������ ȯ�� -> main thread 
 *  TestThread1 program�� �������̸� process( ���� ���� ���� ���α׷� ) 1�� 
 *  �� Process ���� ���� ������ Thread(main thread)�� �ϳ� ����ȴ�
 */
//�Ʒ� ���α׷��� ������ �� main thread ���� ��� ������ step2.TestThread2�� ���غ��� 
class SingleThreadTest{
	public void test() {
		for(int i=0;i<10;i++) {
			System.out.println("thread:"+i);
		}
	}
}
public class TestThread1 {
	public static void main(String[] args) {
		SingleThreadTest t=new SingleThreadTest();
		t.test();
		System.out.println("**main thread ����**");
	}
}





