package kopo24_0428_Ticket_Sales_Analysis;

import java.util.ArrayList;

public class Output {
	
	// ���α׷� ����� ���
	public void EndProgram() {
		System.out.printf("����м� ��\n");
	}
	
	// ó�� ���α׷����� ������ �о����
	public void Reprot(ArrayList<ExchangeType> etAL) {
		System.out.printf("====================== report.csv ======================\n");
		
		System.out.printf("%s%8s%8s%5s%8s%9s\n", "��¥", "����", "���ɱ���", "����", "����", "������");
		for (int i = 0; i < etAL.size(); i++) {
			System.out.printf("%s%6d%12d%7d%10d%13d\n", etAL.get(i).ticketdate, etAL.get(i).whatTime,
							  etAL.get(i).age, etAL.get(i).hwmyTiket, etAL.get(i).price, etAL.get(i).UooDae);
		}
		
		System.out.printf("--------------------------------------------------------\n\n\n\n");
	}
	
	// ���� �� �Ǹ���Ȳ ���
	public void ForwhatTime(ProcessTicket pt) {
		System.out.printf("================= ���� �� �Ǹ���Ȳ =================\n");
		
		System.out.printf("%s �� %d��\n", ConstValue.DAYTIME, pt.dayTime());
		System.out.printf("%s %d��, %s %d��, %s %d��, %s %d��, %s %d��\n",
						  ConstValue.STR_BABY, pt.BabyTick(ConstValue.MENU_DAYTIME[0]),
						  ConstValue.STR_CHILD, pt.ChildTick(ConstValue.MENU_DAYTIME[0]),
						  ConstValue.STR_TEENAGER, pt.TeenTick(ConstValue.MENU_DAYTIME[0]),
						  ConstValue.STR_ADULT, pt.AdultTick(ConstValue.MENU_DAYTIME[0]),
						  ConstValue.STR_OLD, pt.OldTick(ConstValue.MENU_DAYTIME[0]));
		System.out.printf("%s ���� : %d��\n", ConstValue.DAYTIME, pt.sumPrice(ConstValue.MENU_DAYTIME[0]));
		
		System.out.printf("\n");
		
		System.out.printf("%s �� %d��\n", ConstValue.NIGHTTIME, pt.nightTime());
		System.out.printf("%s %d��, %s %d��, %s %d��, %s %d��, %s %d��\n",
						  ConstValue.STR_BABY, pt.BabyTick(ConstValue.MENU_DAYTIME[1]),
						  ConstValue.STR_CHILD, pt.ChildTick(ConstValue.MENU_DAYTIME[1]),
						  ConstValue.STR_TEENAGER, pt.TeenTick(ConstValue.MENU_DAYTIME[1]),
						  ConstValue.STR_ADULT, pt.AdultTick(ConstValue.MENU_DAYTIME[1]),
						  ConstValue.STR_OLD, pt.OldTick(ConstValue.MENU_DAYTIME[1]));
		System.out.printf("%s ���� : %d��\n", ConstValue.NIGHTTIME, pt.sumPrice(ConstValue.MENU_DAYTIME[1]));
		
		System.out.printf("----------------------------------------------------\n\n\n\n");
	}
	
	// ���ں� ���� ��Ȳ ���
	public void ForDay(ProcessTicket pt) {
		
		String[] dateNprice;
		System.out.printf("========== ���ں� ���� ��Ȳ ==========\n");
		
		for (int i = 0; i < pt.dayPrice().size(); i++) {
			dateNprice = pt.dayPrice().get(i).split(",");
			System.out.printf("%s�� %s�� %s�� : �� ����%10s��\n", dateNprice[0].substring(0, 4),
							  dateNprice[0].substring(4, 6),dateNprice[0].substring(6), dateNprice[1]);
		}
		
		System.out.printf("--------------------------------------\n\n\n\n");
	}
	
	// ���� �Ǹ� ��Ȳ ���
	public void ForUooDae(ProcessTicket pt) {
		
		System.out.printf("====== ���� �Ǹ� ��Ȳ ======\n");
		
		System.out.printf("�� �Ǹ� Ƽ�ϼ�     :      %02d��\n", pt.sumUooDae());
		System.out.printf("��� ����          :      %02d��\n", pt.eachUooDae(0));
		System.out.printf("�����             :      %02d��\n",pt.eachUooDae(1));
		System.out.printf("����������         :      %02d��\n", pt.eachUooDae(2));
		System.out.printf("���ڳ�             :      %02d��\n", pt.eachUooDae(3));
		System.out.printf("�ӻ��             :      %02d��\n", pt.eachUooDae(4));
		
		System.out.printf("------------------------------\n");
		
	}
	
}
