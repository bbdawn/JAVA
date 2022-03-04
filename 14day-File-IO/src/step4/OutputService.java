package step4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class OutputService {
	private String path;// �ν��Ͻ�����

	public OutputService(String path) {
		this.path = path;
	}

	/*
	 * path�� �ش��ϴ� ������ �����ϰ� �Ű������� ���޵� info�� ����ϴ� �޼��� (���ܴ� ȣ���� ������ throws �Ѵ�)
	 */
	public void writeInfo(String info) throws IOException {
		FileWriter fw = new FileWriter(path, true);// append true
		PrintWriter pw = new PrintWriter(fw);
		pw.println(info);
		pw.close();
	}
}// OutputService
