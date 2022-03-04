package step11;

public class SearchServiceWorker implements Runnable{
	//인스턴스 변수이므로 heap 영역에 저장되어 여러 스레드가 공유해서 사용한다 	
	private String shareInfo="검색서비스 공유자원";
	private int testCount;
	@Override
	public void run() {
		//현재 스레드 명을 반환받는다
		String threadName=Thread.currentThread().getName();
		for(int i=0;i<5;i++) {//i 는 로컬변수이므로 각각의 stack 영역에 별도로 저장되어 관리된다
			System.out.println(threadName+" "+shareInfo+" 이용해 서비스 "+i);
			testCount++; //공유자원 정보에 접근해 값을 증가시킨다 
			System.out.println(threadName+" 공유자원 testCount:"+testCount);
		}		
	}
}
