package kopo24_0428_Ticket_Sales_Analysis;

import java.util.ArrayList;

public class ExchangeType {
	/*
	 * ***** DefineExchangeType���� ������ *****
	 * ***** ArrayList etAL�� ���ǵ� �� �پ��� ������ add�Ѵ�. *****
	 */
	// Ƽ�� �߱� ����
	String ticketdate;
	
	// ���Ͽ��� �� ���� �־߰� �������ڸ� ���� --- 1:�ְ�, 2:�߰�
	int whatTime;
	
	// ���Ͽ��� �� ���� ���ɱ��м��ڸ� ���� --- 0:����, 1:û�ҳ�, 2:���, 3:����, 4:�Ʊ�
	int age;
	
	// ���Ͽ��� ���ٿ� ������ �����ߴ��� ����
	int hwmyTiket;
	
	// ���Ͽ��� �� ���� �ݾװ��� ����
	int price;
	
	// ���Ͽ��� �� ���� ���ɼǼ��ڸ� ���� --- 0:�ش���� ����, 1:�����, 2:����������, 3:���ڳ�, 4:�ӻ��
	int UooDae;
	
	/*
	 * ***** ProcessTicket���� ���Ǿ� ������ *****
	 */
	// �־߰��� �� ����
	int dayTime;
	int nightTime;
	
	// [0]�� �ְ�, [1]�� �߰� ���ɺ� ��� ��
	int[] adult = new int[ConstValue.MENU_DAYTIME.length];
	int[] teenager = new int[ConstValue.MENU_DAYTIME.length];
	int[] child = new int[ConstValue.MENU_DAYTIME.length];
	int[] old = new int[ConstValue.MENU_DAYTIME.length];
	int[] baby = new int[ConstValue.MENU_DAYTIME.length];
	
	// [0]�� �ְ�, [1]�� �߰� ������ ��
	int[] sumprice = new int[ConstValue.MENU_DAYTIME.length];
	
	// �Ǹŵ� ���� �� ��
	int sumUooDae;
	
	// ��� ������ ��(0:�ش���� ����, 1:�����, 2:����������, 3:���ڳ�, 4:�ӻ��)
	int[] eachUooDae = new int[ConstValue.UOODAE.length];
	
	// ���ں� ���� ��
	int dateprice;
	
	// [����]�� [�׳� ����]�� ���������� �޸� �������� add
	ArrayList<String> dayprice;
}
