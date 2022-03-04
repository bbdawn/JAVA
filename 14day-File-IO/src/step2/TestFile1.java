package step2;

import java.io.File;
import java.io.IOException;

public class TestFile1 {
	public static void main(String[] args) {
		//java.io.File class를 이용해서 디렉토리(폴더)와 파일을 제어
		String path= "C:"+File.separator+"kosta238";
		File dir=new File(path);
		System.out.println(dir.exists());//존재하면 true
		System.out.println(dir.isDirectory());//디렉토리이면 true
		System.out.println(dir.isFile());//파일이면 true 아니면 false
		System.out.println(dir.getPath());//경로를 출력
		
		File dir2=new File(dir.getPath()+File.separator+"iotest");
		System.out.println(dir2.exists());//지금은 없으니까 존재하지않음(객체는 존재하지만 실제 디렉토리는 없는 상태임)
		if(dir2.exists()==false) {//존재하지 않으면
			//iotest directory를 생성하자
			boolean result=dir2.mkdir();//디렉토리 생성. 생성여부를 boolean형으로 반환(존재하는 경우에는 안만들고 false를 리턴)
			System.out.println("디렉토리 생성여부: "+result);
		}//if
		
		
		
		/*iotest와 같은 위치에 iotest2 디렉토리와 하위 디렉토리 music 한번에 생성해본다*/
		//step1. iotest 디렉토리의 상위 디렉토리_pd를 얻어온다
		File pd=dir2.getParentFile(); 
		//System.out.println(pd.getPath()); //확인해보기
		
		//step2. 상위 디렉토리에서 iotest2dhk 하위 디렉토리 music을 생성한다 
		File dir3=new File(pd.getPath()+File.separator+"iotest2"+File.separator+"music");
		System.out.println(dir3.mkdirs());
		
		
		
		/*music directory에 파일을 생성해본다 (readme.txt)*/
		File file=new File(dir3.getPath()+File.separator+"readme.txt");
		try {
			System.out.println("파일생성: "+file.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();//예외 메세지와 발생경로를 모두 출력함!!
		}
		System.out.println("file 후속작업");
		System.out.println(dir.getPath());
		
		/*dir 즉 kosta238 디렉토리 내에 있는 모든 디렉토리명과 파일명을 출력해보기*/
		System.out.println(dir.getName()+"에 있는 모든 디렉토리와 파일명 정보 출력");
		String list[]=dir.list();
		for(int i=0; i<list.length;i++) {
			System.out.println(list[i]);
		}
		
		
		System.out.println("**kosta238 디렉토리 내의 디렉토리와 파일을 구분해 출력");
		/*
		 * 디렉토리명과 파일명을 모두 출력. 
		 * 디렉토리 앞에는 directory: , 파일일 경우에는 file: 을 붙여서 출력하기
		 * java.io.File의 listFiles(): File --> isFile()과 isDerectiry()를 이용할 수 있다
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































