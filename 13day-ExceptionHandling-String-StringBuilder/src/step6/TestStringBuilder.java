package step6;

public class TestStringBuilder {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("±è°¡³×");
		System.out.println(sb);
		System.out.println(sb.append("±è¹ä"));
		System.out.println(sb.substring(1,4));
		System.out.println(sb.insert(2, "³ª"));//±è°¡³ª³×±è¹ä
		System.out.println(sb.delete(1, 4));
		
		
		StringBuilder sb2=new StringBuilder("»µÀÌÀå°¡°¡´Ï");
		System.out.println(sb2.reverse());
	}
}
