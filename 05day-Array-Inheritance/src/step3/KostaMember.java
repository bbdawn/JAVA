package step3;

public class KostaMember {
	private String id;
	private String name;
	public KostaMember() {}
	public KostaMember(String id) {//생성자 오버로딩
		this.id=id;
	}
	public KostaMember(String id, String name) {//생성자 오버로딩
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
	
	
	