package step2;

import java.io.File;

public class FileService {
/*
 * path와 동일한 위치에 있는 디렉토리와 파일명을 모두 출력하되
 * 디렉토리명 앞에는 디렉토리: 명시하고
 * 파일 앞에는 파일: 라고 명시한다
 * 
 * path -> File 객체 생성
 * 상위 디렉토리 파일 객체를 반환
 * 이 객체의 listFiles() 호출 File 배열을 반환
 * for loop
 */
	public void printDirAndFile(String path) {
		File dir=new File(path);
		//상위 디렉토리를 받아온다
		File parentDir=dir.getParentFile();
		//이 디렉토리가 가지고 있는 리스트를 파일 배열 형식으로 받아온다
		File[] list=parentDir.listFiles();
		for(int i=0; i<list.length;i++) {
			if(list[i].isDirectory()) {
				System.out.println("디렉토리: "+list[i].getName());
			}else if(list[i].isFile()) {
				System.out.println("파일: "+list[i].getName());
			}
				
			System.out.println(list[i]);
		}//for
	}//printDirAndFile

}
