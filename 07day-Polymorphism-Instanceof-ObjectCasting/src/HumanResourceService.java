
import step5.solution.*;

public class HumanResourceService {
	private Employee[] array;
	private int count; // ���� ����� , �ν��Ͻ� �����̹Ƿ� �⺻ �ʱ�ȭ 0 
	public HumanResourceService(int length) {
		array=new Employee[length];
	}
	/*
	 * �Ű������� ���޹��� ���or�Ŵ���or�����Ͼ �迭 ��ҷ� �߰��Ѵ� 
	 * ���� ����� ������ �����ϴ� count�� �����Ѵ� 
	 */
	public void add(Employee employee) {//�θ� Ÿ������ �����Ͽ� �پ��� �ڽİ�ü�� ���� �� ���� 
		array[count]=employee;//�迭 ��ҷ� �Ű������� ���޵� ������ �߰� 
		count++; //��Ұ� �߰��Ǿ����Ƿ� count�� 1 �����Ѵ� 
	}
	// ���� �������ŭ �ݺ��ؼ� ������ ����Ѵ� 
	public void printAll() {
		for(int i=0;i<count;i++) {
			System.out.println(array[i]);//���������� toString()�� ȣ��� 
		}
	}
}










