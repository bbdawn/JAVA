//Ư�� ���丮�� ������ �̵����Ѻ���
package step08.test4;

import java.io.File;

public class TestMoveFile {
	public static void main(String[] args) {
		String orgPath="c:"+File.separator+"kosta238"+File.separator+"iotest"+File.separator+"test"+File.separator+"ok.mp3";
		String destPath="c:"+File.separator+"kosta238"+File.separator+"iotest"+File.separator+"test2"+File.separator+"ok.mp3";
		
		//orgPath File(test-ok.mp3)�� destPath File(test2-ok.mp3)s�� �̵���Ű�� ����
		//****orgFile.renameTo(destFile)*****  �̺κ��� ����Ʈ!!
		
		File orgFile=new File(orgPath);
		System.out.println(orgFile.isFile());
		File destFile=new File(destPath);// test2\ok.mp3
		File destDir=destFile.getParentFile(); //test2
		if(destDir.isDirectory()==false) //test2 ���丮�� ������
			destDir.mkdirs();			//���丮 ����
	
		
		//���� �̵���Ű��
		boolean result=orgFile.renameTo(destFile);
		System.out.println("�����̵� "+result);
		
	}
}
