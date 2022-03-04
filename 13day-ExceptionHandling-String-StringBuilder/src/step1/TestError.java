package step1;
/*
 * Throwable class의 자식 (sub) class는
 * Error와 Exception이 있다
 * Error: 심각한 오류, 구조 개선이 필요
 * Exception : 예외, 내부적으로 예외 처리를 통해 프로그램을 구성
 */

//고의로 에로가 발생하는 코드를 구성해서 확인해본다 -> 구조 개선이 필요
class ErrorDemo{
	public void go() {
		System.out.println("go");
		stop();
	}//go
	public void stop() {
		System.out.println("stop");
		go();
	}//stop
}//ErrorDemo


//이 경우에는 java.lang.StackOverflowError가 발생하고 try catch는 의미없고 코드를 개선해야한다. 
public class TestError {
	public static void main(String[] args) {
		ErrorDemo e=new ErrorDemo();
		e.go();		
	}//main
}
