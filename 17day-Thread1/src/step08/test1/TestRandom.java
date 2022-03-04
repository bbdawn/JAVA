package step08.test1;

import java.util.Random;

public class TestRandom {
	public static void main(String[] args) {
		//mp3 or avi 문자열을 랜덤하게 생성
		Random r=new Random();
		String ext=null;
		if(r.nextBoolean()) {//true false가 랜덤하게 나옴
			ext=".avi";
		}else {
			ext=".mp3";
		}
		System.out.println(ext);
	}
}
