package step4;

public class Friend {
	private String name;
	private int age;
	
	//construct
	public Friend(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//gettersetter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	//toString()
	@Override
	public String toString() {
		return "Friend [name=" + name + ", age=" + age + "]";
	}
	
	
}
