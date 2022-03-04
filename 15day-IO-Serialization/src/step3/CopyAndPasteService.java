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
	 	FileReader , BufferdReader ����
	 	FileWriter , PrintWriter ���� 
	 	while(){
	 		�Ѷ��ξ� �д´�
	 		���� ������ ����Ѵ� 
	 	}
	 	close
	 */
	public void copyAndPasteFile() throws IOException {
		BufferedReader br=null;
		PrintWriter pw=null;
		try {
			br=new BufferedReader(new FileReader(copyFilePath));//�Է� ��Ʈ�� ���� 
			pw=new PrintWriter(new FileWriter(pasteFilePath));//��� ��Ʈ�� ����
			while(br.ready()) {
				String data=br.readLine();//���� ��� ������ ������ �Ѷ��ξ� �д´�
				pw.println(data);//�ٿ��ֱ� ��� ���Ͽ� ���� ������ ����Ѵ�
			}
		}finally {
			if(pw!=null)
				pw.close();
			if(br!=null)
				br.close();
		}		
	}	
}


















