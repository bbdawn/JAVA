package step3;

import java.io.IOException;

import common.Path;

public class TestCopyAndPasteService {
	public static void main(String[] args) {
		String copyFilePath=Path.TEST_PATH+"order.txt";
		String pasteFilePath=Path.TEST_PATH2+"복사본-order.txt";
		CopyAndPasteService service=
				new CopyAndPasteService(copyFilePath,pasteFilePath);
		try {
			service.copyAndPasteFile();
			System.out.println("복붙완료^^");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
