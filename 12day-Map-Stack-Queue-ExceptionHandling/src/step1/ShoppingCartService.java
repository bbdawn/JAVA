package step1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class ShoppingCartService {
	// key 는 Product 의 id, value는 Product Object 
	private LinkedHashMap<String,Product> map=new LinkedHashMap<String, Product>();
	public void addProduct(Product product) {
		//key는 상품아이디, value는 상품객체 
		map.put(product.getId(), product);
	}
	
	
	public void printAll() {
		// map 의 value 들만 Iterator를 이용해 출력 
		//map의 key를 제외한 value 만 리턴받는다 
		Collection<Product> values=map.values();
		//Collection 계열의 모든 자료구조체는 Iterator 인터페이스의 추상메서드를 이용해
		//요소들을 반복 열거할 수 있다 
		Iterator<Product> it=values.iterator();
		while(it.hasNext()) {//다음 요소가 존재할때까지 반복
			System.out.println(it.next());//다음 요소를 반환 
		}
	}
	
	public Product findProductById(String id) {
		return map.get(id);//key로 검색해서 반환, 검색결과가 없으면 null 반환 
	}
	
	public void deleteProductById(String id) {
		map.remove(id);
	}


	public int getTotalPrice() {
		int totalPrice=0;
		Collection<Product> col=map.values();
		Iterator<Product> it=col.iterator();
		while(it.hasNext()) {//다음 요소가 있으면 true
			totalPrice+=it.next().getPrice();
		}
		return totalPrice;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}//class










