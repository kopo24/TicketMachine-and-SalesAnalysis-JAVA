package kopo24_0426_ThemaPark_Tiket_Machine;

import java.util.ArrayList;

public class Output {
	
	// �ѹ� ���� ���� ���
	public void printOne(ExchangeType et) {
		System.out.printf("������ %d �� �Դϴ�.\n", et.price);
		System.out.printf("�����մϴ�.\n");
	}
	
	public void printList(ArrayList<Processing> proAL) {
		
		System.out.printf("======================== �������� ========================\n");
		for (int i = 0; i < proAL.size(); i++) {
			
			// ���� ��� List ���
			System.out.printf("%s%8s%5s%4d%10d%2s  *%s\n", proAL.get(i).WhatTime(), proAL.get(i).Age(),"X",
							  proAL.get(i).Amount(), proAL.get(i).Price(), "��", proAL.get(i).UooDae());
		}
	}

	public void printSum(ArrayList<Processing> proAL, ExchangeType et) {
		
		for (int i = 0; i < proAL.size(); i++) {
			
			et.sumprice += proAL.get(i).Price();
			
		}
		// �� �հ� �ݾ� ���
		System.out.printf("����� �Ѿ��� %d�� �Դϴ�.\n", et.sumprice);
		System.out.printf("======================== �������� ========================\n");
		
	}
	
	public void EndProgram() {
		System.out.printf("�̿����ּż� �����մϴ�.\n");
	}
	
}
