package step2;
// Student has a NoteBook 
public class TestAggregation2 {
	public static void main(String[] args) {
		NoteBook n=new NoteBook("gram","white");
		Student s=new Student();
		s.setName("�ں���");
		System.out.println(s.getName());
		s.setNoteBook(n);
		System.out.println(n);//������ ��Ʈ�� ��ü �ּҰ�
		System.out.println(s.getNoteBook());//������ ��Ʈ�� ��ü �ּҰ�
		//s�� �����ϴ� �ں��� �л��� ������ ��Ʈ���� ������ black ���� ���� 
		//s.getNoteBook() �� ȣ���ϴ� ������ 
		//s �� �ں��� �л� ��ü�� ����� ��Ʈ�� ��ü�� �ּҰ��� ��ȯ�ޱ� ���ؼ���
		//���Ϲ��� ��Ʈ�� ��ü �ּҰ��� ���� setColor �� ȣ���� ��Ʈ�� ������
		//�����Ѵ� 
		s.getNoteBook().setColor("black");
		//�ں��� �л��� ��Ʈ�� ������ ��ȯ�޾� ��� 
		System.out.println(s.getNoteBook().getColor());
	}
}










