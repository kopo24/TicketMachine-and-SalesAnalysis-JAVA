package kopo24_0426_ThemaPark_Tiket_Machine;

import java.util.ArrayList;

public class Output {
	
	static Processing pro;

	public void printList(ArrayList<Processing> proAL) {
		
		for (int i = 0; i < proAL.size(); i++) {
			
			pro = proAL.get(i);
			
			// if문으로 Sting에 주간, 야간 대입
		
			// if문으로 String에 어른, 청소년, 소인, 경로, 아기 대입
		
			// if문으로 String에 우대적용 없음, ~~우대 대입
			
			// 최종 출력
			System.out.printf("%s%s x %d%d%s", /*주야String*/, /*어른?String*/,
							  /*티켓 갯수*/, /*최종가격*/, /*우대사항*/);
		}
	}

	public void printSum(ArrayList<Processing> proAL) {
		
		for (int i = 0; i < proAL.size(); i++) {
			
			pro = proAL.get(i);
			
			// et.price가격 합하면서 초기화 및 출력
			
		}
		
	}
	
}
