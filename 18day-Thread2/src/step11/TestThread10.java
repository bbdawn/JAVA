package step11;
// �ټ��� �����尡 ���� �ڿ��� �̿��� �� �ִٴ� ���� Ȯ���ϴ� ���� 
public class TestThread10 {
	public static void main(String[] args) {
		SearchServiceWorker sw=new SearchServiceWorker();
		Thread t1=new Thread(sw,"1�� ���� ���� �˻����� �ϲ� ������");
		Thread t2=new Thread(sw,"2�� ���� ���� �˻����� �ϲ� ������");
		Thread t3=new Thread(sw,"3�� ���� ���� �˻����� �ϲ� ������");
		t1.start();
		t2.start();
		t3.start();
	}
}
