package Step6;

public class PlayerService {
	public void proceed(Player p) {
		if(p instanceof CDPlayer) {//p가 참조하는 객체가 CDPlayer이면
			//p변수를 Object Casting 해서 하위 객체의 독자적 멤버에 접근
			((CDPlayer) p).insertCd();
		}
		
		
		p.play();
	}
}
