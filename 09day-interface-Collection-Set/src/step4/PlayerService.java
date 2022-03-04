package step4;

public class PlayerService {
	public void executeAll(Player[] p) {
		//for loop를 이용해 모든 재생기를 play 시킨다
		for(int i=0; i<p.length;i++) {
			p[i].play();	
		}
	}

}
