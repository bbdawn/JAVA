package step1;

public class TestStatic6 {

	public static void main(String[] args) {
		//javase api���� �����ϴ� static member�� ����غ���
		System.out.println(Short.MAX_VALUE);//static�̹Ƿ� Ŭ������, ����� ����
		String s1="2";
		String s2="8";
		System.out.println(s1+s2);//28 -> ���ڿ��� ���Ʊ� ����
		//���ڿ��� ���������� ��ȯ
		int i=Integer.parseInt(s1); //static method�̹Ƿ� Ŭ���������� �����ϸ� �ȴ�
		int j=Integer.parseInt(s2);
		System.out.println(i+j);
	}

}
