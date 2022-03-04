//ÁßÃ¸for¹®
package step5;

public class TestFor3 {
	public static void main(String[] args) {
		//Nested Loop
		System.out.println("¾Æ");
		System.out.println();
		System.out.print("ÀÌ");
		System.out.println("À¯");
		System.out.println("±¤\tÆÒ");//tabÅ° -> \t
		/*
		 * 1	2	3	4	5
		 * 1	2	3	4	5
		 * 1	2	3	4	5
		 * for(){ --> 3¹ø¹Ýº¹
		 * 		for(){ --> 5qjsqksqhr
		 * 	}
		 * }
		 */
		
		int row=3; //3Çà
		int col=5; //5¿­
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=col; j++) {
				System.out.print(j+" \t");
			}//for¹®
			System.out.println();
		}//for¹®	
	}//main
}//class
