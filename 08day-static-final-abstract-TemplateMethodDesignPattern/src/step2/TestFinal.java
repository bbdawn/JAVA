package step2;

class Product{
	//final ��õǸ� ����� ��(���Ҵ� �Ұ�), ����� �빮�ڷ� ����, �ռ���� _ underscore�� ����
	final String ADMIN_ID="javaking";
	public void test() {
		//ADMIN_ID='aaa'; //error: ����̹Ƿ� ���Ҵ� �Ұ�
	}
	//final method�� �׽�Ʈ
	public final void test2() {
		
	}

}

class MyProduct extends Product{
	//public void test2() {} //error: �θ��� test2()�޼���� final method�̹Ƿ� �������̵� �Ұ�(�����ǺҰ�)
}

//final class �׽�Ʈ
final class Test{}
//class SubTest extends Test{} //error: final class�� ��ӹ��� �� ����



public class TestFinal {

}
