package step4;
/*
 * UnCheckedException : ������ throws ���̵� ����, RuntimeException�迭(���������Ͽ� �ִ� ����)
 * 
 */
public class TestThrows3 {
	public static void main(String[] args) {
		NameService service=new NameService();
		//�������� ������
		//service.printMessage("�����");
		
		//�߸��� ������
		service.printMessage(null);
		try {
			service.printMessage(null);
		}catch(NullPointerException e) {
			System.out.println("�������� �̸��� �Է��ϼ���");
		}
		System.out.println("���α׷� ���� ����");
		
	}

}
