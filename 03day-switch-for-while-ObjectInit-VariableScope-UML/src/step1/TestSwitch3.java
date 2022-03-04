//TestSwitch3.java + DataService
//월별 마지막일 (switch), 메소드 public
package step1;

public class TestSwitch3 {
	public static void main(String[] args) {
		
		DateService service= new DateService();		
		service.printLastDay(2);
		service.printLastDay(4);
		service.printLastDay(1);
	}//main
}//class
