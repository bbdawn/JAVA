package step1;

public class MyDate {
	//default �����������̹Ƿ� �ܺ� Ŭ�������� ���� ����
	// �߸��� day value�� �Ҵ� �Ҽ��� �ִ�
	int day;
	//private ���� �����ڸ� ����ؼ�
	//�ܺο��� �����ϴ� ���� �����Ѵ� 
	private int encapsulDay;
	//encapsulDay �ν��Ͻ� ������ ���� setter getter method��
	//�����ؼ� �ܺο����� setter getter�� �̿���
	//encapsulDay ������ ���� �����ϵ��� �Ѵ�
	//setter method
	public void setEncapsulDay(int d) {
		if(d>=1&&d<=31) { // ���� : 1�̻� 31�����̸�
			encapsulDay=d;
		}else {//1�̻� 31���ϰ� �ƴϸ�
			System.out.println("�߸��� �Է°��̹Ƿ� 1�Ϸ� �Ҵ��մϴ�");
			encapsulDay=1;//�ʱⰪ����
			
		}
	}
	
	public int getEncapsulDay() {
		return encapsulDay;
	}
	
}
