package step5;

import java.util.Scanner;

public class TestConsoleInput3 {
	public static void main(String[] args) {
		/*
		 * TestConsoleInput2�� ���� ���
		 * do-while�� ����
		 * �����ϴ� ���ø��� �Է��ϼ���: ���� 
		 * ���ø�: ���� 
		 * �����ϴ� ���ø��� �Է��ϼ���: ���� 
		 * ���ø�: ���� 
		 * �����ϴ� ���ø��� �Է��ϼ���: ����
		 * ���ø�: ���� 
		 * �����ϴ� ���ø��� �Է��ϼ���: ���� 
		 * ���α׷��� ����Ǿ����ϴ�
		 */
		/*
		 * scanner
		 *do{
		 *
		 *}while();//���ᰡ �ƴҶ����� ��� �ݺ�
		 */
		
			
		
		//�������
		
		Scanner s = new Scanner(System.in);
		String city=null;//local variable�� ����� �ڽ��� ���࿵��{}�������� ��밡���ϹǷ� ���⿡�� �����Ѵ�
		do {
			System.out.print("�����ϴ� ����: ");
			city = s.nextLine();
			if(city.equals("����")==false)//���ᰡ �ƴҶ��� ����Ѵ�
			System.out.println("���ø�: " + city);
		}while(city.equals("����")==false);{//���ᰡ �ƴҵ��� ��� �ݺ��Ѵ�
		System.out.println("���α׷��� ����Ǿ����ϴ�");
		s.close();
		}
	}
	}// main

