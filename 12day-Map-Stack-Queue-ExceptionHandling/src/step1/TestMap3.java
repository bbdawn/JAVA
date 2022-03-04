package step1;

public class TestMap3 {
	public static void main(String[] args) {
		ShoppingCartService service=new ShoppingCartService();
		service.addProduct(new Product("1","진라면","오뚜기",1000));
		service.addProduct(new Product("2","열라면","오뚜기",1200));
		service.addProduct(new Product("3","너구리","농심",1300));
		System.out.println("장바구니에 상품을 추가");
		service.printAll(); //장바구니에 있는 정보가 모두 출력 
		System.out.println("**아이디로 상품검색**");
		String id="1";
		System.out.println(service.findProductById(id));
		//위 코드의 결과는 아래와 같이 나오면 된다 
		// Product [id=1, name=진라면, maker=오뚜기, price=1000] 
		id="4";
		System.out.println(service.findProductById(id));
		//위 코드의 결과는 아래와 같이 나오면 된다 
		//null
	
		System.out.println("**아이디로 상품삭제**");
		System.out.println("삭제 전 장바구니에 있는 상품 정보");
		service.printAll();
		
		
		service.deleteProductById("2");
		
		System.out.println("삭제 후 장바구니에 있는 상품 정보");
		service.printAll();
		
		System.out.println("****장바구니에 있는 상품 총액****");
		int totalPrice=service.getTotalPrice();
		System.out.println("상품총액: "+totalPrice);
	
	
	
	
	
	
	
	
	}//main
}










