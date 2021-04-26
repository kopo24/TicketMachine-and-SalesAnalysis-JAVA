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
		
	}
	
	// 주민번호 입력
	public void inputJuminNum(ExchangeType et) {
		
	}
	
	// 구매할 티켓 갯수 입력
	public void hwmyTicket(ExchangeType et) {
		
	}
	
	// 우대사항 선택
	public void UooDae(ExchangeType et) {
		
	}
	
	// 티켓 지속발행 여부 선택
	public void goOrstop(ExchangeType et) {
		
	}
	
	// 프로그램 재시작, 종료 여부 선택
	public void newOrexit(ExchangeType et) {
		
	}
	
}
