package step09;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class MakeFileWorker implements Runnable{
	private int makeCount;
	private int makePeriod;
	public MakeFileWorker(int makeCount, int makePeriod) {
		super();
		this.makeCount = makeCount;
		this.makePeriod = makePeriod;
	}
	@Override
	public void run() {
		makeDir();		
		try {
			makeFile();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	//디렉토리가 없으면 생성하는 메서드 
	public void makeDir() {
		File dir=new File(CommonInfo.MAKE_PATH);
		if(dir.isDirectory()==false)
			dir.mkdirs();
	}
	//파일을 생성하는 메서드 
	public void makeFile() throws IOException, InterruptedException {
		for(int i=0;i<makeCount;i++) {
			String fileName=createFileName(i);//아래에서 구현한 메서드를 이용해 파일명을 생성한다 
			File file=new File(CommonInfo.MAKE_PATH+File.separator+fileName);
			file.createNewFile();
			System.out.println(fileName+" 생성 - MakeFileWorker Thread");
			Thread.sleep(makePeriod);
		}
	}
	//파일명을 생성하는 메서드 
	public String createFileName(int num) {
		String fileName=num+"_"+System.currentTimeMillis();
		Random r=new Random();
		if(r.nextBoolean())
			fileName+=".mp3";
		else
			fileName+=".avi";
		return fileName;
	}
}













