package kopo24_0428_Ticket_Sales_Analysis;

import java.util.ArrayList;

public class ExchangeType {
	/*
	 * ***** DefineExchangeType에서 정해짐 *****
	 */
	// 티켓 발권 일자
	String ticketdate;
	
	// InputFromConsole Class에서 입력받을 권종
	int whatTime;
	
	// Processing Class에서 선택될 나이
	int age;
	
	// InputFromConsole Class에서 입력받을 티켓 갯수
	int hwmyTiket;
	
	// Processing Class에서 선택된 가격
	int price;
	
	// InputFromConsole Class에서입력받을 우대사항
	int UooDae;
	
	/*
	 * ***** ProcessTicket에서 계산되어 정해짐 *****
	 */
	// 주야간권 총 갯수
	int dayTime;
	int nightTime;
	
	// [0]은 주간, [1]은 야간 연령별 총 명수
	int[] adult = new int[ConstValue.MENU_DAYTIME.length];;
	int[] teenager = new int[ConstValue.MENU_DAYTIME.length];;
	int[] child = new int[ConstValue.MENU_DAYTIME.length];;
	int[] old = new int[ConstValue.MENU_DAYTIME.length];;
	int[] baby = new int[ConstValue.MENU_DAYTIME.length];;
	
	// [0]은 주간, [1]은 야간 총 가격
	int[] sumprice = new int[ConstValue.MENU_DAYTIME.length];;
	
	// 판매된 우대권 현황
	int sumUooDae;
	
	// 우대 종류별 합(0:해당사항 없음, 1:장애인, 2:국가유공자, 3:다자녀, 4:임산부)
	int[] eachUooDae = new int[ConstValue.UOODAE.length];
	
	// 일자별 매출 현황
	int dateprice;
	
	// 일자와 그날 매출을 문자형으로 콤마 기준으로 나눠서 저장
	ArrayList<String> dayprice;
}
