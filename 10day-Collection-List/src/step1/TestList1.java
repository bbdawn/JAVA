package step1;

import java.util.ArrayList;

public class TestList1 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("ġŲ");
		list.add("����");
		list.add("���İ�Ƽ");
		list.add("����");
		System.out.println(list.size());//4
		System.out.println(list); //ġŲ ���� ���İ�Ƽ ����
		System.out.println(list.get(0)); //ġŲ //index�� 0���� ������ 
		
		//������ ��Ҹ� ��ȯ�޾� ���
		System.out.println(list.get(3));//����
		System.out.println(list.get(list.size()-1)); //���� //���� ������ ���. ������ ��� index�� �𸦶����� size()-1�� �̿��ϸ� ��!
		
		//index1�� ���ָ� ����
		System.out.println(list.remove(1)+" ����");//remove()�� �����Ŀ� ������ ��Ҹ� ��ȯ
		System.out.println(list);//ġŲ, ���İ�Ƽ, ���� //index1�� �ִ� ���� ������
		
		//index2�� ���ָ� ���ַ� ����
		System.out.println(list.set(2, "����")+ " ����"); //set()�� ���� �Ŀ� ������ ��Ҹ� ��ȯ�Ѵ�.
		System.out.println(list);
		
		//for loop�� �̿��ؼ� ��Ҹ� ���
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		list.clear(); //��� ��Ҹ� ����
		System.out.println(list);
	}
}


























