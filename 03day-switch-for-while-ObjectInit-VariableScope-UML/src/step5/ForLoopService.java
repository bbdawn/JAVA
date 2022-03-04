package step5;

public class ForLoopService {
	/*
	 * �׶� 1��
	 * �׶� 2��
	 * �׶� ...
	 * �׶� 11��
	 */
	public void printInfo(String item, int count) {
		//for loop�� �̿��� ���
		for(int i=1; i<=count; i++) {
			System.out.println(item+" "+i+"��");
		}//for
	}

	//�ݺ��Ǵٰ� limit�� ���� ��� �ݺ����� ����� �Ѵ�.
	//�׶� 1�� ~~~ 3��
	//break ���
	public void printInfo2(String item, int count, int limit) {
		for(int i=1; i<=count; i++) {
			System.out.println(item+" "+i+"��");
			if(i==limit) {
				System.out.println("ġ���");
				break;
			}//if
		}//for
	}
}//class
