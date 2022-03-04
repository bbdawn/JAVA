package step1;

/*
 * String : 불변, 동일한 문자열을 여러곳에서 사용할 때 적합
 * StringBuilder(StringBuffer) : 가변, 하나의 문자열이 자주 변경될 때 적합
 */



public class TestReviewStringAndStringBuilder {
	public static void main(String[] args) {
		String s1="손흥민"; //heap 내의 String Constant Pool에 저장
		String s2="손흥민"; //s1과 동일한 문자열을 참조해서 사용 (즉, 손흥민을 공유하는 것)

		System.out.println(s1.concat("선수")); //String Constant Pool에 "손흥민선수"라는 문자열이 새로 생성됨
		System.out.println(s1);//손흥민 //여전히 손흥민! 변하지 않았음 (불변)
		System.out.println(s2);//손흥민 //여전히 손흥민! 변하지 않았음 (불변)
		
		System.out.println("*********************");
		
		StringBuilder sb=new StringBuilder("이승우");
		System.out.println(sb);//이승우
		System.out.println(sb.append("선수")); //이승우선수 //이때는 자체가 변경됨
		System.out.println(sb);//이승우선수 //자체가 변경되어버림. (가변)
		
		System.out.println("*********************");
		
		String name1="황의조";
		String name3="황의조";
		System.out.println(name1==name3);//결과 나옴. 하지만 이렇게하면 안됨
										 //String Constant Pool의 동일한 문자열을 참조하므로 비교 가능하지만
										 //다양한 방식으로 문자열을 생성할 수 있으므로
										 //==연산자로 비교해서는 안된다!
		
		StringBuilder name2=new StringBuilder("황의조");
		
		System.out.println(name1+" "+name2); //System.out.println(name1==name2); //error: 타입이 다르므로 compile error
		
		//StringBuilder의 toString()을 이용해서 비교
		System.out.println(name1==name2.toString());//false --> ==문자열비교에 적합하지 않다 
		
		System.out.println(name1.equals(name2.toString()));//equals를 이용해야함
		
		System.out.println(name1.contentEquals(name2));//contentEquals를 이용하면 toString()없이 바로 비교 가능
	
	}
}


















