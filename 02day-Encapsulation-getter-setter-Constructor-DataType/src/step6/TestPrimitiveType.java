package step6;

public class TestPrimitiveType {
	public static void main(String[] args) {
		//������ byte short int long
		byte by=1;
		System.out.println(by);
		//java se api �� �̿��� byte���� �ִ밪�� Ȯ��
		System.out.println(Byte.MAX_VALUE);//127
		System.out.println(Byte.MIN_VALUE);//-128
		//byte by2=128; //errer : 128�� byte���� �ִ밪�� �Ѿ�� ����
		
		short s=128;
		System.out.println(s); //����!
		
		int i=1;
		System.out.println(i);
		System.out.println(Integer.MAX_VALUE); //2147483647 21��. ������ ��쿡�� �Ұ�����.

		
		long lo=2147483648L;// int���� ������ �Ѿ ��쿡�� long ���� �νĽ��Ѿ��Ѵ�.
		System.out.println(lo);
	
		//�Ǽ��� float double
		//float f=3.14; //error : �Ǽ����� �⺻���� double (8byte), float�� 4byte, float���� �νĽ��Ѿ���
		float f=3.14F;
		System.out.println(f);
		double d=3.14;
		System.out.println(d);
		
		//������ - �ѹ��ڸ� ����
		char ch='��';
		System.out.println(ch);
		
		//���� - ���� true�� false�� �Ҵ� ����
		boolean flag=true;
		flag=false;
		//flag=ok; //error : true or false�� ����
		System.out.println(flag);

		
		
		
		
	}
}
