package test;

import java.util.ArrayList;

// 아래 클래스가 컴파일되면 Outer.class , Outer$Inner.class 로 각각 class 파일이 생성
public class Outer {
	private int money=100;
	private ArrayList<Inner> list=new ArrayList<Inner>();
	public void accessTest() {
		list.add(new Inner());
		list.add(new Inner());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).writer);//Inner의 private member에 바로 접근해 사용
		}
	}
	public class Inner{
		private String writer="출력";
		public void test() {
			//Outer class의 private member에 직접 접근 가능 
			System.out.println(money);
		}
	}
}
