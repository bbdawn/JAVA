package step3;

//���� ��� ���� : b c d
//9 line���� ���ܹ߻��Ǹ� ��� catch�������� ��� �̵��Ǿ� b,
//finally�� �׻� �����ϹǷ� c,
//���� �����̹Ƿ� d ���
public class TestException6 {
	public static void main(String[] args) {
		String money="�̹�";
		try {
			int num=Integer.parseInt(money);
			System.out.println("a");
		}catch (NumberFormatException e) {
			System.out.println("b");
		}finally {
			System.out.println("c");
		}
		System.out.println("d");
	}
}
