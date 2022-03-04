package step8;

import java.util.Random;

public class TestRandom {
	public static void main(String[] args) {
		Random r=new Random();
		for(int i=0; i<10; i++)
		System.out.println(r.nextInt(3)); //범위를 3으로 주면 0,1,2 중 랜덤한 수가 반환 
	}
}
