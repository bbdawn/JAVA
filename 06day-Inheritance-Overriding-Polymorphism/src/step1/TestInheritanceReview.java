package step1;
// �� ���� �ڵ带 Ȯ���ϱ� ���� �ϳ��� ���Ͽ��� ���� Ŭ������ ���� 
class GrandParent{// extends Object : ������ ��Ӱ��谡 ������ �ڵ����� extends Object ó���� 
	GrandParent(){
		//������ super() �� ������� ������ super()�� �ڵ����� --> java.lang.Object ������ȣ�� 
		System.out.println("GrandParent ��ü ����");
	}
}
class Parent extends GrandParent{
	Parent(){ 
		super();
		System.out.println("Parent ��ü ����");
	}
}
class Child extends Parent{
	 Child(){ super(); 
	 	System.out.println("Child ��ü ����");
	 } 
}
public class TestInheritanceReview {
	public static void main(String[] args) {
		new Child();
	}
}
