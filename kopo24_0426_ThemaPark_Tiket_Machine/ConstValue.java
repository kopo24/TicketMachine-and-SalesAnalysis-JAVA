package kopo24_0426_ThemaPark_Tiket_Machine;

public class ConstValue {
	
	// InputFromConsole Class���� ����  ����
	final static int MENU_DAYTIME = 1; // �ְ�
	final static int MENU_NIGHTTIME = 2; // �߰�
		
	// �̿���(�־�, ���̿� ����)
	final static int[][] TICKET_PRICE = {{56000,47000,44000,44000},{46000,40000,37000,37000}};
	
	// ���̿� ���� ����(0:����, 1:û�ҳ�, 2:����, 3:���, 4:����)
	final static int[] AGE_GRADE = {0,1,2,3,4};
	final static int ADULT = 19; // � 19~64
	final static int TEENAGER = 13; // û�ҳ� 13~18
	final static int CHILD = 3; // ���� 3~12
	final static int OLD = 65; // ��� 65~
	final static int BABY = 2; // �Ʊ� ~2
	
	// InputFromConsole Class���� ������ ����
	final static double MENU_DISABLED = 0.6; // ����� ������ 40%
	final static double MENU_NATIONAL_MERIT = 0.5; // ���������� ������ 50%
	final static double MENU_MULTI_CHILD = 0.8; // ���ڳ� ������ 20%
	final static double MENU_PREGNANT = 0.85; // �ӻ�� ������ 15%
	
	// InputFromConsole Class���� ��� �߱� ����  ����
	final static int MENU_MORE_TICKET = 1; // ��� ����
	final static int MENU_NO_THANKS = 2; // ���� ����
	
	// ���α׷� ���� ���� ����
	final static int NEW_ORDER = 1; // �� �ֹ� ����
	final static int EXIT = 2; // ���α׷� ����
	
}
