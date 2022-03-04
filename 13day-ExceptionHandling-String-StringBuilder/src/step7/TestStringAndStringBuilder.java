package step7;

public class TestStringAndStringBuilder {
	public static void main(String[] args) {
		String name="아이유";//상수, 불변, 이유는 여러 곳에서 공유하는 정보이므로
		System.out.println(name.concat("짱"));//아이유짱이라는 문자열이 새로 생성
		String name2="아이유";//name과 동일한 데이터를 참조(heap 영역 내 String Constant Pool에 아이유 하나가 저장되므로)
		System.out.println(name+" "+name2);//여전히 아이유
		
		StringBuilder sb=new StringBuilder("박보검");//가변
		System.out.println(sb.append("군"));//문자열 자체가 변경
		System.out.println(sb);//박보검군 -> 원본 자체가 변경되므로
		
		
	}
}
