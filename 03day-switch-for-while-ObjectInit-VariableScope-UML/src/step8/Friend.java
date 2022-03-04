package step8;

public class Friend {
	private String name; //instance
	private int age; //instance
	public Friend(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	//alt+shift+s
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
	
}
