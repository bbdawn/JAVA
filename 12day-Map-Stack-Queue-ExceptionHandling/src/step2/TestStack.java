package step2;
//Stack : LIFO(Last In, First Out) -> 나중에 입력된 요소가 먼저 추출

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
		
		System.out.println(stack.pop());//c가 추출 - 가장 나중에 입력된 요소가 가장 먼저 추출
		System.out.println(stack);//a b
		
		System.out.println(stack.pop()); //b가 추출
		System.out.println(stack);//a
		*/
		
		
		//while문을 이용해 stack에 있는 모든 요소를 추출
		//	(isEmpty(), pop()) 이용
		while(stack.isEmpty()==false) {//isEmpty()는 비어있으면 true이므로 -> false일동안 반복 (비어있지 않을 동안 반복)
			System.out.println(stack.pop()); //추출되는 순서는 가장 마지막 추가된 요소부터임 LIFO
		}
		System.out.println(stack);
	
	
	}

}
