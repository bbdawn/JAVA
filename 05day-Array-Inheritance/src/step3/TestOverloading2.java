package step3;

public class TestOverloading2 {
	public static void main(String[] args) {
		//Constructor Overloading ������ �����ε�
		//�پ��� ������ ��ü�� ����
		KostaMember m=new KostaMember();
		KostaMember m2=new KostaMember("java");
		KostaMember m3=new KostaMember("spring","������");
		System.out.println(m.getId()+" "+m.getName());
		System.out.println(m2.getId()+" "+m2.getName());
		System.out.println(m3.getId()+" "+m3.getName());
		
		
	}
}
