package step1;

import java.io.IOException;

import common.Path;

public class TestReviewOutput {
	public static void main(String[] args) {

		ReviewOutputService service = new ReviewOutputService(Path.TEST_PATH + "order.txt");
		try {
			service.order();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
