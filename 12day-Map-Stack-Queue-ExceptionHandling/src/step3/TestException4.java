package step3;

import javax.print.attribute.standard.NumberOfDocuments;

/*
 * finally ���� ���� ����
 * try{
 * 
 * }catch(Exception e){
 * 		����ó��(����帧)
 * }finally{
 * 		�׻� ����
 * }
 * 
 * 
 *�Ʒ� ������ Integer.parseInt�ڵ���ο��� �������̶�� NumberFormat�� �ƴ� ������ �Է��ؼ�
 *������ ��ȯ�� �� ������ �˸��� NumberException�� �߻��Ǵµ�
 *catch������ �ٸ� ����Ÿ���� NullPointerException�� ����ؼ� ���Ƿ� ����ó���� �����ϵ��� ����
 *!!!�̷� ��쿡�� finally ������ �׻� ����Ǵ� ���� �˱� ���� ����!!!
 *�� ���� ����, ����ó������, ���ܸ� ó������ ���Ͽ� ������ ����Ǵ� ��� ��쿡��
 *finally ������ ������ ����ȴٴ� ���� �� �� �ִ�. 
 *ex.atm�⿡�� � ��쿡�� ī��� ������ ��������ϴ� ��ó��.
 */
public class TestException4 {
	public static void main(String[] args) {
		String age="22";
		System.out.println(age+1);//���ڿ��̹Ƿ� 221
		
		//�׽�Ʈ�� ���� ���Ƿ� age ������ ���� ������ �ƴ϶� ���� �������� �Ҵ�
		age="������";
		
		try {
		//���ڿ��� ������ ��ȯ
		int ageNum=Integer.parseInt(age);
		System.out.println(ageNum+1);//23
	//	}catch(NumberFormatException e) {
	//		System.out.println("������������ �Է����ּ���! ��� ����");
		}catch(NullPointerException e) { //test�� ���� ���Ƿ� �ٸ� exception Ÿ������ catch ���
			System.out.println("NULL~");
		}finally{
			System.out.println("finally������ �׻� ����");
		}
		
		
		
		System.out.println("���α׷� ���� ����");
	}
	
	
	
	
	
	

}//class
