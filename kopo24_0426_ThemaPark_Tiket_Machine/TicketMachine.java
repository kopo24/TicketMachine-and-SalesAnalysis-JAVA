package kopo24_0426_ThemaPark_Tiket_Machine;

import java.util.ArrayList;

public class TicketMachine {
	
	static ArrayList<Processing> proAL = new ArrayList<Processing>();
	
	public static void main(String[] args) {
		
		int cnt = 0;
		do {
			// 권종 선택, InputFromConsole로 가서 ExchangeType의 int whatTime 초기화
			
			// 주민번호 입력, InputFromConsole로 가서 ExchangeType의 String juminNum 초기화
			
			// 주문티켓 갯수, InputFromConsole로 가서 ExchangeType의 int howmanyTicket 초기화
			
			// 우대사항 선택, InputFromConsole로 가서 ExchangeType의 int UooDae 초기화
			
			// 한번 프로그램이 종료 될 때까지, 한 번 돌아간 while의 결과값을 저장 할 배열
			
			// proAL.add(new Processing(ExchangeType et)); // 위에서 초기화된 유동변수 사용
			
			// proAL.get(cnt)의 결과값(최종 계산된 가격) 출력. 감사합니다.
			
			//계속 티켓 발행 여부
			
			cnt++;
			
		} while (/*계속 발권 하시겠습니까? != 네(1) 종료(2)*/);
		
		System.out.printf("======================== 폴리랜드 ========================\n");
		// 최종 실행 결과창 출력
		
		Output printAL = new Output();
		
		// Output Class로 ArrayList 전달
		printAL.printList(proAL);
		
		// 최종 금액 합
		
		printAL.printSum(proAL);
		
		System.out.printf("======================== 폴리랜드 ========================\n");
		
		// 계속 진행 여부(1새로운 주문, proAL초기화 / 2프로그램 종료)
		
	}
}
