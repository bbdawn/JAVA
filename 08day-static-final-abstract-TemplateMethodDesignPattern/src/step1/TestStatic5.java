package step1;

class Customer{
	static String name; //meta space 저장, 하나의 공간에 데이터가 적재 //아이유->박보검
	Customer(String name){
		Customer.name=name;
	}
}

public class TestStatic5 {
	public static void main(String[] args) {
		//Customer c1=new Customer("아이유");
		System.out.println(Customer.name);//metaspace: 아이유
		//Customer c2=new Customer("박보검");
		System.out.println(Customer.name);//metaspace: 박보검(아이유 정보를 변경해서;없애고 저장)
		System.out.println(Customer
				.name);//metaspace: 박보검
		//System.out.println(c1.name);//metaspace: 박보검
		
	}
}
