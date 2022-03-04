package step5;

public class MovieService {
	public void enter(int age) throws AgeException {
		if(age<19) {//입장불가. 19세 미만이면 AgeException을 발생시긴다
		throw new AgeException(age+"세 미성년이므로 영화관람불가합니다");	
		}
		System.out.println("즐거운 성인영화 관람되세요");
		
	}//method
}//class
