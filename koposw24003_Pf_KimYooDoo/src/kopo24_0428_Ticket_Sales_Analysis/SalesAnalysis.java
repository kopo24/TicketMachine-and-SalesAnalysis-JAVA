package kopo24_0428_Ticket_Sales_Analysis;

import java.util.ArrayList;

public class SalesAnalysis {

	public static void main(String[] args) {
		ArrayList<ExchangeType> etAL = new ArrayList<ExchangeType>();
		ExchangeType et = new ExchangeType();
		DefineExchangeType det = new DefineExchangeType();
		Output outprint = new Output();
		// ���� �� �پ��� ExchangeType�� ���� ArrayList�� add
		etAL = det.Define(et, etAL);
		
		// ArrayList�� ������ �����Ͽ� report.csv�� �ѹ� ���
		outprint.Reprot(etAL);
		
		// �̰� ó���� �������� ����!!!!! �ٷ� ���� etAL�� ���� ���ǵǰ��� ��������!
		ProcessTicket pt = new ProcessTicket(et, etAL);
		
		// ���� �� �Ǹ���Ȳ ���
		outprint.ForwhatTime(pt);
		
		// ���ں� ���� ��Ȳ
		outprint.ForDay(pt);
		
		// ���� �Ǹ� ��Ȳ
		outprint.ForUooDae(pt);
		
		MakeFile mffd = new MakeFile();
		// ���ں� �������� ����
		mffd.HeaderWriteForDate();
		mffd.DataWriteForDate(pt);
		mffd.FileClose();
		
		mffd = new MakeFile(2);
		// ������ �Ǹ� �������� ����
		mffd.HeaderWriteForAge();
		mffd.DataWriteForAge(pt);
		mffd.FileClose();
	}
}
