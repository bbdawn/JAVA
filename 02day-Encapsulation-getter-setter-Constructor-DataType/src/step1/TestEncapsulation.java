package step1;

public class TestEncapsulation {

	public static void main(String[] args) {
		// Encapsulation ���� �ڵ� �׽�Ʈ
		MyDate date=new MyDate();
		//�߸��� day�� �Ҵ�(32���� ����!)
		date.day=32;
		System.out.println(date.day);
		//�Ʒ��� private�̹Ƿ� ���� �Ұ�
		//���� �Ҵ��� ������
		//date.encapsulDay=32;
		date.setEncapsulDay(32);
		System.out.println(date.getEncapsulDay());
		date.setEncapsulDay(31);
		System.out.println(date.getEncapsulDay());
		
		
		
		
		
		
		
		
	}

}












