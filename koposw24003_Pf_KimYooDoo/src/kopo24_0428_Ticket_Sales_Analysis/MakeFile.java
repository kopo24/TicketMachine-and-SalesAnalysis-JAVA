package kopo24_0428_Ticket_Sales_Analysis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class MakeFile {
	private BufferedWriter bw;
	private BufferedReader br;
	
	// �����ڷμ� ���ں� ���� ��Ȳ���� ������ ����� ����
	public MakeFile() {
		try {
			File f = new File("DateSales.csv");
			bw = new BufferedWriter(new FileWriter(f, true)); // f�� ���� ���Ͽ� append �Ҳ���? true
			br = new BufferedReader(new FileReader(f));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// �Ű����� 1���ִ� �����ڷμ� ���ɺ� ���� ��Ȳ���� ������ ����� ����
	public MakeFile(int two) {
		try {
			File f = new File("AgeSales.csv");
			bw = new BufferedWriter(new FileWriter(f, true)); // f�� ���� ���Ͽ� append �Ҳ���? true
			br = new BufferedReader(new FileReader(f));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// �������� ���� ���� ����� ����� ����
	public void FileClose() {
		try {
			bw.flush(); // ���������� ���ۿ� ������ �� ����(���� ����)
			bw.close(); // �ٸ� ����� ����� �� �ֵ��� ������ �ݴ´�.
			br.close(); // �ٸ� ����� ����� �� �ֵ��� ������ �ݴ´�.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// ��¥ ���� ��Ȳ������ �ʵ���� ����
	public void HeaderWriteForDate() {
		try {
			String headtxt = br.readLine();
			if (headtxt == null) {
				headtxt = "����,�� ����";
				bw.write(headtxt);
				bw.newLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// ��¥ ���� ��Ȳ���Ͽ� ���� ������
	public void DataWriteForDate(ProcessTicket pt) {
		String[] dateNprice;
		try {
			for (int i = 0; i < pt.incomePerdate().size(); i++) {
				dateNprice = pt.incomePerdate().get(i).split(",");
				String writetxt = dateNprice[0].substring(0, 4) + "-" + dateNprice[0].substring(4, 6)
								  + "-" + dateNprice[0].substring(6) + "," + dateNprice[1];
				
				bw.write(writetxt);
				bw.newLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// ���ɺ� ���� ��Ȳ������ �ʵ���� ����
	public void HeaderWriteForAge() {
		try {
			String headtxt = br.readLine();
			if (headtxt == null) {
				headtxt = "����,�ְ���,�߰���";
				bw.write(headtxt);
				bw.newLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// ���ɺ� ���� ��Ȳ������ �����͸� ��
	public void DataWriteForAge(ProcessTicket pt) {
		try {
			String writetxt = ConstValue.STR_BABY + "," + pt.BabyTick(ConstValue.MENU_DAYTIME[0]) + "," + pt.BabyTick(ConstValue.MENU_DAYTIME[1]) + "\n"
							  + ConstValue.STR_CHILD + "," + pt.ChildTick(ConstValue.MENU_DAYTIME[0]) + "," + pt.ChildTick(ConstValue.MENU_DAYTIME[1]) + "\n"
							  + ConstValue.STR_TEENAGER + "," + pt.TeenTick(ConstValue.MENU_DAYTIME[0]) + "," + pt.TeenTick(ConstValue.MENU_DAYTIME[1]) + "\n"
							  + ConstValue.STR_ADULT + "," + pt.AdultTick(ConstValue.MENU_DAYTIME[0]) + "," + pt.AdultTick(ConstValue.MENU_DAYTIME[1]) + "\n"
							  + ConstValue.STR_OLD + "," + pt.OldTick(ConstValue.MENU_DAYTIME[0]) + "," + pt.OldTick(ConstValue.MENU_DAYTIME[1]) + "\n"
							  + "�հ�," + (pt.BabyTick(ConstValue.MENU_DAYTIME[0]) + pt.ChildTick(ConstValue.MENU_DAYTIME[0]) + pt.TeenTick(ConstValue.MENU_DAYTIME[0])
									  	  + pt.AdultTick(ConstValue.MENU_DAYTIME[0]) + pt.OldTick(ConstValue.MENU_DAYTIME[0])) + ","
							  + (pt.BabyTick(ConstValue.MENU_DAYTIME[1]) + pt.ChildTick(ConstValue.MENU_DAYTIME[1]) + pt.TeenTick(ConstValue.MENU_DAYTIME[1])
							  + pt.AdultTick(ConstValue.MENU_DAYTIME[1]) + pt.OldTick(ConstValue.MENU_DAYTIME[1])) + "\n"
							  + "����," + pt.sumPrice(ConstValue.MENU_DAYTIME[0]) + "," + pt.sumPrice(ConstValue.MENU_DAYTIME[1]);
			
			bw.write(writetxt);
			bw.newLine();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
