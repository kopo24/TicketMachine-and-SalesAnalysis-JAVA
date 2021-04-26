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
	}
	
	// �ֹι�ȣ �Է�
	public void inputJuminNum(ExchangeType et) {
		System.out.printf("�ֹε�Ϲ�ȣ�� �Է��ϼ���\n");
		System.out.printf("-> ");
		sc.nextLine();
		et.juminNum = sc.nextLine();
	}
	
	// ������ Ƽ�� ���� �Է�
	public void hwmyTicket(ExchangeType et) {
		System.out.printf("��� �ֹ��Ͻðڽ��ϱ�? (�ִ� 10��)\n");
		System.out.printf("-> ");
		et.hwmyTiket = sc.nextInt();
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
	}
	
	// �ѹ� ���� ���� ���
	public void printOne(ExchangeType et) {
		System.out.printf("������ %d �� �Դϴ�.\n", et.price);
		System.out.printf("�����մϴ�.\n");
	}
	
	// Ƽ�� ���ӹ��� ���� ����
	public void goOrstop(ExchangeType et) {
		System.out.printf("��� �߱� �Ͻðڽ��ϱ�?\n");
		System.out.printf("1. Ƽ�� �߱�\n");
		System.out.printf("2. ����\n");
		System.out.printf("-> ");
		et.goOrstop = sc.nextInt();
	}
	
	// ���α׷� �����, ���� ���� ����
	public void newOrexit(ExchangeType et) {
		System.out.printf("��� ���� �Ͻðڽ��ϱ�?\n");
		System.out.printf("1. ���ο� �ֹ�\n");
		System.out.printf("2. ���α׷� ����\n");
		System.out.printf("-> ");
		et.newOrexit = sc.nextInt();
	}
	
}
