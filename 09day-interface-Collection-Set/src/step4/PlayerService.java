package step4;

public class PlayerService {
	public void executeAll(Player[] p) {
		//for loop�� �̿��� ��� ����⸦ play ��Ų��
		for(int i=0; i<p.length;i++) {
			p[i].play();	
		}
	}

}
