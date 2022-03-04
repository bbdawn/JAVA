package step6;
//최상위 클래스인 java.lang.Object의 toString()메서드를 오버라이딩하여 사용하는 예제
//Object toString()은 기본적으로 객체의 주소값을 반환하게 구성되어져있다
//이 메서드를 오버라이드해서 주소값 대신 객체의 속성정보를 리턴하는 방식으로 많이 사용되므로
//아래 예제에서 연습해본다
class Food{
	String menu;
	int price;
	Food(String menu, int price){
		this.menu=menu;
		this.price=price;
	}
	//Object로부터 상송받은 toString()오버라이드해서 주소값 대신 객체의 속성정보를 리턴하도록 재정의
	public String toString() {
		return "menu:"+menu+" price: "+price;
	}
	
}
public class TestObject2 {
	public static void main(String[] args) {
		Food f=new Food("스파게티", 9000);
		System.out.println(f.toString());//주소값 대신 객체의 실제 속성값이 출력
		System.out.println(f);//내부적으로 toString 호출해서 리턴하기 때문에 윗라인 코드와 동일한 결과 
	}
	
}
