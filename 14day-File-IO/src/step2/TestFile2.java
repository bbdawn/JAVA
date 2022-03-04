package step2;

import java.io.File;

public class TestFile2 {
	public static void main(String[] args) {
		String path="C:"+File.separator+"kosta238"+File.separator+"iotest";
		//System.out.println(new File(path).exists());//존재하는지 확인
		FileService service=new FileService();
		service.printDirAndFile(path);
	}
}
