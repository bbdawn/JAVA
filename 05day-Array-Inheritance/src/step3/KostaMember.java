package step3;

public class KostaMember {
	private String id;
	private String name;
	public KostaMember() {}
	public KostaMember(String id) {//������ �����ε�
		this.id=id;
	}
	public KostaMember(String id, String name) {//������ �����ε�
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
	
	
	