package step08.test1;

import java.util.Random;

public class TestRandom {
	public static void main(String[] args) {
		//mp3 or avi ���ڿ��� �����ϰ� ����
		Random r=new Random();
		String ext=null;
		if(r.nextBoolean()) {//true false�� �����ϰ� ����
			ext=".avi";
		}else {
			ext=".mp3";
		}
		System.out.println(ext);
	}
}
