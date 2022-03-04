package step4;

public class ZooService3 {
	//Animal 부모타입으로 다양한 자식 객체를 처리 
   public void enter(Animal a) {
	   //instanceof로 Person 인지 확인 
	   if(a instanceof Person) {
		   //Person의 독자적 멤버를 실행하기 위해 Object Casting한다
		   ((Person) a).ticketing();
	   }
	   a.play();
   }
}
