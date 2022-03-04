package step1;
//코드 보고 결과 예상해보기, 메모리 상태 예상해보기
//instance variable(heap)과 static variable(meta space)의 메모리 구조를 살펴보는 예제
//붕어빵틀에서 몇 개의 붕어빵을 만들었느냐를 특정 공간에 정보를 저장해서 누적시키는 프로그램

//non-static에서 static으로는 직접 접근 가능
//static에서	 non-static으로는 직접 접근 불가


class Fish{
	int count;			//heap에 별도로 만들어짐(매번 새롭게 초기화)
	static int sCount; 	//metaspace에 저장됨 (공간이 하나밖에 없음. 계속해서 누적됨!!)
	Fish(){ 
		count++;
		sCount++;
	}
}

public class TestStatic4 {

	public static void main(String[] args) {
		Fish f1=new Fish(); 					//1. sCount 0->1 2. stack에 100번지 생성 3.Heap에 100번지 Count0->1
		System.out.println(f1.count); //1
		System.out.println(Fish.sCount); // 1
		
		Fish f2=new Fish(); 					//1. stack에 f2 101번지 생성 2. Heap에 101번지 Count0->1
		System.out.println(f2.count); //1
		System.out.println(Fish.sCount); //2
		
		Fish f3=new Fish();
		System.out.println(f3.count); //1
		System.out.println(Fish.sCount); //3

	}

}
