package step8;


class OperaterExam{
	public boolean test1() {
		System.out.println("test1");
		return false;
	}
	public boolean test2() {
		System.out.println("test2");
		return true;
	}
}


public class TestOperator2 {
	public static void main(String[] args) { 
		OperaterExam oe=new OperaterExam();
		//선행조건식에서 false가 나오면 후행조건을 확인할 필요 없으므로 test1()만 실행됨 -> 효과적 
		System.out.println(oe.test1()&&oe.test2());
		System.out.println("****");
		//&: 모든 조건식이 다 실행됨
		System.out.println(oe.test1()&oe.test2());

		
	}
}
