package step11;

public class SearchServiceWorker implements Runnable{
	//�ν��Ͻ� �����̹Ƿ� heap ������ ����Ǿ� ���� �����尡 �����ؼ� ����Ѵ� 	
	private String shareInfo="�˻����� �����ڿ�";
	private int testCount;
	@Override
	public void run() {
		//���� ������ ���� ��ȯ�޴´�
		String threadName=Thread.currentThread().getName();
		for(int i=0;i<5;i++) {//i �� ���ú����̹Ƿ� ������ stack ������ ������ ����Ǿ� �����ȴ�
			System.out.println(threadName+" "+shareInfo+" �̿��� ���� "+i);
			testCount++; //�����ڿ� ������ ������ ���� ������Ų�� 
			System.out.println(threadName+" �����ڿ� testCount:"+testCount);
		}		
	}
}
