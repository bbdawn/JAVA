package step1;

import java.util.Collection;
import java.util.Iterator;

public class TestIterator {
	public static void main(String[] args) {
		CollectionService service=new CollectionService();
		Collection<String> col=service.findDataCollection("a");
		//Collection �迭�� �پ��� �ڷᱸ��ü�� ��ȯ�ȴٴ� ���� Ȯ��
		//System.out.println(col.getClass().getName());
		//� �ڷᱸ��ü�� �͵� ������ ������� �� ��ҵ��� �ݺ� ������ �� �ִ�
		//  -> Iterator�� �̿�

	
		Iterator<String> it=col.iterator();
		while(it.hasNext()) {//���� ��Ұ� ���� ������ �ݺ�
			System.out.println(it.next());//������Ҹ� ��ȯ
			
		}//while
	}//main
}//class
