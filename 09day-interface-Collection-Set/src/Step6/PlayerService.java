package Step6;

public class PlayerService {
	public void proceed(Player p) {
		if(p instanceof CDPlayer) {//p�� �����ϴ� ��ü�� CDPlayer�̸�
			//p������ Object Casting �ؼ� ���� ��ü�� ������ ����� ����
			((CDPlayer) p).insertCd();
		}
		
		
		p.play();
	}
}
