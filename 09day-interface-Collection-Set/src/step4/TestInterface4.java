package step4;

public class TestInterface4 {
	public static void main(String[] args) {
		PlayerService service=new PlayerService();
		Player pa[]= {new Youtube(), new CDPlayer(), new LPPlayer()};
		service.executeAll(pa);
		
		/*
		 * ��Ʃ�갡 �������� ����ϴ�
		 * CD Player�� CD�� ����ϴ�
		 * LP Player�� LP�� ����ϴ�
		 */
	}

}
