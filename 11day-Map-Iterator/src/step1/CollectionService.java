package step1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
	//���ǿ� ���� Collection�� ���� ���� �ڷᱸ��ü�� �پ��ϰ� �����Ǿ�
	//��ȯ�Ǵ� �޼���(List�迭 �Ǵ� Set�迭 ����ü�� ����)
public class CollectionService {
	public Collection<String> findDataCollection(String type){
		Collection<String> col=null;
		if(type.equalsIgnoreCase("A")) {//��ҹ��� ���� ���� A or a�̸�
			col=new ArrayList<String>();
			col.add("����");
			col.add("����");
			col.add("����");
		}else {
			col=new LinkedHashSet<String>();
			col.add("������");
			col.add("������");
		}
		return col;
	}
}
