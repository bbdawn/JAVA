package step1;

//Service : ���� business logic 
public class ZooService {
	/*
	 * Person , Dog , Monkey �� ���� �پ��� ��ü�� 
	 * �ϳ��� �޼��� �Ű������� ó���� �� �ִ� -> ������ ������ ����
	 */
	//��Ӱ� �������� ������ ��  
	public void pass(Animal a) { //��ü�� �������̵� �� �޼��尡 ����
		a.eat(); 
	}
	 
	// �Ʒ���  ��Ӱ� �������� �������� �ʰ� ������ �� 
	/*
	 public void pass(Person p) {
		 p.eat();
	 }
	 public void pass(Monkey m) {
		 m.eat();
	 }
	 public void pass(Dog d) {
		 d.eat();
	 }
	 // �� �������� �߰��� ������ �ڵ尡 ����Ǿ�� �Ѵ� TT
	 // ���յ��� ���� -> ������������ ���� 
	 public void pass(Tiger t) {
		 t.eat();
	 }
	 */
}
