//TestObjectInit2 + FriendService

package step8;
//객체의 속성값을 예상해보는 예제
public class TestObjectInit2 {
	public static void main(String[] args) {
		Friend f=new Friend("아이유",30); 
		FriendService service=new FriendService();
		service.test1(f);
		System.out.println(f.getName()+" "+f.getAge());
		service.test2(f);
		System.out.println(f.getName()+" "+f.getAge());
		
		
		
		
	}
}
