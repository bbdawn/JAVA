package step7.model;

public class Customer {
	//public ���������ڴ� �ٸ� ��Ű������ ���� ���� 
	public String password1="public";
	//protected ���������ڴ� ���� ��Ű��������
	//���ٰ���( ��ӽÿ��� �ٸ� ��Ű������ ���� ���� )
	protected String password2="protected";
	//default ���������ڴ� ���� ��Ű�������� ���� ���� 
	 String password3="default";
	 //private ���������ڴ� ������ Ŭ������������ ���� ����
	private String password4="private";
	//���� private ������ ������ Ŭ���������� �Ʒ��� ����
	//���� �����ϴ� 
	public String getPassword4() {
		return password4;
	}
}











