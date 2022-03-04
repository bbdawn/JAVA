package step5;

public class TestArray2 {
	public static void main(String[] args) {
		int[]salary=new int[4];
		salary[0]=200;
		salary[1]=500;
		salary[2]=900;
		salary[3]=700;
		int totalSalary=0;
		//for loop 이용 salary 배열 요소의 총합을 구한다.
		for(int i=0; i<salary.length; i++) {
			//totalSalary=totalSalary+salary[i]; 
			totalSalary+=salary[i];
		}
		
		
		
		System.out.println("총액: "+totalSalary);
	}//main
}
