package step5;

public class TestArray2 {
	public static void main(String[] args) {
		int[]salary=new int[4];
		salary[0]=200;
		salary[1]=500;
		salary[2]=900;
		salary[3]=700;
		int totalSalary=0;
		//for loop �̿� salary �迭 ����� ������ ���Ѵ�.
		for(int i=0; i<salary.length; i++) {
			//totalSalary=totalSalary+salary[i]; 
			totalSalary+=salary[i];
		}
		
		
		
		System.out.println("�Ѿ�: "+totalSalary);
	}//main
}
