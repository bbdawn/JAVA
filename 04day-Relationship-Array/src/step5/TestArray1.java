package step5;

public class TestArray1 {

	public static void main(String[] args) {
		//�迭����
		int[]age;
		//�迭 ����
		age=new int[3]; //0���� �ʱ�ȭ�Ǿ��ִ� ����
		System.out.println(age);//�迭��ü�ּҰ�
		System.out.println(age.length);//3 //�迭��ü����
		System.out.println(age[0]); //0 //0���� �ʱ�ȭ�Ǿ��־
		System.out.println(age[2]); //0 //0���� �ʱ�ȭ�Ǿ��־
		//System.out.println(age[3]); //error : exception �߻�. 2������ ����
		
		//�迭 ��ҿ� �� �Ҵ�
		age[0]=22;
		age[1]=33;
		age[2]=25;
		System.out.println(age[1]); //33
		System.out.println("**for loop�� �̿��� age �迭 ��ü�� ��� ��Ҹ� ���**");
		//age.length�� �̿�
		for(int i=0; i<age.length; i++) {
			System.out.println(age[i]);
		}
		
		
		
	}
}//class


