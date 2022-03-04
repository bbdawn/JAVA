package step08.test2;

import java.text.SimpleDateFormat;

public class TestTime {
	/*
	 * 유일한 파일명을 만들기 위해 파일 생성시간을 이용한 정보를 만드는 예제
	 * System.currentTimeMillis()메서드를 이용하면 됨
	 * 반환되는 타입이 long형, 세계표준시 1970년 1월 1일 0시 0분 기준으로 몇 밀리세컨드가 흘렀는지 
	 */
	public static void main(String[] args) {
		//System.out.println(System.currentTimeMillis());
		long time=System.currentTimeMillis();
		System.out.println(time);
		//시간 포맷을 설정해서 확인해본다 
		SimpleDateFormat s=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.SSS");
		String nowTime=s.format(time);
		System.out.println(nowTime);
	}
}
