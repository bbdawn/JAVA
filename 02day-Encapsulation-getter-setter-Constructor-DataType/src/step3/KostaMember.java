package step3;

public class KostaMember {
	private String id;
	private String password;
	//����Ű alt + shift + s �Ǵ� ���콺 ������>source>Generate Getters and Setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id; //this�� ���� ��ü�� ����Ų��
		//�Ű����� id�� instance ���� id�� �����ϱ� ���� ���
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
