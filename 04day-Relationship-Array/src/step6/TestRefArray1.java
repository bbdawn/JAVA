//TestRefArray1 + Person
package step6;

public class TestRefArray1 {

	public static void main(String[] args) {
		// ������ ������(��ü)
		
		// �迭 ����
		Person[]pa;
		
		//�迭 ����
		pa=new Person[3];
		System.out.println(pa[0]); //null //null(���ڿ�)�� �ʱ�ȭ�Ǿ��ִ� ����
		System.out.println(pa.length); //3
		
		//�迭 ��� �Ҵ�
		pa[0]=new Person("������",30);
		pa[1]=new Person("�ں���",28);
		pa[2]=new Person("RM",26);
		
	
		//pa �迭�� ����� name�� ��� ���
		//for loop ��� ����� ������ �ں��� RM
		
		for(int i=0; i<pa.length; i++) {
			System.out.println(pa[i].getName());
		}
		
		
	}

}
