package step2;

import java.io.File;
import java.io.IOException;

public class TestFile1 {
	public static void main(String[] args) {
		//java.io.File class�� �̿��ؼ� ���丮(����)�� ������ ����
		String path= "C:"+File.separator+"kosta238";
		File dir=new File(path);
		System.out.println(dir.exists());//�����ϸ� true
		System.out.println(dir.isDirectory());//���丮�̸� true
		System.out.println(dir.isFile());//�����̸� true �ƴϸ� false
		System.out.println(dir.getPath());//��θ� ���
		
		File dir2=new File(dir.getPath()+File.separator+"iotest");
		System.out.println(dir2.exists());//������ �����ϱ� ������������(��ü�� ���������� ���� ���丮�� ���� ������)
		if(dir2.exists()==false) {//�������� ������
			//iotest directory�� ��������
			boolean result=dir2.mkdir();//���丮 ����. �������θ� boolean������ ��ȯ(�����ϴ� ��쿡�� �ȸ���� false�� ����)
			System.out.println("���丮 ��������: "+result);
		}//if
		
		
		
		/*iotest�� ���� ��ġ�� iotest2 ���丮�� ���� ���丮 music �ѹ��� �����غ���*/
		//step1. iotest ���丮�� ���� ���丮_pd�� ���´�
		File pd=dir2.getParentFile(); 
		//System.out.println(pd.getPath()); //Ȯ���غ���
		
		//step2. ���� ���丮���� iotest2dhk ���� ���丮 music�� �����Ѵ� 
		File dir3=new File(pd.getPath()+File.separator+"iotest2"+File.separator+"music");
		System.out.println(dir3.mkdirs());
		
		
		
		/*music directory�� ������ �����غ��� (readme.txt)*/
		File file=new File(dir3.getPath()+File.separator+"readme.txt");
		try {
			System.out.println("���ϻ���: "+file.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();//���� �޼����� �߻���θ� ��� �����!!
		}
		System.out.println("file �ļ��۾�");
		System.out.println(dir.getPath());
		
		/*dir �� kosta238 ���丮 ���� �ִ� ��� ���丮��� ���ϸ��� ����غ���*/
		System.out.println(dir.getName()+"�� �ִ� ��� ���丮�� ���ϸ� ���� ���");
		String list[]=dir.list();
		for(int i=0; i<list.length;i++) {
			System.out.println(list[i]);
		}
		
		
		System.out.println("**kosta238 ���丮 ���� ���丮�� ������ ������ ���");
		/*
		 * ���丮��� ���ϸ��� ��� ���. 
		 * ���丮 �տ��� directory: , ������ ��쿡�� file: �� �ٿ��� ����ϱ�
		 * java.io.File�� listFiles(): File --> isFile()�� isDerectiry()�� �̿��� �� �ִ�
		 */
		File[] list2=dir.listFiles();
		for(int i=0; i<list2.length;i++) {
			File f=list2[i];
			if(f.isDirectory()) {
				System.out.println("directory: "+f.getName());
			}else if(f.isFile()){
				System.out.println("file: "+f.getName());
			}
		}
		
	
		
	}//main
}































