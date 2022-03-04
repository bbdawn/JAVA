package step10;

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
	//���丮�� ������ �����ϴ� �޼��� 
	public void makeDir() {
		File dir=new File(CommonInfo.MAKE_PATH);
		if(dir.isDirectory()==false)
			dir.mkdirs();
	}
	//������ �����ϴ� �޼��� 
	public void makeFile() throws IOException, InterruptedException {
		for(int i=0;i<makeCount;i++) {
			String fileName=createFileName(i);//�Ʒ����� ������ �޼��带 �̿��� ���ϸ��� �����Ѵ� 
			File file=new File(CommonInfo.MAKE_PATH+File.separator+fileName);
			file.createNewFile();
			System.out.println(fileName+" ���� - MakeFileWorker Thread");
			Thread.sleep(makePeriod);
		}
	}
	//���ϸ��� �����ϴ� �޼��� 
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













