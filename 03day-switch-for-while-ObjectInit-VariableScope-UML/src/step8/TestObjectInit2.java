//TestObjectInit2 + FriendService

package step8;
//��ü�� �Ӽ����� �����غ��� ����
public class TestObjectInit2 {
	public static void main(String[] args) {
		Friend f=new Friend("������",30); 
		FriendService service=new FriendService();
		service.test1(f);
		System.out.println(f.getName()+" "+f.getAge());
		service.test2(f);
		System.out.println(f.getName()+" "+f.getAge());
		
		
		
		
	}
}
