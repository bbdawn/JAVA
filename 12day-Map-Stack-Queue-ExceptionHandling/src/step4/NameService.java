package step4;

public class NameService {

	/*
	 * �Ű����� name���� null ���޵Ǿ� concat()�� ����Ǵ� ������ 
	 * RuntimeException�� �ڽ� Exception�� NullPointerException�� �߻�
	 * RuntimeException�迭�� ������ throws �ʿ� ���� ȣ���� ������ 
	 * �� ���ܰ� ���ĵǴ� Ư¡�� �ִ�. 
	 */
	public void printMessage(String name) {
		String info=name.concat(" ����");//concat() Ư�� ���ڿ��� ������
		System.out.println(info);
	}

}
