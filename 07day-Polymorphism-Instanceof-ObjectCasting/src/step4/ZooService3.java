package step4;

public class ZooService3 {
	//Animal �θ�Ÿ������ �پ��� �ڽ� ��ü�� ó�� 
   public void enter(Animal a) {
	   //instanceof�� Person ���� Ȯ�� 
	   if(a instanceof Person) {
		   //Person�� ������ ����� �����ϱ� ���� Object Casting�Ѵ�
		   ((Person) a).ticketing();
	   }
	   a.play();
   }
}
