package step5;

public class TestFor4 {
	public static void main(String[] args) {
		
	
	/*
	 * 2*1=2	2*2=4			...2*9=18
	 * ...
	 * ...
	 * 9*1=9						9*9=81
	 */
	//������ 2�ܺ��� 9�ܱ��� ��� Nested Loop�� �̿�

		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(i+"*"+j+"="+i*j+" \t");
			}
			System.out.println();
		}//for i
	}
}
