package step3;

public class TestSuper5 {
	public static void main(String[] args) {
		// ��� , �Ŵ��� 
		// Manager is a Employee :  Employee �� �θ� , Manager �� �ڽ� 
		Employee e=new Employee("1","������",500);
		System.out.println(e.getEmpNo()+" "+e.getName()+" "+e.getSalary());
		Manager m=new Manager("2","�ں���",700,"������");
		System.out.println(m.getEmpNo()+" "
		+m.getName()+" "+m.getSalary()+" "+m.getDepartment());
	}
}
