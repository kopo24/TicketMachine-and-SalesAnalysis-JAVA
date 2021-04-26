package kopo24_0426_ThemaPark_Tiket_Machine;

import java.util.ArrayList;

public class TicketMachine {
	
	public static void main(String[] args) {
		ArrayList<Processing> proAL = new ArrayList<Processing>();
		InputFromConsole ifc = new InputFromConsole();
		ExchangeType et = new ExchangeType();
		MakeFile mf = new MakeFile();
		Output outprint = new Output();
		
		// ���������� �ش� �ۼ�
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
				outprint.printOne(et);

				//��� Ƽ�� ���� ����
				ifc.goOrstop(et);

			} while (et.goOrstop == ConstValue.MENU_MORE_TICKET); // Ż�� ����
			
			// ���� ���â ��ºκ�
			// Output Class�� ArrayList ����
			outprint.printList(proAL);

			// ���� �ݾ� ��
			outprint.printSum(proAL, et);
			
			// ���������� �ۼ�
			mf.DataWrite(proAL);
			
			// ��� ���� ����(1���ο� �ֹ�, proAL�ʱ�ȭ / 2���α׷� ����)
			ifc.newOrexit(et);
			
			// ArrayList �ʱ�ȭ
			proAL.clear();
			
		} while (et.newOrexit == ConstValue.NEW_ORDER);
		
		// ���������� �ݱ�
		mf.FileClose();
		
		// ���α׷� ���� �˸���
		outprint.EndProgram();
	}
}
