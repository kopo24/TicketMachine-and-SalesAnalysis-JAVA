package kopo24_0428_Ticket_Sales_Analysis;

import java.util.ArrayList;

public class ProcessTicket {
	
	ExchangeType et;
	
	ProcessTicket(ExchangeType et, ArrayList<ExchangeType> etAL) { 
		
		et.dateprice = etAL.get(0).price;
		et.dayprice = new ArrayList<String>();
		
		for (int i = 0; i < etAL.size(); i++) {
			
			/*
			 * if -> 주간 별 판매 현황 변수 계산
			 * else -> 야간 별 판매 현황 변수 계산
			 */
			if (etAL.get(i).whatTime == ConstValue.MENU_DAYTIME[0]) {
				et.dayTime += etAL.get(i).hwmyTiket;
				
				if (etAL.get(i).age == ConstValue.AGE_GRADE[0]) et.adult[0] += etAL.get(i).hwmyTiket;
				else if (etAL.get(i).age == ConstValue.AGE_GRADE[1]) et.teenager[0] += etAL.get(i).hwmyTiket;
				else if (etAL.get(i).age == ConstValue.AGE_GRADE[2]) et.child[0] += etAL.get(i).hwmyTiket;
				else if (etAL.get(i).age == ConstValue.AGE_GRADE[3]) et.old[0] += etAL.get(i).hwmyTiket;
				else /*etAL.get(i).age == ConstValue.AGE_GRADE[4]*/et.baby[0] += etAL.get(i).hwmyTiket;
				
				et.sumprice[0] += etAL.get(i).price;
			} else /*etAL.get(i).whatTime == ConstValue.MENU_DAYTIME[1]*/{
				et.nightTime += etAL.get(i).hwmyTiket;
				
				if (etAL.get(i).age == ConstValue.AGE_GRADE[0]) et.adult[1] += etAL.get(i).hwmyTiket;
				else if (etAL.get(i).age == ConstValue.AGE_GRADE[1]) et.teenager[1] += etAL.get(i).hwmyTiket;
				else if (etAL.get(i).age == ConstValue.AGE_GRADE[2]) et.child[1] += etAL.get(i).hwmyTiket;
				else if (etAL.get(i).age == ConstValue.AGE_GRADE[3]) et.old[1] += etAL.get(i).hwmyTiket;
				else /*etAL.get(i).age == ConstValue.AGE_GRADE[4]*/et.baby[1] += etAL.get(i).hwmyTiket;
				
				et.sumprice[1] += etAL.get(i).price;
			}
			
			// 우대권 판매 현황 변수 계산
			et.sumUooDae += etAL.get(i).hwmyTiket;
			if (etAL.get(i).UooDae == ConstValue.UOODAE[0]) et.eachUooDae[0] += etAL.get(i).hwmyTiket;
			else if (etAL.get(i).UooDae == ConstValue.UOODAE[1]) et.eachUooDae[1] += etAL.get(i).hwmyTiket;
			else if (etAL.get(i).UooDae == ConstValue.UOODAE[2]) et.eachUooDae[2] += etAL.get(i).hwmyTiket;
			else if (etAL.get(i).UooDae == ConstValue.UOODAE[3]) et.eachUooDae[3] += etAL.get(i).hwmyTiket;
			else /*etAL.get(i).UooDae == ConstValue.UOODAE[4]*/ et.eachUooDae[4] += etAL.get(i).hwmyTiket;
			
			// 일자별 매출 계산
			if (i == (etAL.size() - 1)) {
				et.dayprice.add(etAL.get(i).ticketdate + "," + String.valueOf(et.dateprice));
			} else {
				if (!(etAL.get(i).ticketdate.equals(etAL.get(i+1).ticketdate))) {
					et.dayprice.add(etAL.get(i).ticketdate + "," + String.valueOf(et.dateprice));
					et.dateprice = etAL.get(i+1).price;
				}
				else et.dateprice += etAL.get(i+1).price;
			}
		}
		
		this.et = et;
		
	}
	
	public ArrayList<String> dayPrice() {
		return et.dayprice;
	}
	
	public int eachUooDae(int what) {
		if (what == ConstValue.UOODAE[0]) return et.eachUooDae[0];
		else if (what == ConstValue.UOODAE[1]) return et.eachUooDae[1];
		else if (what == ConstValue.UOODAE[2]) return et.eachUooDae[2];
		else if (what == ConstValue.UOODAE[3]) return et.eachUooDae[3];
		else /*what == ConstValue.UOODAE[4]*/ return et.eachUooDae[4];
	}
	
	public int sumUooDae() {
		return et.sumUooDae;
	}
	
	public int dayTime() {
		return et.dayTime;
	}
	
	public int nightTime() {
		return et.nightTime;
	}
	
	public int AdultTick(int day) {
		if (day == ConstValue.MENU_DAYTIME[0]) return et.adult[0];
		else return et.adult[1];
	}
	
	public int TeenTick(int day) {
		if (day == ConstValue.MENU_DAYTIME[0]) return et.teenager[0];
		else return et.teenager[1];
	}
	
	public int ChildTick(int day) {
		if (day == ConstValue.MENU_DAYTIME[0]) return et.child[0];
		else return et.child[1];
	}
	
	public int OldTick(int day) {
		if (day == ConstValue.MENU_DAYTIME[0]) return et.old[0];
		else return et.old[1];
	}
	
	public int BabyTick(int day) {
		if (day == ConstValue.MENU_DAYTIME[0]) return et.baby[0];
		else return et.baby[1];
	}
	
	public int sumPrice(int day) {
		if (day == ConstValue.MENU_DAYTIME[0]) return et.sumprice[0];
		else return et.sumprice[1];
	}
	
}
















