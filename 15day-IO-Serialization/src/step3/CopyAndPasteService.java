package step3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyAndPasteService {
	private String copyFilePath;
	private String pasteFilePath;
	public CopyAndPasteService(String copyFilePath, String pasteFilePath) {
		super();
		this.copyFilePath = copyFilePath;
		this.pasteFilePath = pasteFilePath;
	}
	/*
	 	FileReader , BufferdReader 생성
	 	FileWriter , PrintWriter 생성 
	 	while(){
	 		한라인씩 읽는다
	 		읽은 내용을 출력한다 
	 	}
	 	close
	 */
	public void copyAndPasteFile() throws IOException {
		BufferedReader br=null;
		PrintWriter pw=null;
		try {
			br=new BufferedReader(new FileReader(copyFilePath));//입력 스트림 생성 
			pw=new PrintWriter(new FileWriter(pasteFilePath));//출력 스트림 생성
			while(br.ready()) {
				String data=br.readLine();//복사 대상 파일의 정보를 한라인씩 읽는다
				pw.println(data);//붙여넣기 대상 파일에 읽은 정보를 출력한다
			}
		}finally {
			if(pw!=null)
				pw.close();
			if(br!=null)
				br.close();
		}		
	}	
}


















