package kopo24_0426_ThemaPark_Tiket_Machine;

import java.util.ArrayList;

public class Output {
	
	public void printList(ArrayList<Processing> proAL) {
		
		for (int i = 0; i < proAL.size(); i++) {
			
			// 최종 결과 List 출력
			System.out.printf("%s%8s%5s%4d%10d%2s  *%s\n", proAL.get(i).WhatTime(), proAL.get(i).Age(),"X",
							  proAL.get(i).Amount(), proAL.get(i).Price(), "원", proAL.get(i).UooDae());
		}
	}

	public void printSum(ArrayList<Processing> proAL, ExchangeType et) {
		
		for (int i = 0; i < proAL.size(); i++) {
			
			et.sumprice += proAL.get(i).Price();
			
		}
		// 총 합계 금액 출력
		System.out.printf("입장료 총액은 %d원 입니다.\n", et.sumprice);
		
	}
	
}
