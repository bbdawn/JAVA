package step6;

public class TestStringEqulas {
	public static void main(String[] args) {
		//���ڿ���
		String s1="������";
		String s2="������";
		System.out.println(s1==s2); //true
		
		String s3=new String("������");
		System.out.println(s1==s3); //false //���ڿ� �񱳰� ���� �ʴ´� 
		StringBuilder sb=new StringBuilder("������"); 
		System.out.println(s1==sb.toString());//false //���ڿ� �񱳰� ���� �ʴ´�
		
		System.out.println(s1.equals(s3)); //true //���ڿ� �� ����!!
		System.out.println(s1.equals(sb.toString())); //true //���ڿ� �� ����!!
	}

}
