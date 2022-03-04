package step2;
//Stack : LIFO(Last In, First Out) -> ���߿� �Էµ� ��Ұ� ���� ����

import java.util.Stack;

public class TestStack {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		//ctrl+shift+o
		stack.push("a");
		stack.push("b");
		stack.push("c");
		
		/*
		System.out.println(stack);//a b c
		
		System.out.println(stack.pop());//c�� ���� - ���� ���߿� �Էµ� ��Ұ� ���� ���� ����
		System.out.println(stack);//a b
		
		System.out.println(stack.pop()); //b�� ����
		System.out.println(stack);//a
		*/
		
		
		//while���� �̿��� stack�� �ִ� ��� ��Ҹ� ����
		//	(isEmpty(), pop()) �̿�
		while(stack.isEmpty()==false) {//isEmpty()�� ��������� true�̹Ƿ� -> false�ϵ��� �ݺ� (������� ���� ���� �ݺ�)
			System.out.println(stack.pop()); //����Ǵ� ������ ���� ������ �߰��� ��Һ����� LIFO
		}
		System.out.println(stack);
	
	
	}

}
