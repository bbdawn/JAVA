package step5.solution;

public class TestPolymorphism6 {
	public static void main(String[] args) {
		
		CompanyService service=new CompanyService();
		service.printDetailInfo(new Manager("1","아이유",500,"연구개발"));
		// empNo:1 name:아이유 salary:500 department:연구개발
		service.printDetailInfo(new Employee("2","강하늘",400));
		// empNo:2 name:강하늘 salary:400
		service.printDetailInfo(new Engineer("3","제임스고슬링",600,"자바"));
		// empNo:3 name:제임스고슬링 salary:600 skill:자바 
		 
	}
}
