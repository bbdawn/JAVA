package step4;

import java.util.ArrayList;

import step3.Friend;

public class TestList2 {
	public static void main(String[] args) {
		ArrayList<Friend> list=new ArrayList<Friend>();
		list.add(new Friend("���ϴ�",500));
		list.add(new Friend("������",300));
		list.add(new Friend("�ں���",400));
	
	
		//for loop�� �̿��ؼ� list ����� name�� ��� ���(getName())
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getName());
		}
		System.out.println("***********************");
		
		//for loop�� �̿��ؼ� list��� �� 400������ money�� �ִ� ģ���� �̸��� ����غ���
		int num=400;
		  for(int i=0; i<list.size(); i++) {
			if(list.get(i).getMoney() <= num) {
				System.out.println(list.get(i).getName());
			}//if
		  }//for		
		
		  System.out.println("***********************");
		
		//for loop�� �̿��ؼ� list ��� �� name �������� �ش��ϴ� ģ���� money�� ���
		//���ڿ� �񱳽ÿ��� ==�����ڰ� �ƴ϶� equals�޼��带 �̿��Ѵ�
		  String name="������";
		  for(int j=0; j<list.size(); j++) {
			if(name.equals(list.get(j).getName())) {
				System.out.println(list.get(j).getMoney());
			}//if
		  }//for
		System.out.println("*******toString() �������̵�*********");
		System.out.println(list.get(0)); //�ּҰ�����
		System.out.println(list.get(0)); //step3 Friend ���� alt+shift+s ���� toString overriding �� �� �Է��ϴϱ� ���� ��ü ���� ��ȯ�Ǿ� ��µ�
	
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}
}
