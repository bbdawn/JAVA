package Step6;


public class TestInterface6 {
	public static void main(String[] args) {
		//Interface�� implements�� ���¿��� Object down casting�� �غ��� ����
		PlayerService service=new PlayerService();
		service.proceed(new Youtube());
		service.proceed(new CDPlayer());
		
		
	}
}
