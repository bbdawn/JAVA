package step08.test5;

import java.io.File;

public class TestDirectory {
	public static void main(String[] args) {
		//Ư�� ���丮�� �����ϴ� ���ϵ��� Ȯ���ϴ� ����
		String dirPath="c:"+File.separator+"kosta238"+File.separator+"iotest"+File.separator+"test2";
		File dir=new File(dirPath);
		File list[]=dir.listFiles();
		for(int i=0; i<list.length;i++) {
			String name=list[i].getName();
			if(name.endsWith(".mp3")) {
				System.out.println("��������: "+name);
			}else if(name.endsWith(".txt")) {
				System.out.println("��������: "+name);
			}
		}
		
		
		
		
	}//main
}
