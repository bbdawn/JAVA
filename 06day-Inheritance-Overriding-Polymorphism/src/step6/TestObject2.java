package step6;
//�ֻ��� Ŭ������ java.lang.Object�� toString()�޼��带 �������̵��Ͽ� ����ϴ� ����
//Object toString()�� �⺻������ ��ü�� �ּҰ��� ��ȯ�ϰ� �����Ǿ����ִ�
//�� �޼��带 �������̵��ؼ� �ּҰ� ��� ��ü�� �Ӽ������� �����ϴ� ������� ���� ���ǹǷ�
//�Ʒ� �������� �����غ���
class Food{
	String menu;
	int price;
	Food(String menu, int price){
		this.menu=menu;
		this.price=price;
	}
	//Object�κ��� ��۹��� toString()�������̵��ؼ� �ּҰ� ��� ��ü�� �Ӽ������� �����ϵ��� ������
	public String toString() {
		return "menu:"+menu+" price: "+price;
	}
	
}
public class TestObject2 {
	public static void main(String[] args) {
		Food f=new Food("���İ�Ƽ", 9000);
		System.out.println(f.toString());//�ּҰ� ��� ��ü�� ���� �Ӽ����� ���
		System.out.println(f);//���������� toString ȣ���ؼ� �����ϱ� ������ ������ �ڵ�� ������ ��� 
	}
	
}
