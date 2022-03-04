package step1;

public class TestPolymorphism3 {
	public static void main(String[] args) {
		ZooService service=new ZooService();
		service.pass(new Person());
		service.pass(new Monkey());
		service.pass(new Dog());
		service.pass(new Tiger());
	}
}
