package step5;

public class TestString {
	public static void main(String[] args) {
		String name="������";
		System.out.println(name.concat("��"));
		System.out.println(name.contains("��"));
		System.out.println(name.indexOf("��"));//index�� 0���� �����ϹǷ� 2
		System.out.println(name.indexOf("¯"));//�������� ������ -1
		System.out.println(name.startsWith("��"));
		System.out.println(name.endsWith("��"));
		
		String info="������ �ð��̴�";
		System.out.println(info.substring(2));
		System.out.println(info.substring(4, 6));//beginIndex���� �����ؼ� endIndex �ձ��� �߶󳽴�(�ð�)
		
		String id=" javaking ";
		System.out.println(id.length());//���� ���� "����"�ؼ� ����10
		System.out.println(id.trim().length());//trim()�� �̿��� �� ������ �����Ͽ� ���̰� 8
		
		String nick="����� ����";
		System.out.println(nick.replace("��","��"));
		
		String fileName="goods.item.web.mp3";
		int index=fileName.lastIndexOf(".");
		System.out.println(fileName.lastIndexOf("."));//14
		System.out.println("���� Ȯ���ڴ� "+fileName.substring(index+1));
		System.out.println("Ȯ���ڸ� ������ ���ϸ��� "+fileName.replace(".mp3", ""));
		
	}

}
