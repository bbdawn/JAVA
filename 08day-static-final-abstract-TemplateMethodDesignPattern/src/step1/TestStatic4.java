package step1;
//�ڵ� ���� ��� �����غ���, �޸� ���� �����غ���
//instance variable(heap)�� static variable(meta space)�� �޸� ������ ���캸�� ����
//�ؾƲ���� �� ���� �ؾ�� ��������ĸ� Ư�� ������ ������ �����ؼ� ������Ű�� ���α׷�

//non-static���� static���δ� ���� ���� ����
//static����	 non-static���δ� ���� ���� �Ұ�


class Fish{
	int count;			//heap�� ������ �������(�Ź� ���Ӱ� �ʱ�ȭ)
	static int sCount; 	//metaspace�� ����� (������ �ϳ��ۿ� ����. ����ؼ� ������!!)
	Fish(){ 
		count++;
		sCount++;
	}
}

public class TestStatic4 {

	public static void main(String[] args) {
		Fish f1=new Fish(); 					//1. sCount 0->1 2. stack�� 100���� ���� 3.Heap�� 100���� Count0->1
		System.out.println(f1.count); //1
		System.out.println(Fish.sCount); // 1
		
		Fish f2=new Fish(); 					//1. stack�� f2 101���� ���� 2. Heap�� 101���� Count0->1
		System.out.println(f2.count); //1
		System.out.println(Fish.sCount); //2
		
		Fish f3=new Fish();
		System.out.println(f3.count); //1
		System.out.println(Fish.sCount); //3

	}

}
