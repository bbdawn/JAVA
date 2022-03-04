package step8;
import step5.solution.*;
public class TestPolymorphismEx {
	public static void main(String[] args) {
		int length=10;
		// service�� �ν��Ͻ� ������ ����� 10�� ���̸� ���� �迭�� �����ؼ� �Ҵ��Ѵ� 
		HumanResourceService service=new HumanResourceService(length);
		service.add(new Manager("1","������",600,"���������"));
		service.add(new Employee("2","���ϴ�",400));
		service.add(new Engineer("3","�ں���",700,"�ڹ�"));
		service.printAll();
		/*
		 	empNo:1   name:������   salary:600  department:��������� 
		 	empNo:2   name:���ϴ�   salary:400 
		 	empNo:3   name:�ں���   salary:700  skill:�ڹ�  
		 */
	}
}
