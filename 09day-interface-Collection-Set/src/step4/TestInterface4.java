package step4;

public class TestInterface4 {
	public static void main(String[] args) {
		PlayerService service=new PlayerService();
		Player pa[]= {new Youtube(), new CDPlayer(), new LPPlayer()};
		service.executeAll(pa);
		
		/*
		 * 유튜브가 동영상을 재생하다
		 * CD Player가 CD를 재생하다
		 * LP Player가 LP를 재생하다
		 */
	}

}
