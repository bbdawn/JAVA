package step08.test2;

import java.text.SimpleDateFormat;

public class TestTime {
	/*
	 * ������ ���ϸ��� ����� ���� ���� �����ð��� �̿��� ������ ����� ����
	 * System.currentTimeMillis()�޼��带 �̿��ϸ� ��
	 * ��ȯ�Ǵ� Ÿ���� long��, ����ǥ�ؽ� 1970�� 1�� 1�� 0�� 0�� �������� �� �и������尡 �귶���� 
	 */
	public static void main(String[] args) {
		//System.out.println(System.currentTimeMillis());
		long time=System.currentTimeMillis();
		System.out.println(time);
		//�ð� ������ �����ؼ� Ȯ���غ��� 
		SimpleDateFormat s=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.SSS");
		String nowTime=s.format(time);
		System.out.println(nowTime);
	}
}
