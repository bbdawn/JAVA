package step08.test5;

import java.io.File;

public class TestDirectory {
	public static void main(String[] args) {
		//특정 디렉토리에 존재하는 파일들을 확인하는 예제
		String dirPath="c:"+File.separator+"kosta238"+File.separator+"iotest"+File.separator+"test2";
		File dir=new File(dirPath);
		File list[]=dir.listFiles();
		for(int i=0; i<list.length;i++) {
			String name=list[i].getName();
			if(name.endsWith(".mp3")) {
				System.out.println("음악파일: "+name);
			}else if(name.endsWith(".txt")) {
				System.out.println("문서파일: "+name);
			}
		}
		
		
		
		
	}//main
}
