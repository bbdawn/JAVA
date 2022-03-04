package step9;

import java.util.TreeSet;

public class TestLottoService {
	public static void main(String[] args) {
		/*
		 * 로또번호는 1~45까지 중복되지 않은 정수가 5개 정렬되어 표현된다 -> 중복x,정렬
		 */
	
		LottoService service=new LottoService();
		//5게임
		for(int i=0; i<5; i++) {
			TreeSet<Integer> set=service.createLotto();
			System.out.println("대박로또번호:"+set);
		}
 
		
		
	}
}
