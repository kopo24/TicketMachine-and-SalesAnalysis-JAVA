package kopo24_0426_ThemaPark_Tiket_Machine;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Processing {
	
	ExchangeType et; // �����ڿ��� �Ű������� ������ et�� ������ ���� ���� ����
	
	Processing(ExchangeType et) { // ������. proAL�� ���´�. ExchangeType ���� ��� ����
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		
		// Ƽ�Ϲ��೯¥ ����
		et.ticketdate = sdf.format(date);
		
		sdf = new SimpleDateFormat("yyyy");
		
		// �ý��� �⵵ - �Է¹��� �ֹ� �⵵ = et.age �ʱ�ȭ
		if (et.juminNum.substring(6, 7).equals("1") || et.juminNum.substring(6, 7).equals("2")) {
			et.age = Integer.parseInt("19" + et.juminNum.substring(0, 2));
			et.age = Integer.parseInt(sdf.format(date)) - et.age;
		} else {
			et.age = Integer.parseInt("20" + et.juminNum.substring(0, 2));
			et.age = Integer.parseInt(sdf.format(date)) - et.age;
		}
		et.age += 1; // �ѱ��� ����
		
		// if���� et.age ������ int[] AGE_GRADE�� �̾Ƽ� et.age ���ʱ�ȭ. (0:����, 1:û�ҳ�, 2:����, 3:���, 4:����)
		if (et.age >= 65) et.age = ConstValue.AGE_GRADE[3];
		else if (et.age >= 19 && et.age < 65) et.age = ConstValue.AGE_GRADE[0];
		else if (et.age >= 13 && et.age < 19) et.age = ConstValue.AGE_GRADE[1];
		else if (et.age >= 3 && et.age < 13) et.age = ConstValue.AGE_GRADE[2];
		else if (et.age <= 2) et.age = ConstValue.AGE_GRADE[4];
		
		// et.price = ConstValue.TICKET_PRICE[et.whatTime - 1][et.age]
		et.price = ConstValue.TICKET_PRICE[et.whatTime - 1][et.age];
		
		// Ƽ�� ���� ���ϱ�. et.price = et.price * et.hwmyTicket
		et.price *= et.hwmyTiket;
		
		// ������ �����ϱ�. if������ UooDae�� ���ؼ� et.price *= ���õ� MENU_
		if (et.UooDae == ConstValue.MENU_NOT_THING) et.price = et.price;
		if (et.UooDae == ConstValue.MENU_DISABLED) et.price *= ConstValue.DISABLED;
		if (et.UooDae == ConstValue.MENU_NATIONAL_MERIT) et.price *= ConstValue.NATIONAL_MERIT;
		if (et.UooDae == ConstValue.MENU_MULTI_CHILD) et.price *= ConstValue.MULTI_CHILD;
		if (et.UooDae == ConstValue.MENU_PREGNANT) et.price *= ConstValue.PREGNANT;
		
		this.et = et; // ���⼭ ���������!! �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
		
	}
	
	public String Date() {
		return et.ticketdate;
	}
	
	public String WhatTime() {
		if (et.whatTime == ConstValue.MENU_DAYTIME) return ConstValue.DAYTIME;
		else return ConstValue.NIGHTTIME;
	}
	
	public String Age() {
		if (et.age == ConstValue.AGE_GRADE[0]) return ConstValue.STR_ADULT;
		else if (et.age == ConstValue.AGE_GRADE[1]) return ConstValue.STR_TEENAGER;
		else if (et.age == ConstValue.AGE_GRADE[2]) return ConstValue.STR_CHILD;
		else if (et.age == ConstValue.AGE_GRADE[3]) return ConstValue.STR_OLD;
		else /*(et.age == ConstValue.AGE_GRADE[4])*/ return ConstValue.STR_BABY;
	}
	
	public int Amount() {
		return et.hwmyTiket;
	}
	
	public int Price() {
		return et.price;
	}
	
	public String UooDae() {
		if (et.UooDae == ConstValue.MENU_NOT_THING) return ConstValue.STR_NOT_THING;
		else if (et.UooDae == ConstValue.MENU_DISABLED) return ConstValue.STR_DISABLED;
		else if (et.UooDae == ConstValue.MENU_NATIONAL_MERIT) return ConstValue.STR_NATIONAL_MERIT;
		else if (et.UooDae == ConstValue.MENU_MULTI_CHILD) return ConstValue.STR_MULTI_CHILD;
		else /*(et.UooDae == ConstValue.MENU_PREGNANT)*/ return ConstValue.STR_PREGNANT;
	}
	
}
