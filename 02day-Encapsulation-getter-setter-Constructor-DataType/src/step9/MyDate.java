package step9;

public class MyDate {
	private int month=-1;
	public MyDate(int month) {
		//1�� �̻� 12�� �����϶����� �Ҵ��ϵ��� ���ǹ��� ���
		if(month>=1&&month<=12) {
		this.month=month;
	}else {
		System.out.println(month+"���� �߸��� �� �����Դϴ�");
		}
	}
	public int getMonth() {
		return month;
	}
}
