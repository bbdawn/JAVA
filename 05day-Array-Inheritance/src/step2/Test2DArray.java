package step2;

public class Test2DArray {
	public static void main(String[] args) {
		//2���� �迭 �׽�Ʈ
		int rain[][]=new int[3][12];//3�Ⱓ �ſ�(12����) ������ �����Ϸ���
		System.out.println(rain[0]);//ù��° �迭(1����) ��ü �ּҰ� ���
		System.out.println(rain[1].length);//2���� �迭�� ����
		//ù���� 1���� ���췮 100�� ����
		rain[0][0]=100;
		//������ 3������ 12���� ���췮 150�� ����
		rain[2][11]=150;
		System.out.println(rain[2][11]);
		System.out.println("********************");
		
		//��� ���а� �� 3�г�. 1�г� 3����, 2�г� 4����, 3�г� 6����
		int[][]school=new int[3][]; //1����(1�г�,2�г�,3�г�) ������
	 	school[0]=new int[3];//1�г� -> 3���� ����
	 	school[1]=new int[4];//2�г� -> 4���� ����
	 	school[2]=new int[6];//3�г� -> 5���� ����
	 	
	 	//��� ���б� ������ �г��� ������ �ݿ� 20���� �Ҵ�
	 	school[2][5]=20; //3�г� 6��
	 	int i=school.length-1; //2 //�г��� ������ �ε��� // length�� �� �����̰� 
	 	int j=school[i].length-1;//5 //���� ������ �ε��� // index�� 0���� �����ϹǷ� -1�� ���ش�
	 	System.out.println(school[i][j]); 
	 	System.out.println(school[2][5]);
	 	
	}

}


