//특정 디렉토리의 파일을 이동시켜보기
package step08.test4;

import java.io.File;

public class TestMoveFile {
	public static void main(String[] args) {
		String orgPath="c:"+File.separator+"kosta238"+File.separator+"iotest"+File.separator+"test"+File.separator+"ok.mp3";
		String destPath="c:"+File.separator+"kosta238"+File.separator+"iotest"+File.separator+"test2"+File.separator+"ok.mp3";
		
		//orgPath File(test-ok.mp3)을 destPath File(test2-ok.mp3)s로 이동시키는 예제
		//****orgFile.renameTo(destFile)*****  이부분이 포인트!!
		
		File orgFile=new File(orgPath);
		System.out.println(orgFile.isFile());
		File destFile=new File(destPath);// test2\ok.mp3
		File destDir=destFile.getParentFile(); //test2
		if(destDir.isDirectory()==false) //test2 디렉토리가 없으면
			destDir.mkdirs();			//디렉토리 생성
	
		
		//파일 이동시키기
		boolean result=orgFile.renameTo(destFile);
		System.out.println("파일이동 "+result);
		
	}
}
