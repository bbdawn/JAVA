package step3;

import java.util.ArrayList;

//���� ��� �����غ��� ���� : c
//�Ʒ� list.get(2)���� IndexOutOfBoundsException�� �߻��ǹǷ� a�� ��µ��� �ʰ� catch�� �̵��Ϸ� �ϴµ�
//���ܸ� ó���� ������ Ÿ���� catch������ �����Ƿ� ����ó���� �����Ͽ� ���� �����ϰ� �Ǵµ� 
//finally������ �׻� ����ǹǷ� c�� ��µǰ� 
//!!!!!!!�����������̹Ƿ� d�� ��µ��� �ʴ´�!!!!!!!

public class TestException8 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("�����");
		list.add("������");
		try {
		list.get(2);
		System.out.println("a");
		}catch(NullPointerException e) {
			System.out.println("b");
		}finally {
			System.out.println("c");
		}
		System.out.println("d");
		
		
		
		
	}//main
}//class
