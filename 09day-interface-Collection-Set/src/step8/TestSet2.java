package step8;

import java.util.TreeSet;

public class TestSet2 {
	//TreeSet: 중복인정x, 정렬기능
	public static void main(String[] args) {
		TreeSet<String> set1=new TreeSet<String>();//Generic을 String으로 명시해 요소들은 문자열만 가능
		set1.add("손흥민");
		set1.add("김영미");
		set1.add("김영미");
		set1.add("이강인");
		System.out.println(set1.size()); //3 //중복불가
		System.out.println(set1);//김영미,손흥민,이강인 //정렬기능

	
		TreeSet<Integer> set2=new TreeSet<Integer>();
		set2.add(3);
		set2.add(1);
		set2.add(2);
		set2.add(1); //중복 인정 안함
		System.out.println(set2.size()); //3 //중복불가
		System.out.println(set2); //1,2,3
	
	
	}
	
	
}
