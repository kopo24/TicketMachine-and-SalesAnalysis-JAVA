package kopo24_0426_ThemaPark_Tiket_Machine;

import java.util.ArrayList;

public class TicketMachine {
	
	static ArrayList<Processing> proAL = new ArrayList<Processing>();
	
	public static void main(String[] args) {
		
		int cnt = 0;
		do {
			// ���� ����, InputFromConsole�� ���� ExchangeType�� int whatTime �ʱ�ȭ
			
			// �ֹι�ȣ �Է�, InputFromConsole�� ���� ExchangeType�� String juminNum �ʱ�ȭ
			
			// �ֹ�Ƽ�� ����, InputFromConsole�� ���� ExchangeType�� int howmanyTicket �ʱ�ȭ
			
			// ������ ����, InputFromConsole�� ���� ExchangeType�� int UooDae �ʱ�ȭ
			
			// �ѹ� ���α׷��� ���� �� ������, �� �� ���ư� while�� ������� ���� �� �迭
			
			// proAL.add(new Processing(ExchangeType et)); // ������ �ʱ�ȭ�� �������� ���
			
			// proAL.get(cnt)�� �����(���� ���� ����) ���. �����մϴ�.
			
			//��� Ƽ�� ���� ����
			
			cnt++;
			
		} while (/*��� �߱� �Ͻðڽ��ϱ�? != ��(1) ����(2)*/);
		
		System.out.printf("======================== �������� ========================\n");
		// ���� ���� ���â ���
		
		Output printAL = new Output();
		
		// Output Class�� ArrayList ����
		printAL.printList(proAL);
		
		// ���� �ݾ� ��
		
		printAL.printSum(proAL);
		
		System.out.printf("======================== �������� ========================\n");
		
		// ��� ���� ����(1���ο� �ֹ�, proAL�ʱ�ȭ / 2���α׷� ����)
		
	}
}
