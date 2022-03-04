package step1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
	//조건에 따라 Collection의 하위 구현 자료구조체가 다양하게 생성되어
	//반환되는 메서드(List계열 또는 Set계열 구조체가 리턴)
public class CollectionService {
	public Collection<String> findDataCollection(String type){
		Collection<String> col=null;
		if(type.equalsIgnoreCase("A")) {//대소문자 관계 없이 A or a이면
			col=new ArrayList<String>();
			col.add("피자");
			col.add("맥주");
			col.add("족발");
		}else {
			col=new LinkedHashSet<String>();
			col.add("아이폰");
			col.add("갤럭시");
		}
		return col;
	}
}
