package step4;
/*
 * UnCheckedException : 별도의 throws 없이도 전파, RuntimeException계열(계층구조하에 있는 예외)
 * 
 */
public class TestThrows3 {
	public static void main(String[] args) {
		NameService service=new NameService();
		//정상적인 데이터
		//service.printMessage("장범준");
		
		//잘못된 데이터
		service.printMessage(null);
		try {
			service.printMessage(null);
		}catch(NullPointerException e) {
			System.out.println("정상적인 이름을 입력하세요");
		}
		System.out.println("프로그램 정상 수행");
		
	}

}
