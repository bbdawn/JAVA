package step9;

import java.util.Random;
import java.util.TreeSet;

public class LottoService {
/*
 * 로또번호 1~45까지 중복되지 않는 정수 6개가 set에 저장되어야 한다
 * while loop가 적합. size()가 6보다 작을 동안만 반복하면 된다
 */
	
	public TreeSet<Integer> createLotto() {
		Random r=new Random();
		TreeSet<Integer> set=new TreeSet<Integer>();
		
		//6번을 반복하는 것이 아니라 set의 size()가 6보다 작을동안 반복하는 이유는
		//Random의 nextInt()메서드로 임의의 수를 발생 시킬 때
		//동일한 정수정보가 나올 수 있기 때문에 이 경우 set의 특징인 
		//중복은 인정하지 않기 때문에 size()로 비교하는 것이 적합하다
		while(set.size()<6) {//set의 로또번호가 6개가 될 때 까지 반복
			int num=r.nextInt(45)+1; //45범위는 0~44이므로 +1한다
			set.add(num);//set에 존재하는 값이 입력될 경우 추가되지 않는다 
		}
		return set;
	}

}
