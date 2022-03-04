package step2;

import java.util.LinkedHashMap;

public class TestMap1 {
	public static void main(String[] args) {
		Food f1=new Food(1,"�׶�", 1410);
		Food f2=new Food(2,"�����", 1100);
		Food f3=new Food(3,"���⸸��", 5000);
		
		//Map�� key value ������ ����
		//Integer�� key�� Ÿ��, Food�� value�� Ÿ��
		LinkedHashMap<Integer,Food> map=new LinkedHashMap<Integer,Food>();
		map.put(f1.getId(), f1); //key�� value ������ ����
		map.put(f2.getId(), f2);
		map.put(f3.getId(), f3);
		
		//key�� value�� �˻�
		//id2�� key�� �˻�
		Food rf=map.get(2);
		System.out.println(rf.getName()+" "+rf.getPrice());
		System.out.println(map.get(3));
		System.out.println(map);//�Է� ������� ��� 
		System.out.println(map.size());//3
		//key�� �̿��� ���� 
		System.out.println(map.remove(1)+" ����");
		System.out.println(map);
		//key�� �����ؾ� �Ѵ�. ���� ������ key �ٽ� �߰�(put) �Ǿ��� ���� value�� update �ȴ� 
		System.out.println(map.put(2, new Food(2,"�Ŷ��",1500))+" ������ �Ŷ������ ������Ʈ");
		System.out.println(map);
	}

}
