package step5;

public class TestString {
	public static void main(String[] args) {
		String name="아이유";
		System.out.println(name.concat("님"));
		System.out.println(name.contains("이"));
		System.out.println(name.indexOf("유"));//index는 0부터 시작하므로 2
		System.out.println(name.indexOf("짱"));//존재하지 않으면 -1
		System.out.println(name.startsWith("아"));
		System.out.println(name.endsWith("유"));
		
		String info="마지막 시간이다";
		System.out.println(info.substring(2));
		System.out.println(info.substring(4, 6));//beginIndex부터 시작해서 endIndex 앞까지 잘라낸다(시간)
		
		String id=" javaking ";
		System.out.println(id.length());//양쪽 공란 "포함"해서 길이10
		System.out.println(id.trim().length());//trim()을 이용해 양 공란을 제거하여 길이가 8
		
		String nick="방울이 오빠";
		System.out.println(nick.replace("오","아"));
		
		String fileName="goods.item.web.mp3";
		int index=fileName.lastIndexOf(".");
		System.out.println(fileName.lastIndexOf("."));//14
		System.out.println("파일 확장자는 "+fileName.substring(index+1));
		System.out.println("확장자를 제외한 파일명은 "+fileName.replace(".mp3", ""));
		
	}

}
