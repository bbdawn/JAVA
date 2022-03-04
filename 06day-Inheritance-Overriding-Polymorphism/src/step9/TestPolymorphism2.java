package step9;
// ������ ����� ������ Ȯ���ϴ� ���� 
class Product{}
class Food extends Product{}
class Computer extends Product{}
class Phone extends Product{}
class KostaMarketService{ 
	// Product �迭�� �ڽ� ��ü�� ���� �پ��ϰ� �����Ѵٸ� �Ʒ��� ���� ����� ��ȿ�����̴� 
	// ���յ�(coupling) �� ���� ����, �� ��ǰ ������ �����Ǹ� �޼��尡 �߰��Ǿ�� �ϴ� ���� -> ������������ ����  
	/*
	public void buy(Food f) {} 
	public void buy(Computer c) {} 
	public void buy(Phone p) {} 
	*/
	// �Ʒ��� ���� �������� ����Ǵ� �θ� Ÿ������ �Ű������� �����ϸ� �ϳ��� �޼���� �پ��� ��ü�� ó���� �� �ִ� 
	// �� ���� �������� �����̴� 
	// �������̶� �ϳ��� �������̽�(�����:buy�޼���)�� �پ��� ��ü��(Food,Computer,Phone...)�� 
	// ������ ������� �����ϰ� �ϴ� �����̴� 
	public void buy(Product p) {// �ϳ��� �θ� Ÿ�� Person ������������ �Ű������� p�� �پ��� �ڽİ�ü�� ���޹޾� ó��
		System.out.println(p.getClass().getName()+" ���ſϷ�!");
	}
}
public class TestPolymorphism2 {
	public static void main(String[] args) {
		KostaMarketService service=new KostaMarketService();
		service.buy(new Food());
		service.buy(new Computer());
		service.buy(new Phone());   
	}
}
