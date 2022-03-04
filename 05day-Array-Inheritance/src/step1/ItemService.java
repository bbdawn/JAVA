//VO : ValueObject ���� �����ϴ� ��ü
//Service : ���� �ϴ� ��ü. ����Ͻ� ����(����. �� �ý��ۿ��� �ϴ� �ϵ�)�� �����ϴ� Ŭ����
package step1;

public class ItemService {
		public void printItemNames(ItemVO[] itemArray) {//ItemVO[] -> Reference DataType
			//for���� �̿��� �����۸�鸸 ����غ���. 
			for(int i=0; i<itemArray.length;i++) {
				System.out.println(itemArray[i].getName());
			}
			
		}

		public void printItemNameAndPriceLessThanPrice(ItemVO[] items, int price) {
			// for ~ if
			for(int i=0; i<items.length;i++) {
				if(items[i].getPrice()<price)
				System.out.println(items[i].getName()+" "+items[i].getPrice());
			}
			
		}//method
	}//class

