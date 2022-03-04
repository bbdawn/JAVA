package step06;
/*
 * �� Ŭ�����κ��� �ټ��� �����尡 �����Ǿ� ����ȴ�
 * �ټ��� �����忡 ���� run()�޼��尡 ���������
 * �����庰�� stack �޸� ������ �����ǹǷ�
 * ������ stack �޸� ������ ������ ����ǹǷ� 
 * local variable(stack������)�� ���������� ����ǰ� ���ȴ�. 
 */
/*
 * ������ ��
B ����� �����ϲ� ������ 1
C ����� �����ϲ� ������ 1
A ����� �����ϲ� ������ 1

A ����� �����ϲ� ������ 2
C ����� �����ϲ� ������ 2
B ����� �����ϲ� ������ 2 

111 222 333 444~ 
�����庰�� ������ stack�޸𸮿����� ������ ����Ǳ� ����!!
 */
public class ServerWorker implements Runnable{
	//run(): �������� ���೻���� �����ϴ� �κ�. jvm�� �����ϴ� �޼���(jvm�� �����ٸ��ϸ� �����). 
	@Override
	public void run() {
		try {
			chatting();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void chatting() throws InterruptedException {
		//���� �������� �������� �̸��� ��ȯ�޴´�
		String name=Thread.currentThread().getName();
		for(int i=0; i<10; i++) {
			System.out.println(name+" �����ϲ� ������ "+i);
			Thread.sleep(1000);//1�ʰ���
		}//for
	}//method
}//class
