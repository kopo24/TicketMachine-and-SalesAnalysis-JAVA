package kopo24_0428_Ticket_Sales_Analysis;

import java.util.ArrayList;

public class ExchangeType {
	/*
	 * ***** DefineExchangeType���� ������ *****
	 */
	// Ƽ�� �߱� ����
	String ticketdate;
	
	// InputFromConsole Class���� �Է¹��� ����
	int whatTime;
	
	// Processing Class���� ���õ� ����
	int age;
	
	// InputFromConsole Class���� �Է¹��� Ƽ�� ����
	int hwmyTiket;
	
	// Processing Class���� ���õ� ����
	int price;
	
	// InputFromConsole Class�����Է¹��� ������
	int UooDae;
	
	/*
	 * ***** ProcessTicket���� ���Ǿ� ������ *****
	 */
	// �־߰��� �� ����
	int dayTime;
	int nightTime;
	
	// [0]�� �ְ�, [1]�� �߰� ���ɺ� �� ���
	int[] adult = new int[ConstValue.MENU_DAYTIME.length];;
	int[] teenager = new int[ConstValue.MENU_DAYTIME.length];;
	int[] child = new int[ConstValue.MENU_DAYTIME.length];;
	int[] old = new int[ConstValue.MENU_DAYTIME.length];;
	int[] baby = new int[ConstValue.MENU_DAYTIME.length];;
	
	// [0]�� �ְ�, [1]�� �߰� �� ����
	int[] sumprice = new int[ConstValue.MENU_DAYTIME.length];;
	
	// �Ǹŵ� ���� ��Ȳ
	int sumUooDae;
	
	// ��� ������ ��(0:�ش���� ����, 1:�����, 2:����������, 3:���ڳ�, 4:�ӻ��)
	int[] eachUooDae = new int[ConstValue.UOODAE.length];
	
	// ���ں� ���� ��Ȳ
	int dateprice;
	
	// ���ڿ� �׳� ������ ���������� �޸� �������� ������ ����
	ArrayList<String> dayprice;
}
