package step8;
interface Flyer{}

class Bird implements Flyer{}

class Eagle extends Bird{}

public class TestInterface {
	public static void main(String[] args) {
		Flyer f1=new Bird();
		System.out.println(f1 instanceof Flyer);
		Flyer f2=new Eagle();//부모 Bird가 Flyer interface를 implements 했으므로 
		System.out.println(f2 instanceof Flyer); // true -> Eagle 또한 Flyer의 계층구조의 하위 객체다 
		//부모 클래스가 java.io.Serializable interface implements 하면 자식 클래스는 별도로 implements 할 필요가 없다 
	}
}
