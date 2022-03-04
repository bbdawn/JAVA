package step1;
//static�� non-static(object or instance member)���� ���� ���ο� ���� ����
public class TestStatic2 {
	private int age;//instance variable, object�� member -> ��ü ������ �� heap�� �޸𸮰� ���� 
	private static int age2;//static(or class) variable, class�� member -> Ŭ���� �ε��ÿ� meta space�� �޸𸮰� ����
	public void test1() {//object�� member method
		System.out.println("object�� method test1");
		System.out.println(age);//non-static���� ���� ����
		System.out.println(age2);//non-static test1()���� static age2�� ���ٰ���
	}
	
	public static void test2() {
		System.out.println("class�� method test2");
		//System.out.println(age);	//error: static method�� test2�� ��ü ���� ����  �ٷ� ���డ���� �޼���. �� ��ü ������ ����Ǿ����� �ʴ�
									//age instance variable�� ��ü ������ ���� �޸𸮿� ����ǹǷ� �����ϱ� ���ؼ��� ��ü ������ �ʿ��ϴ�
		System.out.println(age2);
	}
	
	public static void main(String[] args) {//main method�� static method�̴�
		//error: heap �޸𸮿� �����ϴ� ���°� �ƴϱ� ���� 
		//������ Ŭ���� ���ο����� static �������� 
		//non-static(instance variable or method)�������� ���� ������ �Ұ���
		//System.out.println(age);
		//instance variable�� age�� �����ϱ� ���ؼ��� ������ Ŭ���� �������� �ݵ�� ��ü ������ �ʿ���.
		
		TestStatic2 t=new TestStatic2();
		System.out.println(t.age);
		//test1(); //static���� non-static�� test1�� �������� �Ұ�
					//��ü ���� �� ���������� ���� ���� ����
		t.test1();
	}
	

}
