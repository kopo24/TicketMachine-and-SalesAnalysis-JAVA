package kopo24_0428_Ticket_Sales_Analysis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class DefineExchangeType {
	
	public ArrayList<ExchangeType> Define(ExchangeType et, ArrayList<ExchangeType> etAL) {
		try {
			File f_read = new File("C:\\Users\\Yang\\Desktop\\Report.csv");
			BufferedReader br_read = new BufferedReader(new FileReader(f_read));
			
			// br_read�� �о���� ������ �� �پ� ������ ��
			String readtxt;
			
			// �ʵ���� �� ù ���� ���� �о �ʿ���� �ʵ�� ���� ����(���)
			readtxt = br_read.readLine();
			String[] field_name = readtxt.split(",");
			
			// �� �پ� �о���鼭 ExchangeTypeŬ���� ������ �ʱ�ȭ �� ����� ArrayList�� add
			while ((readtxt = br_read.readLine()) != null) {
				
				et = new ExchangeType();
				
				String[] field = readtxt.split(",");
				
				et.ticketdate = field[0];
				
				if (field[1].equals(ConstValue.DAYTIME)) et.whatTime = ConstValue.MENU_DAYTIME[0];
				else et.whatTime = ConstValue.MENU_DAYTIME[1];
				
				if (field[2].equals(ConstValue.STR_ADULT)) et.age = ConstValue.AGE_GRADE[0];
				else if (field[2].equals(ConstValue.STR_TEENAGER)) et.age = ConstValue.AGE_GRADE[1];
				else if (field[2].equals(ConstValue.STR_CHILD)) et.age = ConstValue.AGE_GRADE[2];
				else if (field[2].equals(ConstValue.STR_OLD)) et.age = ConstValue.AGE_GRADE[3];
				else et.age = ConstValue.AGE_GRADE[4];
				
				et.hwmyTiket = Integer.parseInt(field[3]);
				
				et.price = Integer.parseInt(field[4]);
				
				if (field[5].equals(ConstValue.STR_UOODAE[0])) et.UooDae = ConstValue.UOODAE[0];
				else if (field[5].equals(ConstValue.STR_UOODAE[1])) et.UooDae = ConstValue.UOODAE[1];
				else if (field[5].equals(ConstValue.STR_UOODAE[2])) et.UooDae = ConstValue.UOODAE[2];
				else if (field[5].equals(ConstValue.STR_UOODAE[3])) et.UooDae = ConstValue.UOODAE[3];
				else et.UooDae = ConstValue.UOODAE[4];
				
				etAL.add(et);
			}
			br_read.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return etAL;
	}
	
}
