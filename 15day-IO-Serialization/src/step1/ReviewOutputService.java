package step1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReviewOutputService {
	private String path;

	public ReviewOutputService(String path) {
		super();
		this.path = path;
	}

	public void order() throws IOException {
		// local variable �� ����� �ڽ��� ������������ ����� �� �����Ƿ�
		// finally���� scanner�� pw �� close�ϱ� ���� ���� ��ġ�� ����, �ʱ�ȭ�Ѵ�
		Scanner scanner = null;
		PrintWriter pw = null;
		try {
			scanner = new Scanner(System.in);// �ֿܼ��� �Է¹ޱ� ���� ��Ʈ��
			pw = new PrintWriter(new FileWriter(path),true);// PrintWriter true -> autoflush ( println() ��� ��� )
			while(true) {
				System.out.print("�޴� �ֹ��ϼ���:");
				String food=scanner.nextLine();
				if(food.equals("����")) {
					System.out.println("�ֹ��� �Ϸ�Ǿ����ϴ�");
					break; // while ���� �����Ѵ� 
				}
				pw.println(food);
				System.out.println(food+" �ֹ�");
			}
			
		} finally { // �޼��� ���� �Ϸ����� �ݵ�� Stream �� close �ϱ� ���� finally�� �ۼ� 
			if (scanner != null)
				scanner.close();
			if (pw != null)
				pw.close();
		}
	}// method
}// class











