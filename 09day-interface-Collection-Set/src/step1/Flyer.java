package step1;

public interface Flyer {
	String ID="javaking"; //ID �빮�ڷ� ���� ������ ����̱� ����(public static final_���???)�� �ν�. ����̰� meta space�� ����
	//�� ����ó�� ����ϸ� static final�� �νĵǹǷ� �ν��Ͻ������� ����ϴ� ���� �Ұ����ϴ�. 
	public void fly(); //abstract method�� �ν�
	
	//public void takeoff() {} //error: ������ �޼��� ���� �Ұ� -> {} �ȵ�!!
}
