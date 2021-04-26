package kopo24_0426_ThemaPark_Tiket_Machine;

import java.util.Scanner;

public class InputFromConsole {
	
	Scanner sc;
	
	InputFromConsole() {
		sc = new Scanner(System.in);
	}
	
	protected void finalize() {
		sc.close();
	}
	
	 // �ְ� �߰� ����
	public void selectTime(ExchangeType et) {
		System.out.printf("������ �����ϼ���.\n");
		System.out.printf("1. �ְ���\n");
		System.out.printf("2. �߰���\n");
		System.out.printf("-> ");
		et.whatTime = sc.nextInt();
		
		// �Է¼��ڰ� 1 �Ǵ� 2�� �ƴ� ���
		while (et.whatTime < ConstValue.MENU_DAYTIME || et.whatTime > ConstValue.MENU_NIGHTTIME) {
			System.out.printf("������ �ٽ� �����ϼ���.\n");
			System.out.printf("1. �ְ���\n");
			System.out.printf("2. �߰���\n");
			System.out.printf("-> ");
			et.whatTime = sc.nextInt();
		}
	}
	
	// �ֹι�ȣ �Է�
	public void inputJuminNum(ExchangeType et) {
		// ó�� �ֹε�Ϲ�ȣ �Է� ����
		System.out.printf("�ֹε�Ϲ�ȣ�� �Է��ϼ���\n");
		System.out.printf("-> ");
		sc.nextLine(); // �ְ� �߰� ������ ���� ó��
		et.juminNum = sc.nextLine();
		
		// �Է¹��� �ֹε�Ϲ�ȣ�� 13�ڸ��� �ƴ� ��� ��� ���Է�
		while (et.juminNum.length() != ConstValue.NOMAL_JUMIN_NUMBER) {
			do {
				System.out.printf("�ٽ� �Է����ּ���.\n");
				System.out.printf("-> ");
				et.juminNum = sc.nextLine();
				
				// ���Է¹��� �ֹε�Ϲ�ȣ�� ���������ڰ� 1~4�� �ƴ� ��� ��� ���Է�
			} while (Integer.parseInt(et.juminNum.substring(6, 7)) < ConstValue.MIN_JUMIN_NUMBER
					 || Integer.parseInt(et.juminNum.substring(6, 7)) > ConstValue.MAX_JUMIN_NUMBER);
		}
	}
	
	// ������ Ƽ�� ���� �Է�
	public void hwmyTicket(ExchangeType et) {
		System.out.printf("��� �ֹ��Ͻðڽ��ϱ�? (�ִ� 10��)\n");
		System.out.printf("-> ");
		et.hwmyTiket = sc.nextInt();
		
		// �Է¼��ڰ� 0~10�� �ƴ� ���
		while (et.hwmyTiket < ConstValue.MIN_TICKET || et.hwmyTiket > ConstValue.MAX_TICKET) {
			System.out.printf("�ٽ� �ֹ����ּ��� (�ִ� 10��)\n");
			System.out.printf("-> ");
			et.hwmyTiket = sc.nextInt();
		}
	}
	
	// ������ ����
	public void UooDae(ExchangeType et) {
		System.out.printf("�������� �����ϼ���.\n");
		System.out.printf("1. ���� (���̿��� �ڵ�ó��)\n");
		System.out.printf("2. �����\n");
		System.out.printf("3. ����������\n");
		System.out.printf("4. ���ڳ�\n");
		System.out.printf("5. �ӻ��\n");
		System.out.printf("-> ");
		et.UooDae = sc.nextInt();
		
		// �Է¿��޴� ���ڰ� 1~5�� �ƴ� ���
		while (et.UooDae < ConstValue.MENU_NOT_THING || et.UooDae > ConstValue.MENU_PREGNANT) {
			System.out.printf("�������� �ٽ� �����ϼ���.\n");
			System.out.printf("1. ���� (���̿��� �ڵ�ó��)\n");
			System.out.printf("2. �����\n");
			System.out.printf("3. ����������\n");
			System.out.printf("4. ���ڳ�\n");
			System.out.printf("5. �ӻ��\n");
			System.out.printf("-> ");
			et.UooDae = sc.nextInt();
		}
	}
	
	// Ƽ�� ���ӹ��� ���� ����
	public void goOrstop(ExchangeType et) {
		System.out.printf("��� �߱� �Ͻðڽ��ϱ�?\n");
		System.out.printf("1. Ƽ�� �߱�\n");
		System.out.printf("2. ����\n");
		System.out.printf("-> ");
		et.goOrstop = sc.nextInt();
		
		// �Է¸޴����ڰ� 1~2�� �ƴ� ���
		while (et.goOrstop < ConstValue.MENU_MORE_TICKET || et.goOrstop > ConstValue.MENU_NO_THANKS) {
			System.out.printf("�߸� �Է��ϼ̽��ϴ�.\n");
			System.out.printf("1. Ƽ�� �߱�\n");
			System.out.printf("2. ����\n");
			System.out.printf("-> ");
			et.goOrstop = sc.nextInt();
		}
	}
	
	// ���α׷� �����, ���� ���� ����
	public void newOrexit(ExchangeType et) {
		System.out.printf("��� ���� �Ͻðڽ��ϱ�?\n");
		System.out.printf("1. ���ο� �ֹ�\n");
		System.out.printf("2. ���α׷� ����\n");
		System.out.printf("-> ");
		et.newOrexit = sc.nextInt();
		
		// �Է¸޴����ڰ� 1~2�� �ƴ� ���
		while (et.newOrexit < ConstValue.NEW_ORDER || et.newOrexit > ConstValue.EXIT) {
			System.out.printf("�߸� �Է��ϼ̽��ϴ�.\n");
			System.out.printf("1. ���ο� �ֹ�\n");
			System.out.printf("2. ���α׷� ����\n");
			System.out.printf("-> ");
			et.newOrexit = sc.nextInt();
		}
	}
	
}
