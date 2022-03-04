package step5;
//�� ���� ������ Ȯ���ϱ� ���� �ϳ��� ���Ͽ��� �ۼ�
//�ڹٴ� ���� ����̴�
class A{}
class B{}
//class C extends A,B{} //error: �ڹٴ� ���ϻ���̹Ƿ� ���� Ŭ������ ��ӹ��� �� ����.

interface Ex1{
	public void ex1();
}
interface Ex2{
	public void ex2();
}

class ExImpl extends A implements Ex1, Ex2{ //�������̽��� ������ implements �� �� �ִ� -> A, Ex1, Ex2�� ���� �پ��� ���������� ���� ����!
	public void ex1() {}
	public void ex2() {}
}





//�������̽������� ���߻���� �����ϴ� (abstract method�� ��ӹ޴´ٴ� �ǹ�)
interface D{
	public void d();
}
interface E{
	public void e();
}
interface Test extends D,E{//class�� ���߻���� �ȵ����� interface������ �����ϴ�
	public void t();
}
class TestImpl implements Test{ //Test interface�� ��ӹ��� abstract method ���� �� 3���� abstract method�� ����
	public void d() {}
	public void e() {}
	public void t() {}
}






//ExImpl class�� ��ӹ޴´�
class SubExImpl extends ExImpl{}
public class TestInterface5 {
	public static void main(String[] args) {
	/*
	A a=new ExImpl();//����
	Ex1 ex1=new ExImpl();//����
	Ex2 ex2=new ExImpl();//����
	Ex1 s1=new SubExImpl();//�θ� implements �Ͽ����Ƿ� ����	
	Ex2 s2=new SubExImpl();//�θ� implements �Ͽ����Ƿ� ����	 
	*/
	}
}
