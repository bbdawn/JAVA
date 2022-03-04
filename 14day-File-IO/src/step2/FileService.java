package step2;

import java.io.File;

public class FileService {
/*
 * path�� ������ ��ġ�� �ִ� ���丮�� ���ϸ��� ��� ����ϵ�
 * ���丮�� �տ��� ���丮: ����ϰ�
 * ���� �տ��� ����: ��� ����Ѵ�
 * 
 * path -> File ��ü ����
 * ���� ���丮 ���� ��ü�� ��ȯ
 * �� ��ü�� listFiles() ȣ�� File �迭�� ��ȯ
 * for loop
 */
	public void printDirAndFile(String path) {
		File dir=new File(path);
		//���� ���丮�� �޾ƿ´�
		File parentDir=dir.getParentFile();
		//�� ���丮�� ������ �ִ� ����Ʈ�� ���� �迭 �������� �޾ƿ´�
		File[] list=parentDir.listFiles();
		for(int i=0; i<list.length;i++) {
			if(list[i].isDirectory()) {
				System.out.println("���丮: "+list[i].getName());
			}else if(list[i].isFile()) {
				System.out.println("����: "+list[i].getName());
			}
				
			System.out.println(list[i]);
		}//for
	}//printDirAndFile

}
