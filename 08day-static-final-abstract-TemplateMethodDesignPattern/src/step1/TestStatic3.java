package step1;
//static�� non-static ���� ���� �׽�Ʈ
class Car{
	int num1;
	static int num2;
	public static void test1() {
		//System.out.println(num1); //error: static method�� ��ü �������� ���డ���ϹǷ� num1�� �޸𸮿� �����Ѵٴ� �������
		System.out.println(num2); //����: static�����̹Ƿ� ���ٰ���
		//test2(); //compile error  
	}
	
	public void test2(){
		System.out.println(num1);//����: Object�� member �� non-static���� ����
		System.out.println(num2);//����: test2()�� �����Ѵٴ� ���� ��ü ������ ������ �ϰ� ��ü ������ �ȴٴ� ���� Ŭ�����ε��� ������ �ϹǷ� 
		test1(); //���� : non-static���� static���� �ٷ� ���� ����!
	}
}
public class TestStatic3 {

	
}
