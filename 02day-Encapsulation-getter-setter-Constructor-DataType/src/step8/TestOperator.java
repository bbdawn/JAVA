package step8;

public class TestOperator {
	public static void main(String[] args) {
		//�ڹ� ������ �׽�Ʈ
		
		int i=7;
		int j=3;
		System.out.println(i*j); //���ϱ� 	//21
		System.out.println(i/j); //�� 		//2
		System.out.println(i%j); //������	//1
		System.out.println(i==j); //������ �� // false
		System.out.println(i=j); //�Ҵ�
		System.out.println(i==j); //������ �� // true (�Ҵ������ϱ�)
		boolean flag=false;
		System.out.println(flag); 				//false
		System.out.println(!flag); 				//true
		
		System.out.println("**����������**");
		int k=7;
		System.out.println(k++);	//���� �� ���� //7
		System.out.println(k); 					  //8
		System.out.println(++k);	//���� �� ���� //9
		System.out.println(k);					  //9
		System.out.println(--k); 	//���� �� ���� //8
		System.out.println(++k);	//���� �� ���� //8	
		System.out.println("**************");
		
		int money=100;
		//money ������ 200�� ���� 
		//money = money + 200;
		//�� �ڵ带 �ٿ��� ǥ���ϸ� �Ʒ��� ����
		money+=200;
		System.out.println(money);
		//���� money���� 100�� �����غ���
		money-=100;
		System.out.println(money);
		
		System.out.println("**���׿�����**");
		/*
		 *  (���ǽ�) ? ��1 : ��2
		 *  //���ǽ��� true�̸� ��1�� ����, false�̸� ��2�� ����
		 */
		int x=10;
		int result=(x>0) ? x+1 : x-1;
		System.out.println(result);
		/*
		 *  and ����(&&), or����(||)
		 *  
		 *  and���� (&&)
		 *  true	true 	->	true
		 *  true	false	->	false
		 *  false	true	->	false
		 *  false	false	->	false
		 *  
		 *  or���� (||)
		 *  true	true 	->	true
		 *  true	false	->	true
		 *  false	true	->	true
		 *  false	false	->	false
		 */
	}
}






