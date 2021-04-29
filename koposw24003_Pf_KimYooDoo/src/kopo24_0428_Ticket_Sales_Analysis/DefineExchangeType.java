package kopo24_0428_Ticket_Sales_Analysis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class DefineExchangeType {
	
	// ����Ʈ���Ͽ��� �о���� ExchangeType ������ �� �پ� ������ ArrayList�� add�Ѵ�. ���ǵ� ArrayList�� �����Ѵ�
	public ArrayList<ExchangeType> Define(ExchangeType et, ArrayList<ExchangeType> etAL) {
		try {
			File f_read = new File("Report.csv");
			BufferedReader br_read = new BufferedReader(new FileReader(f_read));
			
			// br_read�� �о���� ������ �� �پ� ������ ��
			String readtxt;
			
			// �ʵ���� �� ù ���� ���� �о �ʿ���� �ʵ�� ���� ����(���)
			readtxt = br_read.readLine();
			String[] field_name = readtxt.split(",");
			
			// �� �پ� �о���鼭 ExchangeTypeŬ���� ������ �ʱ�ȭ �� ����� ArrayList�� add
			while ((readtxt = br_read.readLine()) != null) {
				
				// ó���� ������ �ʱ�ȭ�ȰŰ�, �� ��° ����ɶ����� ������ �Ǿ��ִ� et�� ���� �ʱ�ȭ�Ͽ� ArrayList�� ���� �濡 add�ϰ� �Ѵ�.
				et = new ExchangeType();
				
				// �� �ٿ��� �޸��� �������� ���ڿ� �迭�� �ִ´�
				String[] field = readtxt.split(",");
				
				// �� ���� [��¥]�� ������ ���Եȴ�
				et.ticketdate = field[0];
				
				// �� ���� [1:�ְ�, 2:�߰�]�� ������ ���Եȴ�
				if (field[1].equals(ConstValue.DAYTIME)) et.whatTime = ConstValue.MENU_DAYTIME[0];
				else et.whatTime = ConstValue.MENU_DAYTIME[1];
				
				// �� ���� ���ɱ�����[0:�, 1:û�ҳ�, 2:���, 3:����, 4:�Ʊ�]�� ������ ���Եȴ�.
				if (field[2].equals(ConstValue.STR_ADULT)) et.age = ConstValue.AGE_GRADE[0];
				else if (field[2].equals(ConstValue.STR_TEENAGER)) et.age = ConstValue.AGE_GRADE[1];
				else if (field[2].equals(ConstValue.STR_CHILD)) et.age = ConstValue.AGE_GRADE[2];
				else if (field[2].equals(ConstValue.STR_OLD)) et.age = ConstValue.AGE_GRADE[3];
				else et.age = ConstValue.AGE_GRADE[4];
				
				// �� ���� Ƽ�ϱ��ż����� ���Եȴ�.
				et.hwmyTiket = Integer.parseInt(field[3]);
				
				// �� ���� �ݾװ��� ���Եȴ�.
				et.price = Integer.parseInt(field[4]);
				
				// �� ���� ��뱸����[0:�ش���� ����, 1:�����, 2:����������, 3:���ڳ�, 4:�ӻ��]�� ���� ���Եȴ�
				if (field[5].equals(ConstValue.STR_UOODAE[0])) et.UooDae = ConstValue.UOODAE[0];
				else if (field[5].equals(ConstValue.STR_UOODAE[1])) et.UooDae = ConstValue.UOODAE[1];
				else if (field[5].equals(ConstValue.STR_UOODAE[2])) et.UooDae = ConstValue.UOODAE[2];
				else if (field[5].equals(ConstValue.STR_UOODAE[3])) et.UooDae = ConstValue.UOODAE[3];
				else et.UooDae = ConstValue.UOODAE[4];
				
				// ���Ե� ExchangeType�� ArrayList etAL�� add�Ѵ�.
				etAL.add(et);
			}
			br_read.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// ���� �ϼ��� ArrayList�� �����Ѵ�
		return etAL;
	}
	
}
