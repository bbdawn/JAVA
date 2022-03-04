package step1;

public class TestItemService {
	public static void main(String[] args) {
		ItemVO []items= {
				new ItemVO("진라면","오뚜기",1200),
				new ItemVO("짜파게티","농심",1500),
				new ItemVO("불닭볶음면","삼양",1700),
		};
		ItemService service=new ItemService();
		//service.printItemNames(items);
		
		int price=1600;
		//price 즉 1600 미만 가격을 가진 상품들의 name과 price를 출력
		service.printItemNameAndPriceLessThanPrice(items,price);
		
		
	}//main
}//class
