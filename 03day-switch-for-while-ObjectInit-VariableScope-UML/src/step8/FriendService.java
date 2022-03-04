//TestObjectInit2 + FriendService

package step8;

public class FriendService {
	public void test1(Friend f) {
		f=new Friend("박보검", 28); //=은 할당
	}
	public void test2(Friend f) {
		f.setName("유재석"); 			//.은 실제 객체의 내용을 바꾸는 것 
		f.setAge(50);
	}
	
}
