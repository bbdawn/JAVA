package step4;

import java.io.File;
import java.io.IOException;

public class TestOutput2 {
	public static void main(String[] args) {
		String path = "C:" + File.separator + "kosta238" + File.separator + "iotest" + File.separator + "output.txt";
		OutputService service = new OutputService(path);

		String info = "��ġȸ��";
		try {
			service.writeInfo(info);
			System.out.println(info + " ��¿Ϸ�");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
