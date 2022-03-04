package Step6;


public class TestInterface6 {
	public static void main(String[] args) {
		//Interface를 implements한 상태에서 Object down casting을 해보는 예제
		PlayerService service=new PlayerService();
		service.proceed(new Youtube());
		service.proceed(new CDPlayer());
		
		
	}
}
