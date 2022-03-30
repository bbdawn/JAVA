package step1;
// has a relationship : 고객이 스마트폰을 소유하여 사용하는 관계를 표현 
public class TestAggregation {
	public static void main(String[] args) {
		SmartPhone s=new SmartPhone("갤럭시",100);
		Customer c=new Customer();
		c.setName("아이유");
		c.setSmartPhone(s);
		System.out.println(c.getName());
		System.out.println(c.getSmartPhone());//스마트폰 객체 주소값이 출력 
		//아이유 고객이 보유한 스마트폰의 모델명을 반환받아 출력 
		System.out.println(c.getSmartPhone().getModel());
		// c 즉 아이유 고객의 스마트폰의 가격을 200으로 변경해본다
		c.getSmartPhone().setPrice(200);
		System.out.println(c.getSmartPhone().getPrice());//200
	}
}












