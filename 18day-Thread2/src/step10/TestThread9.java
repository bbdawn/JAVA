package step10;

/*
    
    17day �� step9 �� �̾ MoveFileWorker Thread�� �����Ѵ� ( step8�� �����׽�Ʈ�� �����Ѵ� ) 
    
 	��Ƽ ������ �������� 
 	
 	CommonInfo�� MAKE_PATH �� 1�� �������� 30�� �ݺ��ϸ鼭 30���� ������ ���� 
 	�� �� ���ϸ��� 0_�ð�����.avi or 0_�ð�����.mp3 �� ���� �����ϰ� Ȯ���ڰ� avi �Ǵ� mp3�� �����ȴ� 
 	
 	�̿� ���ÿ� CommonInfo�� MUSIC_PATH�� MOVIE_PATH ���丮�� 
 	MAKE_PATH���� ������ ���ϵ��� Ȯ���ں��� ( avi ������ MOVIE_PATH�� , mp3�� MUSIC_PATH ��) 
 	�̵���Ų��. 7�� �������� 5�� �����ؼ� ��� �̵��ǵ��� ó���Ѵ� 
 	
 	�̸� ���ؼ��� �� �۾��� ���ÿ� �����ϴ� ��Ƽ ������ ������ �ʿ��ϴ� 
 	
 	������ �����ϴ� ������ : MakeFileWorker Thread 
 	������ �̵���Ű�� ������ : MoveFileWorker Thread 
 	
 	�����带 �����ϴ� ����� implements Runnable �� �Ѵ� 
 */
public class TestThread9 {
	public static void main(String[] args) {
		int makeCount = 30;
		int makePeriod = 1000;
		int moveCount = 5;
		int movePeriod = 7000;
		
		MakeFileWorker makeWorker = new MakeFileWorker(makeCount, makePeriod);
		Thread t1 = new Thread(makeWorker);
		t1.start();

		MoveFileWorker moveWorker = new MoveFileWorker(moveCount, movePeriod);
		Thread t2 = new Thread(moveWorker);
		t2.start();

	}
}
