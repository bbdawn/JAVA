package step8;
interface Flyer{}

class Bird implements Flyer{}

class Eagle extends Bird{}

public class TestInterface {
	public static void main(String[] args) {
		Flyer f1=new Bird();
		System.out.println(f1 instanceof Flyer);
		Flyer f2=new Eagle();//�θ� Bird�� Flyer interface�� implements �����Ƿ� 
		System.out.println(f2 instanceof Flyer); // true -> Eagle ���� Flyer�� ���������� ���� ��ü�� 
		//�θ� Ŭ������ java.io.Serializable interface implements �ϸ� �ڽ� Ŭ������ ������ implements �� �ʿ䰡 ���� 
	}
}
