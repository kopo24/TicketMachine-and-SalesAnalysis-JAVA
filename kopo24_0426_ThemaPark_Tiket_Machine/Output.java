package kopo24_0426_ThemaPark_Tiket_Machine;

import java.util.ArrayList;

public class Output {
	
	static Processing pro;

	public void printList(ArrayList<Processing> proAL) {
		
		for (int i = 0; i < proAL.size(); i++) {
			
			pro = proAL.get(i);
			
			// if������ Sting�� �ְ�, �߰� ����
		
			// if������ String�� �, û�ҳ�, ����, ���, �Ʊ� ����
		
			// if������ String�� ������� ����, ~~��� ����
			
			// ���� ���
			System.out.printf("%s%s x %d%d%s", /*�־�String*/, /*�?String*/,
							  /*Ƽ�� ����*/, /*��������*/, /*������*/);
		}
	}

	public void printSum(ArrayList<Processing> proAL) {
		
		for (int i = 0; i < proAL.size(); i++) {
			
			pro = proAL.get(i);
			
			// et.price���� ���ϸ鼭 �ʱ�ȭ �� ���
			
		}
		
	}
	
}
