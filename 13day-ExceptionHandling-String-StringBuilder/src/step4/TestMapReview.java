package step4;

import java.util.LinkedHashMap;

public class TestMapReview {
	public static void main(String[] args) {
		LinkedHashMap<String,Friend> map=new LinkedHashMap<String,Friend>();
		
		Friend f1=new Friend("������", 30);
		//map�� ��Ҹ� �߰�, key�� name, value�� Friend Object
		map.put(f1.getName(),f1);		
		map.put("rm",new Friend("rm",25));
		System.out.println(map);
		
		//key�� �˻�
		System.out.println(map.get("rm"));
		
		//Ư�� key�� map�� �����ϴ� �� ���θ� Ȯ��
		System.out.println(map.containsKey("rm"));//rm�̶�� key�� �����ϹǷ� true
		System.out.println(map.containsKey("bts"));//bts��� key�� �������� �����Ƿ� false
		
		//����
		System.out.println(map.remove("������"));//���� �� ���� ����� ��ȯ
		System.out.println(map);
		
		//����
		System.out.println(map.put("rm", new Friend("rm",35)));
		System.out.println(map);
	
	}
}
