package step9;
/*
 * ��� ���谡 ���� ��� ��ü ���� ���� Ȯ��
 * new C();�� ��ü�� �����ϸ� Object-> A-> B-> C ������ �����ȴ�. (C��ü�� Object, A, B, C ��θ� ������ ����!)
 */
class A{//super(); -> Object ������ ȣ�� 
	A(){//super(); --> Object(��� Ŭ������ �ֻ���Ŭ����) ������ ȣ�� 
		System.out.println("A ��ü ����");
	}
}
class B extends A{
	B(){//super(); --> A ������ ȣ��
		System.out.println("B ��ü ����");
	}
}

class C extends B{
	C(){//super(); --> B ������ ȣ��
		System.out.println("C ��ü ����");
	}
}

public class TestSuper3 {
	public static void main(String[] args) {
		new C();
	}

}
