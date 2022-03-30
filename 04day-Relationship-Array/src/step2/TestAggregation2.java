package step2;
// Student has a NoteBook 
public class TestAggregation2 {
	public static void main(String[] args) {
		NoteBook n=new NoteBook("gram","white");
		Student s=new Student();
		s.setName("박보검");
		System.out.println(s.getName());
		s.setNoteBook(n);
		System.out.println(n);//동일한 노트북 객체 주소값
		System.out.println(s.getNoteBook());//동일한 노트북 객체 주소값
		//s가 참조하는 박보검 학생이 소유한 노트북의 색상을 black 으로 변경 
		//s.getNoteBook() 을 호출하는 이유는 
		//s 즉 박보검 학생 객체에 저장된 노트북 객체의 주소값을 반환받기 위해서임
		//리턴받은 노트북 객체 주소값을 통해 setColor 를 호출해 노트북 색상을
		//변경한다 
		s.getNoteBook().setColor("black");
		//박보검 학생의 노트북 색상을 반환받아 출력 
		System.out.println(s.getNoteBook().getColor());
	}
}










