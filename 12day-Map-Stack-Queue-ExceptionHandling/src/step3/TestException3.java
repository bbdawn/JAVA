package step3;

import java.util.ArrayList;

/*
 * case3
 * �ϳ��� try ������ ���� ������ Exception�� �߻��Ǵ� ����� ���� ó�����
 * �ϳ��� try ���� ���� ���� ���� catch������ ���� �����ϴ�
 * try{
 * }catch(AException e){
 * }catch(BException e){
 * }
 */

public class TestException3 {
	public static void main(String[] args) {
		
		String name="������";
		ArrayList<String> list=new ArrayList<String>();
		list.add("�ں���");
		try {
		//Exception�߻� ��� �ش� ExceptionŸ���� catch �������� ������ �帧�� �̵��ȴ�. 
		System.out.println(list.get(1)); //�������� �ʴ� ��Ҹ� ��ȯ�������� �Ѵ� -> IndexOutOfBoundsException �߻���. 
		System.out.println(name.length()); //NullPointException�߻��ǰ� �޼��� ��� �� ��� �����. 
		}catch(NullPointerException e) {
			System.out.println("name�� null�̹Ƿ� ���̸� ���� �� �����ϴ� -> ��� ����");
		}catch(IndexOutOfBoundsException e2) {
			System.out.println("����Ʈ�� �������� �ʴ� ������ ����Դϴ� -> ��� ����");
		}catch(Exception e) {//���� ���� Ŭ������ Exception���� �پ��� ���ܸ� ó���� �� �ִ�
			System.out.println("����ó�� - ��Ƚ���");
		}
		System.out.println("���α׷� ���� ����");
	}
}
