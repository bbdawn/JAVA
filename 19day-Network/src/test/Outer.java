package test;

import java.util.ArrayList;

// �Ʒ� Ŭ������ �����ϵǸ� Outer.class , Outer$Inner.class �� ���� class ������ ����
public class Outer {
	private int money=100;
	private ArrayList<Inner> list=new ArrayList<Inner>();
	public void accessTest() {
		list.add(new Inner());
		list.add(new Inner());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).writer);//Inner�� private member�� �ٷ� ������ ���
		}
	}
	public class Inner{
		private String writer="���";
		public void test() {
			//Outer class�� private member�� ���� ���� ���� 
			System.out.println(money);
		}
	}
}
