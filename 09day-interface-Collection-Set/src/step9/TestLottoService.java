package step9;

import java.util.TreeSet;

public class TestLottoService {
	public static void main(String[] args) {
		/*
		 * �ζǹ�ȣ�� 1~45���� �ߺ����� ���� ������ 5�� ���ĵǾ� ǥ���ȴ� -> �ߺ�x,����
		 */
	
		LottoService service=new LottoService();
		//5����
		for(int i=0; i<5; i++) {
			TreeSet<Integer> set=service.createLotto();
			System.out.println("��ڷζǹ�ȣ:"+set);
		}
 
		
		
	}
}
