package step7;

public class Person {
	private int money; //class ������ ���� -> instance variable �⺻ �ʱ�ȭ0

	public Person() {
		int i=1;//������ ������ �����ʱ�ȭ�Ǿ����Ƿ� local variable
		System.out.println(i);
	}
	

	public void test1() {
		int i;//method ���� ����Ǿ��� -> local variable
		System.out.println(money); //0 -> �⺻�ʱ�ȭ 0
		//System.out.println(i); //error : local variable�� �ݵ�� ����� �ʱ�ȭ�� �ʿ��ϱ� ����. 
		i=0;//����� �ʱ�ȭ�� ���ش�
		System.out.println(i); //i�� ���ÿ� ����ȴ�
	}
	
	public void test2(int money) { //�Ű� ����(parameter)���� ��������(local variable) -> stack�� ����
		System.out.println(money); //2 //local variable
		System.out.println(this.money);//0 //instance variable 
	}
	
	//test3�޼��� : local variable�� ���� �ʱ�ȭ�� ���࿵�������� ��� ����
	public void test3() {
		if(money<1) {//���� instance variable money�� 0
			int count=1; 
			System.out.println(count);//������ ���࿵�� �������� ��� ����
		}//if
		//System.out.println(count); //error : local variable�� �����ʱ�ȭ�� ���࿵�������� ��밡���ϱ� ����. 
		//--> test4()�� ���� ����ϸ� �ȴ�
	}//method
	
	public void test4() {
		int count=0;
		if(money<1) {
			count=1;
		}
		System.out.println(count);
		
	}
	
	public void test5() {
		int j=1;
		System.out.println(j);
	}
	
	
	public void test6() {
		//System.out.println(j); //error: local variable j�� test5 �޼��� ������ �Ϸ�Ǹ� �޸𸮿��� �����Ǳ� ����
	}
	
	
}
