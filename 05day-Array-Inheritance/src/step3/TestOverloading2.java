package step3;

public class TestOverloading2 {
	public static void main(String[] args) {
		//Constructor Overloading 생성자 오버로딩
		//다양한 정보로 객체를 구성
		KostaMember m=new KostaMember();
		KostaMember m2=new KostaMember("java");
		KostaMember m3=new KostaMember("spring","아이유");
		System.out.println(m.getId()+" "+m.getName());
		System.out.println(m2.getId()+" "+m2.getName());
		System.out.println(m3.getId()+" "+m3.getName());
		
		
	}
}
