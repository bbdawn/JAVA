//��øfor��
package step5;

public class TestFor3 {
	public static void main(String[] args) {
		//Nested Loop
		System.out.println("��");
		System.out.println();
		System.out.print("��");
		System.out.println("��");
		System.out.println("��\t��");//tabŰ -> \t
		/*
		 * 1	2	3	4	5
		 * 1	2	3	4	5
		 * 1	2	3	4	5
		 * for(){ --> 3���ݺ�
		 * 		for(){ --> 5qjsqksqhr
		 * 	}
		 * }
		 */
		
		int row=3; //3��
		int col=5; //5��
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=col; j++) {
				System.out.print(j+" \t");
			}//for��
			System.out.println();
		}//for��	
	}//main
}//class
