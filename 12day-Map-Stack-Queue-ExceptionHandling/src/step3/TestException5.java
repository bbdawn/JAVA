package step3;

//���� ��� ���� : a c d
//���� ������ �����Ͱ� �Ҵ�Ǿ����Ƿ� ���� �߻� ���� ���� �����. try �� ��� ���� -> a
//���� �߻� �ȵǾ����Ƿ� catch������ ����x bx,
//finally�� �׻� �����ϹǷ� c,
//���� �����̹Ƿ� d ���
public class TestException5 {
	public static void main(String[] args) {
		String money="200";
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
