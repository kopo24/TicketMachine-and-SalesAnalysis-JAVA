package kopo24_0426_ThemaPark_Tiket_Machine;

import java.util.ArrayList;

public class TicketMachine {
	
	static ArrayList<Processing> proAL = new ArrayList<Processing>();
	static InputFromConsole ifc = new InputFromConsole();
	static ExchangeType et = new ExchangeType();
	
	public static void main(String[] args) {
		MakeFile mf = new MakeFile();
		
		mf.HeaderWrite();
		do {
			do {
				// add�ϰ� �ٸ� et�� ����Ű���� �����!
				// �������� ������ ����ּż� �ذ�!
				// add�� ArrayList�� �߰�, �����ϴ� ���� �ƴ϶� ��� �� �޸𸮿� �� �����
				// ����� ����Ű�� �ִ� ���� ��.
				et = new ExchangeType();
				
				// ���� ����, InputFromConsole�� ���� ExchangeType�� int whatTime �ʱ�ȭ
				ifc.selectTime(et);

				// �ֹι�ȣ �Է�, InputFromConsole�� ���� ExchangeType�� String juminNum �ʱ�ȭ
				ifc.inputJuminNum(et);

				// �ֹ�Ƽ�� ����, InputFromConsole�� ���� ExchangeType�� int howmanyTicket �ʱ�ȭ
				ifc.hwmyTicket(et);

				// ������ ����, InputFromConsole�� ���� ExchangeType�� int UooDae �ʱ�ȭ
				ifc.UooDae(et);

				// �ѹ� ���α׷��� ���� �� ������, �� �� ���ư� while�� ������� ���� �� �迭
				proAL.add(new Processing(et)); // ������ �ʱ�ȭ�� �������� ���

				// �ѹ� ó���� ���� ���
				ifc.printOne(et);

				//��� Ƽ�� ���� ����
				ifc.goOrstop(et);

			} while (et.goOrstop == ConstValue.MENU_MORE_TICKET); // Ż�� ����

			// ���� ���â ��ºκ�
			System.out.printf("======================== �������� ========================\n");

			Output printAL = new Output();

			// Output Class�� ArrayList ����
			printAL.printList(proAL);

			// ���� �ݾ� ��
			printAL.printSum(proAL, et);

			System.out.printf("======================== �������� ========================\n");

			mf.DataWrite(proAL);
			
			// ��� ���� ����(1���ο� �ֹ�, proAL�ʱ�ȭ / 2���α׷� ����)
			ifc.newOrexit(et);
			
			proAL.clear();
			
		} while (et.newOrexit == ConstValue.NEW_ORDER);
		mf.FileClose();
	}
}
