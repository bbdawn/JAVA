package step10;

import java.io.File;

public class MoveFileWorker implements Runnable{
	private int moveCount;
	private int movePeriod;
	public MoveFileWorker(int moveCount, int movePeriod) {
		super();
		this.moveCount = moveCount;
		this.movePeriod = movePeriod;
	}
	@Override
	public void run() {
		makeDirs();//���丮 ������ ���� ȣ�� 
		//7�� �������� 5�� �̵���Ű�� ���� for loop�� �̿� 
		for(int i=0;i<moveCount;i++) {
			try {
				Thread.sleep(movePeriod);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			moveFiles();//���丮 ���� ������ �̵���Ű�� ���� ȣ�� 
			System.out.println("MoveFileWorker Thread�� ���ϵ��� �̵�");
		}
	}
	//���丮�� ������ ���� ( movie �� music ) 
	public void makeDirs() {
		File movieDir=new File(CommonInfo.MOVIE_PATH);
		if(movieDir.isDirectory()==false)
			movieDir.mkdirs();
		File musicDir=new File(CommonInfo.MUSIC_PATH);
		if(musicDir.isDirectory()==false)
			musicDir.mkdirs();
	}
	/* 
	 *  Ȯ���ں��� ������ �̵���Ű�� �޼��� 
	 *  repository ���丮�� �ִ� ���ϸ���Ʈ�� ��ȯ�޾� Ȯ���ڸ� Ȯ���Ͽ� 
	 *  .avi ������ movie ���丮�� �̵���Ű�� .mp3 ������ music ���丮�� �̵���Ų�� 
	 */
	public void moveFiles() {
		File repositoryDir=new File(CommonInfo.MAKE_PATH);
		File[] files=repositoryDir.listFiles();// repository ���丮�� �ִ� ���ϵ��� ������ �迭�� ��ȯ�޴´� 
		for(int i=0;i<files.length;i++) {
			String name=files[i].getName();//���ϸ��� ��ȯ�޴´�  ��) 19_1646269373105.avi
			String destDir=null;//�̵��� ���丮 ��θ� ���� 
			if(name.endsWith(".avi")) {
				destDir=CommonInfo.MOVIE_PATH;
			}else if(name.endsWith(".mp3")) {
				destDir=CommonInfo.MUSIC_PATH;
			}
			// ������ �̵���Ų�� 
			File destFile=new File(destDir+File.separator+name);
			//��������.renameTo(����������);
			files[i].renameTo(destFile);
		}//for
	}//method	
}//class











