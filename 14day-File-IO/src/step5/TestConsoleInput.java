//scanner

package step5;

import java.io.InputStream;
import java.util.Scanner;

public class TestConsoleInput {
	public static void main(String[] args) {
		InputStream is = System.in;// �ַܼκ��� �Է¹޴� �Է½�Ʈ��(��ġ�� ����Ǿ������Ƿ� NodeStream�迭)
		// ����� �����ϴ� ProcessingStream�迭 -> Scanner
		Scanner s = new Scanner(is);
		System.out.print("ģ�� �̸��� �Է��ϼ���: ");
		String name = s.nextLine();// �Է������� �Ѷ��ξ� �Է¹޴´�.
		System.out.println("ģ���̸�: " + name);
		s.close();// ����½ÿ��� �ݵ�� close ����!!

	}// main
}
