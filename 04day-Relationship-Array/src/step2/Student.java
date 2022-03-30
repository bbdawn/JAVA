package step2;

public class Student {
	private String name;
	// Student has a NoteBook : aggregation 
	private NoteBook noteBook;	
	public void setNoteBook(NoteBook noteBook) {
		this.noteBook=noteBook;
	}
	//getter 
	public NoteBook getNoteBook() {
		return noteBook;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
