package step2;

import java.util.LinkedList;
import java.util.Queue;

//Queue : FIFO(First In, First Out) -> ���� �Էµ� ��Ұ� ���� ����
public class TestQueue {
	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		//ctrl+shift+o
		queue.add("�ȳ�");
		queue.add("����");
		queue.add("���� �� �־�?");
		
		//System.out.println(queue.poll()); //���� ���� �Էµ� ��Ұ� ���
		
		while(!queue.isEmpty()) {//while(stack.isEmpty()==false)�� ������ ǥ����!!!
			System.out.println(queue.poll());
		}
		System.out.println(queue);
	
	}
}
