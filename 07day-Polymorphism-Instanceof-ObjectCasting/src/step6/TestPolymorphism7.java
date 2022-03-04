package step6;
// 다형성 적용 배열 예제 
class Car{}
class Animal{}
class Person extends Animal{}
class Dog extends Animal{}
public class TestPolymorphism7 {
	public static void main(String[] args) {
		// Car type의 배열이므로 요소는 Car 객체들만 추가 가능 , 아래처럼 Animal을 추가하면 compile error
		// 선언한 배열 타입의 데이터만 요소로 추가할 수 있다 
		//Car[] carArray= {new Car(),new Car(),new Animal()};
		// 하지만 아래처럼 부모타입의 배열에 자식 객체를 요소로 추가할 수 있다 -> 다형성 적용 배열 
		Animal [] aniArray= {new Animal(),new Person(),new Dog()};
		for(int i=0;i<aniArray.length;i++)
			System.out.println(aniArray[i]);
	}
}





