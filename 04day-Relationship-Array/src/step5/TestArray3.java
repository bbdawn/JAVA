package step5;

public class TestArray3 {

	public static void main(String[] args) {
		// �迭�� ���� ���� �Ҵ��� ���ÿ�
		int[]point={700, 200, 400, 900, 1000};
		int num = 500;
		
		//point �迭 ��� �� num�� �ʰ��ϴ� ��ҵ鸸 ���
		//for loop, if
		for(int i=0; i<point.length; i++) {
			if(point[i]>num) {
				System.out.println(point[i]);
			}//if
		}//for
		
	}
}
