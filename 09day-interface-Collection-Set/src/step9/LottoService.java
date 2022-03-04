package step9;

import java.util.Random;
import java.util.TreeSet;

public class LottoService {
/*
 * �ζǹ�ȣ 1~45���� �ߺ����� �ʴ� ���� 6���� set�� ����Ǿ�� �Ѵ�
 * while loop�� ����. size()�� 6���� ���� ���ȸ� �ݺ��ϸ� �ȴ�
 */
	
	public TreeSet<Integer> createLotto() {
		Random r=new Random();
		TreeSet<Integer> set=new TreeSet<Integer>();
		
		//6���� �ݺ��ϴ� ���� �ƴ϶� set�� size()�� 6���� �������� �ݺ��ϴ� ������
		//Random�� nextInt()�޼���� ������ ���� �߻� ��ų ��
		//������ ���������� ���� �� �ֱ� ������ �� ��� set�� Ư¡�� 
		//�ߺ��� �������� �ʱ� ������ size()�� ���ϴ� ���� �����ϴ�
		while(set.size()<6) {//set�� �ζǹ�ȣ�� 6���� �� �� ���� �ݺ�
			int num=r.nextInt(45)+1; //45������ 0~44�̹Ƿ� +1�Ѵ�
			set.add(num);//set�� �����ϴ� ���� �Էµ� ��� �߰����� �ʴ´� 
		}
		return set;
	}

}
