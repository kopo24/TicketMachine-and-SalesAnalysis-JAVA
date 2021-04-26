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
	
	 // 주간 야간 선택
	public void selectTime(ExchangeType et) {
		System.out.printf("권종을 선택하세요.\n");
		System.out.printf("1. 주간권\n");
		System.out.printf("2. 야간권\n");
		System.out.printf("-> ");
		et.whatTime = sc.nextInt();
	}
	
	// 주민번호 입력
	public void inputJuminNum(ExchangeType et) {
		System.out.printf("주민등록번호를 입력하세요\n");
		System.out.printf("-> ");
		sc.nextLine();
		et.juminNum = sc.nextLine();
	}
	
	// 구매할 티켓 갯수 입력
	public void hwmyTicket(ExchangeType et) {
		System.out.printf("몇개를 주문하시겠습니까? (최대 10개)\n");
		System.out.printf("-> ");
		et.hwmyTiket = sc.nextInt();
	}
	
	// 우대사항 선택
	public void UooDae(ExchangeType et) {
		System.out.printf("우대사항을 선택하세요.\n");
		System.out.printf("1. 없음 (나이우대는 자동처리)\n");
		System.out.printf("2. 장애인\n");
		System.out.printf("3. 국가유공자\n");
		System.out.printf("4. 다자녀\n");
		System.out.printf("5. 임산부\n");
		System.out.printf("-> ");
		et.UooDae = sc.nextInt();
	}
	
	// 한번 계산된 가격 출력
	public void printOne(ExchangeType et) {
		System.out.printf("가격은 %d 원 입니다.\n", et.price);
		System.out.printf("감사합니다.\n");
	}
	
	// 티켓 지속발행 여부 선택
	public void goOrstop(ExchangeType et) {
		System.out.printf("계속 발권 하시겠습니까?\n");
		System.out.printf("1. 티켓 발권\n");
		System.out.printf("2. 종료\n");
		System.out.printf("-> ");
		et.goOrstop = sc.nextInt();
	}
	
	// 프로그램 재시작, 종료 여부 선택
	public void newOrexit(ExchangeType et) {
		System.out.printf("계속 진행 하시겠습니까?\n");
		System.out.printf("1. 새로운 주문\n");
		System.out.printf("2. 프로그램 종료\n");
		System.out.printf("-> ");
		et.newOrexit = sc.nextInt();
	}
	
}
