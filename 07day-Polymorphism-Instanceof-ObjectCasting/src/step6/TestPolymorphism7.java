package step6;
// ������ ���� �迭 ���� 
class Car{}
class Animal{}
class Person extends Animal{}
class Dog extends Animal{}
public class TestPolymorphism7 {
	public static void main(String[] args) {
		// Car type�� �迭�̹Ƿ� ��Ҵ� Car ��ü�鸸 �߰� ���� , �Ʒ�ó�� Animal�� �߰��ϸ� compile error
		// ������ �迭 Ÿ���� �����͸� ��ҷ� �߰��� �� �ִ� 
		//Car[] carArray= {new Car(),new Car(),new Animal()};
		// ������ �Ʒ�ó�� �θ�Ÿ���� �迭�� �ڽ� ��ü�� ��ҷ� �߰��� �� �ִ� -> ������ ���� �迭 
		Animal [] aniArray= {new Animal(),new Person(),new Dog()};
		for(int i=0;i<aniArray.length;i++)
			System.out.println(aniArray[i]);
	}
}





