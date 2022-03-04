package step1;

import java.util.Collection;
import java.util.Iterator;

public class TestIterator {
	public static void main(String[] args) {
		CollectionService service=new CollectionService();
		Collection<String> col=service.findDataCollection("a");
		//Collection 계열의 다양한 자료구조체가 반환된다는 것을 확인
		//System.out.println(col.getClass().getName());
		//어떤 자료구조체가 와도 단일한 방법으로 그 요소들을 반복 열거할 수 있다
		//  -> Iterator를 이용

	
		Iterator<String> it=col.iterator();
		while(it.hasNext()) {//다음 요소가 있을 때까지 반복
			System.out.println(it.next());//다음요소를 반환
			
		}//while
	}//main
}//class
