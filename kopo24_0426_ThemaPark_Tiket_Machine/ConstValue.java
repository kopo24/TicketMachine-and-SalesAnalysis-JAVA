package kopo24_0426_ThemaPark_Tiket_Machine;

public class ConstValue {
	
	// InputFromConsole Class에서 권종  선택
	final static int MENU_DAYTIME = 1; // 주간
	final static int MENU_NIGHTTIME = 2; // 야간
		
	// 이용요금(주야, 나이에 따름)
	final static int[][] TICKET_PRICE = {{56000,47000,44000,44000},{46000,40000,37000,37000}};
	
	// 나이에 따른 구분(0:대인, 1:청소년, 2:소인, 3:경로, 4:유아)
	final static int[] AGE_GRADE = {0,1,2,3,4};
	final static int ADULT = 19; // 어른 19~64
	final static int TEENAGER = 13; // 청소년 13~18
	final static int CHILD = 3; // 소인 3~12
	final static int OLD = 65; // 경로 65~
	final static int BABY = 2; // 아기 ~2
	
	// InputFromConsole Class에서 우대사항 선택
	final static double MENU_DISABLED = 0.6; // 장애인 할인율 40%
	final static double MENU_NATIONAL_MERIT = 0.5; // 국가유공자 할인율 50%
	final static double MENU_MULTI_CHILD = 0.8; // 다자녀 할인율 20%
	final static double MENU_PREGNANT = 0.85; // 임산부 할인율 15%
	
	// InputFromConsole Class에서 계속 발권 여부  선택
	final static int MENU_MORE_TICKET = 1; // 계속 발행
	final static int MENU_NO_THANKS = 2; // 발행 종료
	
	// 프로그램 종료 여부 선택
	final static int NEW_ORDER = 1; // 새 주문 진행
	final static int EXIT = 2; // 프로그램 종료
	
}
