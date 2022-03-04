package step3;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class ShoppingCartService {
	// key �� Product �� id, value�� Product Object 
	private LinkedHashMap<String,Product> map=new LinkedHashMap<String, Product>();
	public void addProduct(Product product) {
		//key�� ��ǰ���̵�, value�� ��ǰ��ü 
		map.put(product.getId(), product);
	}
	
	
	public void printAll() {
		// map �� value �鸸 Iterator�� �̿��� ��� 
		//map�� key�� ������ value �� ���Ϲ޴´� 
		Collection<Product> values=map.values();
		//Collection �迭�� ��� �ڷᱸ��ü�� Iterator �������̽��� �߻�޼��带 �̿���
		//��ҵ��� �ݺ� ������ �� �ִ� 
		Iterator<Product> it=values.iterator();
		while(it.hasNext()) {//���� ��Ұ� �����Ҷ����� �ݺ�
			System.out.println(it.next());//���� ��Ҹ� ��ȯ 
		}
	}
	public Product findProductById(String id) {
		return map.get(id);//key�� �˻��ؼ� ��ȯ, �˻������ ������ null ��ȯ 
	}
}










