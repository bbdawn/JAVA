package step8;
//super()�� ����
class Parent{//������ ��Ӱ��谡 ������ �ڵ����� extends Object ó���� ---> java.lang.Object : �ڹ��� �ֻ���Ŭ����!!  
		Parent(){// super()�� �ڵ� ���Ե�
			System.out.println("Parent ��ü ����");
		}
	
}

class Child extends Parent{
	Child(){//super(); //������ super()�� ������� ������ ������ �ÿ� ����, super()���๮�� �ݵ�� ������ ù ���ο� ��ġ.
					   //�θ� �����ڸ� ������� �θ� ��ü�� �����ϰ� �ϴ� ������ ��.
		super(); //�̰� ����!!
		System.out.println("Child ��ü ����");
		//super(); //compile error : ������ ���� ������ ù��°�� ��ġ�ؾ��ϱ⶧��
		
		}
}



public class TestSuper2 {
	public static void main(String[] args) {
		new Child();
		
	}

}
