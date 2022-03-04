//VO : ValueObject 값을 저장하는 객체
//Service : 일을 하는 객체. 비즈니스 로직(업무. 이 시스템에서 하는 일들)를 정의하는 클래스
package step1;

public class ItemService {
		public void printItemNames(ItemVO[] itemArray) {//ItemVO[] -> Reference DataType
			//for문을 이용해 아이템명들만 출력해본다. 
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

