package step5;

import java.util.ArrayList;

public class ShoppingCartService {
	private ArrayList<Product> list=new ArrayList<Product>();
	
	public void addProduct(Product product) {
		list.add(product);
	}
	
	public void printAll() {
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}	
	

	public int getTotalPrice() {
		int totalPrice=0;
		//for loop를 이용해 price를 더한다
		for(int j=0; j<list.size(); j++) {
			totalPrice+=list.get(j).getPrice();
		}//for	
		return totalPrice;
	}//getTotalPrice

}
