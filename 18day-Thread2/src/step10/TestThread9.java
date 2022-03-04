package step10;

/*
    
    17day 의 step9 에 이어서 MoveFileWorker Thread를 구현한다 ( step8의 단위테스트를 참조한다 ) 
    
 	멀티 스레드 연습예제 
 	
 	CommonInfo의 MAKE_PATH 에 1초 간격으로 30번 반복하면서 30개의 파일을 생성 
 	이 때 파일명은 0_시간정보.avi or 0_시간정보.mp3 와 같이 랜덤하게 확장자가 avi 또는 mp3로 생성된다 
 	
 	이와 동시에 CommonInfo의 MUSIC_PATH와 MOVIE_PATH 디렉토리에 
 	MAKE_PATH에서 생성된 파일들을 확장자별로 ( avi 파일은 MOVIE_PATH로 , mp3는 MUSIC_PATH 로) 
 	이동시킨다. 7초 간격으로 5번 실행해서 모두 이동되도록 처리한다 
 	
 	이를 위해서는 두 작업을 동시에 진행하는 멀티 스레드 구현이 필요하다 
 	
 	파일을 생성하는 스레드 : MakeFileWorker Thread 
 	파일을 이동시키는 스레드 : MoveFileWorker Thread 
 	
 	스레드를 생성하는 방식은 implements Runnable 로 한다 
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
