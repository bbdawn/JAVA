package step7.test;
// import : �ٸ� ��Ű���� �ڿ��� ����ϱ� ����
import step7.model.Customer;

public class TestAccessModifier {
	public static void main(String[] args) {
		Customer c=new Customer();
		System.out.println(c.password1);
		//�ٸ� ��Ű���̹Ƿ� error 
		//System.out.println(c.password2);
		//�ٸ� ��Ű���̹Ƿ� error 
		//System.out.println(c.password3);
		//�ٸ� Ŭ�����̹Ƿ� error 
		//System.out.println(c.password4);
	}
}
