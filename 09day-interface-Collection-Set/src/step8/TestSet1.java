package step8;

import java.util.LinkedHashSet;

public class TestSet1 {
	public static void main(String[] args) {
		//<String> : Generic ����� Ÿ���� ���� -> set�� ��Ҹ� String���� �����Ѵ�
		//LinkedHashSet: �ߺ�����x, ��� �߰� ������ ����
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("�ں���");
		set.add("������");
		set.add("�ں���"); //set�� �ߺ��� �������� �ʴ´�
		System.out.println(set);//toString()�� ���������� ȣ�� -> 2�� �ں���, ������
		System.out.println(set.size());//2
		set.clear();//�� ����
		System.out.println(set);
		
		//Generic test
		//LinkedHashSet set2=new LinkedHashSet();
		//set2.add("ġŲ");
		//set2.add(100); //�ٸ� ���� �����Ͱ� ���� ���� -> �ڷᱸ�� ����� Ÿ�� �������� ���� -> Generic�� ����
	
		LinkedHashSet<Integer> pointSet=new LinkedHashSet<Integer>(); //������ �ڷḸ �����ϴ� �ڷᱸ��ü
		pointSet.add(100);
		pointSet.add(200);
		//pointSet.add("�̹�"); //error: Generic���� ����� Ÿ���� ��Ұ� �ƴϹǷ� error
		pointSet.add(100);//�ߺ��� �������� ����!
		System.out.println(pointSet.size()); //2
		System.out.println(pointSet.isEmpty()); //false //��������� true
		pointSet.clear();//��� ��Ҹ� �����
		System.out.println(pointSet.isEmpty()); //true //��������Ƿ� true
		
	
	
	}
}
