package step7;

public class TestStringAndStringBuilder {
	public static void main(String[] args) {
		String name="������";//���, �Һ�, ������ ���� ������ �����ϴ� �����̹Ƿ�
		System.out.println(name.concat("¯"));//������¯�̶�� ���ڿ��� ���� ����
		String name2="������";//name�� ������ �����͸� ����(heap ���� �� String Constant Pool�� ������ �ϳ��� ����ǹǷ�)
		System.out.println(name+" "+name2);//������ ������
		
		StringBuilder sb=new StringBuilder("�ں���");//����
		System.out.println(sb.append("��"));//���ڿ� ��ü�� ����
		System.out.println(sb);//�ں��˱� -> ���� ��ü�� ����ǹǷ�
		
		
	}
}
