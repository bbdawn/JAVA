//TestObjectInit2 + FriendService

package step8;

public class FriendService {
	public void test1(Friend f) {
		f=new Friend("�ں���", 28); //=�� �Ҵ�
	}
	public void test2(Friend f) {
		f.setName("���缮"); 			//.�� ���� ��ü�� ������ �ٲٴ� �� 
		f.setAge(50);
	}
	
}
