package step8;


class OperaterExam{
	public boolean test1() {
		System.out.println("test1");
		return false;
	}
	public boolean test2() {
		System.out.println("test2");
		return true;
	}
}


public class TestOperator2 {
	public static void main(String[] args) { 
		OperaterExam oe=new OperaterExam();
		//�������ǽĿ��� false�� ������ ���������� Ȯ���� �ʿ� �����Ƿ� test1()�� ����� -> ȿ���� 
		System.out.println(oe.test1()&&oe.test2());
		System.out.println("****");
		//&: ��� ���ǽ��� �� �����
		System.out.println(oe.test1()&oe.test2());

		
	}
}
