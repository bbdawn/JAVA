package step6;

public class TestObjectInit {
	public static void main(String[] args) {
		MyDate date=new MyDate(29); //�����ڿ� ���� �ʱ�ȭ
		//date ��ü�� day1? day2? day3?
		//�ʱ�ȭ default->0(������), false(����), null(������)
		System.out.println(date.getDay1()); // 0 -> �⺻�ʱ�ȭ
		System.out.println(date.getDay2()); //0>22 -> ����� �ʱ�ȭ 22
		System.out.println(date.getDay3()); //0>31>29 -> ����� �ʱ�ȭ 31 �ߴٰ�
											//		�����ڿ� ���� �ʱ�ȭ 29�� ��. 
		System.out.println(date.isFlag()); //���� �⺻ �ʱ�ȭ false
		System.out.println(date.getName());//������ �⺻ �ʱ�ȭ null
		
		
	}
}
