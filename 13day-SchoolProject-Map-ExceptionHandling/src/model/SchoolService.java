package model;


import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

//Service : business logic�� �����ϴ� Ŭ����
public class SchoolService {
	//key: tel, value: Member(Student, Teacher, Employee)
	private LinkedHashMap<String, Member> map=new LinkedHashMap<String, Member>();
	
	public void addMember(Member member) throws DuplicateTelException {
		if(map.containsKey(member.getTel())) {//map�� ����� �������� tel�� key. key�� �Ű������� ���޵� �������� tel�� ���� ���� �����ϴ°�-> �����ϸ� true
			throw new DuplicateTelException(member.getTel()+" tel�� �����Ͽ� ��� �Ұ��մϴ�");
		}else {
		map.put(member.getTel(), member);
		}
		}//addMember
	
	public void printAll() {//void�� �� ���� ���ϰ��� ���� �� void ���!!���ϰ� �Ƚᵵ while�� ���ؼ� �� ���
		Collection<Member> col=map.values();
		Iterator<Member> it=col.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}//printAll
	
	public Member findMemberByTel(String tel) throws MemberNotFoundException {
		if(map.containsKey(tel)==false) {//tel�� �ش��ϴ� key�� map�� �������� ������
			throw new MemberNotFoundException(tel+" tel�� �ش��ϴ� ������ ������ �����ϴ�");
		}
		return map.get(tel);
	}//findMemberByTel
	
	public Member deleteMemberByTel(String tel) throws MemberNotFoundException{
		if(map.containsKey(tel)==false) {//tel�� �ش��ϴ� key�� map�� �������� ������
			throw new MemberNotFoundException(tel+" tel�� �ش��ϴ� ������ ������ ��� ���� �Ұ�");
		}
		return map.remove(tel);
	}//deleteMemberByTel
	
	public void updateMember(Member member) throws MemberNotFoundException {
		if(map.containsKey(member.getTel())==false) {
			throw new MemberNotFoundException(member.getTel()+ " tel�� �ش��ϴ� ������ ������ �����ϴ�");
		}else {
			//put(): ������ key�� ������ value�� ������Ʈ, ������ �߰��� ��. 
			map.put(member.getTel(), member);
		}//update
		
	}//updateMember
	
	
	
	
	
	
	
}
