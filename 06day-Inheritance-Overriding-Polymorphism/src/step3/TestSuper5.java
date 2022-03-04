package step3;

public class TestSuper5 {
	public static void main(String[] args) {
		// 사원 , 매니저 
		// Manager is a Employee :  Employee 이 부모 , Manager 가 자식 
		Employee e=new Employee("1","아이유",500);
		System.out.println(e.getEmpNo()+" "+e.getName()+" "+e.getSalary());
		Manager m=new Manager("2","박보검",700,"영업부");
		System.out.println(m.getEmpNo()+" "
		+m.getName()+" "+m.getSalary()+" "+m.getDepartment());
	}
}
