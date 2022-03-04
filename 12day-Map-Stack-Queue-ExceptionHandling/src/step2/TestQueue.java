package step2;

import java.util.LinkedList;
import java.util.Queue;

//Queue : FIFO(First In, First Out) -> 먼저 입력된 요소가 먼저 추출
public class TestQueue {
	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		//ctrl+shift+o
		queue.add("안녕");
		queue.add("어디야");
		queue.add("무슨 일 있어?");
		
		//System.out.println(queue.poll()); //가장 먼저 입력된 요소가 출력
		
		while(!queue.isEmpty()) {//while(stack.isEmpty()==false)과 동일한 표현임!!!
			System.out.println(queue.poll());
		}
		System.out.println(queue);
	
	}
}
