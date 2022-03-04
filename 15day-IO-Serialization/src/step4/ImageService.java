package step4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageService {
	private String copyPath;
	private String pastePath;
	public ImageService(String copyPath, String pastePath) {
		super();
		this.copyPath = copyPath;
		this.pastePath = pastePath;
	}
	public void copyAndPasteImage() throws IOException {
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		try {
			bis=new BufferedInputStream(new FileInputStream(copyPath));//입력스트림
			bos=new BufferedOutputStream(new FileOutputStream(pastePath));//출력스트림
			int data=bis.read();
			while(data!=-1) { // -1 즉 더 이상 읽을 내용이 없을 때 read()는 -1을 반환, -1이 아닐동안 반복
				//주석 확인하세요^^
				bos.write(data);//출력
				data=bis.read();//한 바이트씩 입력
			}
		}finally {
			if(bis!=null)
				bis.close();
			if(bos!=null)
				bos.close();
		}		
	}//method	
}//class
















