package step2;
//Generic Ư���� Ȯ��

import java.util.ArrayList;

class Animal{}

class Person extends Animal{}

class Dog extends Animal{}

class Car{}

public class TestGeneric {
	public static void main(String[] args) {
		/*
		ArrayList list=new ArrayList(); //���� ctrl+shift+o ������ -> ���κ� import~~ �������
		list.add(new Animal());
		list.add(new Person());
		list.add(new Dog());
		list.add(new Car());
		*/
		//���� generic�� ������� �ʴ� list�� Object Ÿ������ ó���ǹǷ� ��� Ÿ���� ��ü�� ���� �� �ִ�. 
		//�Ʒ��� generic�� ����� gList�� ���غ���
		
		//Generic�� Animal�� �����ؼ� Animal ���������� �ִ� ��ü�� ����Ʈ�� �㵵�� ó���Ѵ� 
		ArrayList<Animal> gList=new ArrayList<Animal>();
		gList.add(new Animal());
		gList.add(new Person());
		gList.add(new Dog());
		//gList.add(new Car()); //error: Animal ���������� ���� ���� Car ��ü�� ��ҷ� �߰��� �� ����
		
	}
}
