package step3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestOutput {
	public static void main(String[] args) {
		// �� �����ϰ� ���Ͽ� ���ڿ��� ����ϴ� ���� -> Writer �迭(��¹��ڿ���Ʈ��)
		// NodeStream : ���� ��ġ�� ���� -> FileWriter
		// ProcessingStream : �پ��� ����� ���� -> PrintWriter(println(): �� ���ξ� ���ڿ� ���)

		// �Ʒ� FileWriter�� ����Ǹ� ��ο� �ش��ϴ� ������ ������ �����Ѵ�
		try {
			String path="C:" + File.separator + "kosta238" + File.separator + "iotest" + File.separator + "output.txt";
			FileWriter fw = new FileWriter(path,true);//true:append_���� ���
			PrintWriter pw=new PrintWriter(fw);
			pw.println("�������ø�");
			pw.close();//��Ʈ���� �ݾ��ش� (�ݱ� ���� ���� ���ۿ� �ִ� ������ flush_�����Ѵ�)
			System.out.println("��� �Ϸ�");
		} catch (IOException e) {
			e.printStackTrace();
		}//catch
	}// main
}
