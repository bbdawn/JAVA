package model;


import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

//Service : business logic을 정의하는 클래스
public class SchoolService {
	//key: tel, value: Member(Student, Teacher, Employee)
	private LinkedHashMap<String, Member> map=new LinkedHashMap<String, Member>();
	
	public void addMember(Member member) throws DuplicateTelException {
		if(map.containsKey(member.getTel())) {//map에 저장된 구성원의 tel이 key. key가 매개변수로 전달된 구성원의 tel과 같은 것이 존재하는가-> 존재하면 true
			throw new DuplicateTelException(member.getTel()+" tel이 존재하여 등록 불가합니다");
		}else {
		map.put(member.getTel(), member);
		}
		}//addMember
	
	public void printAll() {//void를 쓸 때는 리턴값이 없을 때 void 사용!!리턴값 안써도 while문 통해서 다 출력
		Collection<Member> col=map.values();
		Iterator<Member> it=col.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}//printAll
	
	public Member findMemberByTel(String tel) throws MemberNotFoundException {
		if(map.containsKey(tel)==false) {//tel에 해당하는 key가 map에 존재하지 않으면
			throw new MemberNotFoundException(tel+" tel에 해당하는 구성원 정보가 없습니다");
		}
		return map.get(tel);
	}//findMemberByTel
	
	public Member deleteMemberByTel(String tel) throws MemberNotFoundException{
		if(map.containsKey(tel)==false) {//tel에 해당하는 key가 map에 존재하지 않으면
			throw new MemberNotFoundException(tel+" tel에 해당하는 구성원 정보가 없어서 삭제 불가");
		}
		return map.remove(tel);
	}//deleteMemberByTel
	
	public void updateMember(Member member) throws MemberNotFoundException {
		if(map.containsKey(member.getTel())==false) {
			throw new MemberNotFoundException(member.getTel()+ " tel에 해당하는 구성원 정보가 없습니다");
		}else {
			//put(): 동일한 key가 있으면 value가 업데이트, 없으면 추가가 됨. 
			map.put(member.getTel(), member);
		}//update
		
	}//updateMember
	
	
	
	
	
	
	
}
