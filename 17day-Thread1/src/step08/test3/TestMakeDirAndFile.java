//���丮, ���� �����ϱ�
package step08.test3;

import java.io.File;
import java.io.IOException;

public class TestMakeDirAndFile {
	public static void main(String[] args) {
		//���丮 ���� �� ���� ���� �׽�Ʈ
		String dirPath="c:"+File.separator+"kosta238"+File.separator+"iotest"+File.separator+"test";
		File dir=new File(dirPath);
		if(dir.isDirectory()==false) {
			dir.mkdirs(); //���� ������
		}
		File file=new File(dirPath+File.separator+"ok.mp3");
		if(file.isFile()==false) {
			try {
				file.createNewFile();
				System.out.println("���ϻ���");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
