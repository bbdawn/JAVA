package step7;

import step4.Animal;
import step4.Person;

public class ZooService4 {
	public void playAll(Animal[] a) {//Animal [] 타입으로 매개변수 선언 
		for(int i=0;i<a.length;i++) {
			if(a[i] instanceof Person) {
				((Person)a[i]).ticketing();//Object Casting
			}
			a[i].play();
		}
	}
}
