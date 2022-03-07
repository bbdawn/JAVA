package step7.test;
// import : 다른 패키지의 자원을 사용하기 위해
import step7.model.Customer;

public class TestAccessModifier {
	public static void main(String[] args) {
		Customer c=new Customer();
		System.out.println(c.password1);
		//다른 패키지이므로 error 
		//System.out.println(c.password2);
		//다른 패키지이므로 error 
		//System.out.println(c.password3);
		//다른 클래스이므로 error 
		//System.out.println(c.password4);
	}
}
