package step8;

import java.util.TreeSet;

public class TestSet2 {
	//TreeSet: �ߺ�����x, ���ı��
	public static void main(String[] args) {
		TreeSet<String> set1=new TreeSet<String>();//Generic�� String���� ����� ��ҵ��� ���ڿ��� ����
		set1.add("�����");
		set1.add("�迵��");
		set1.add("�迵��");
		set1.add("�̰���");
		System.out.println(set1.size()); //3 //�ߺ��Ұ�
		System.out.println(set1);//�迵��,�����,�̰��� //���ı��

	
		TreeSet<Integer> set2=new TreeSet<Integer>();
		set2.add(3);
		set2.add(1);
		set2.add(2);
		set2.add(1); //�ߺ� ���� ����
		System.out.println(set2.size()); //3 //�ߺ��Ұ�
		System.out.println(set2); //1,2,3
	
	
	}
	
	
}
