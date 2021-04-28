package kopo24_0428_Ticket_Sales_Analysis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class MakeFile {
	private BufferedWriter bw;
	private BufferedReader br;
	
	public MakeFile() {
		try {
			File f = new File("C:\\Users\\Yang\\Desktop\\DateSales.csv");
			bw = new BufferedWriter(new FileWriter(f, true)); // f가 잡은 파일에 append 할꺼냐? true
			br = new BufferedReader(new FileReader(f));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public MakeFile(int two) {
		try {
			File f = new File("C:\\Users\\Yang\\Desktop\\AgeSales.csv");
			bw = new BufferedWriter(new FileWriter(f, true)); // f가 잡은 파일에 append 할꺼냐? true
			br = new BufferedReader(new FileReader(f));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void FileClose() {
		try {
			bw.flush(); // 마지막으로 버퍼에 남은거 다 쓰기(버퍼 비우기)
			bw.close(); // 다른 사람도 사용할 수 있도록 파일을 닫는다.
			br.close(); // 다른 사람도 사용할 수 있도록 파일을 닫는다.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void HeaderWriteForDate() {
		try {
			String headtxt = br.readLine();
			if (headtxt == null) {
				headtxt = "일자,총 매출";
				bw.write(headtxt);
				bw.newLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void DataWriteForDate(ProcessTicket pt) {
		String[] dateNprice;
		try {
			for (int i = 0; i < pt.dayPrice().size(); i++) {
				dateNprice = pt.dayPrice().get(i).split(",");
				String writetxt = dateNprice[0].substring(0, 4) + "-" + dateNprice[0].substring(4, 6)
								  + "-" + dateNprice[0].substring(6) + "," + dateNprice[1];
				
				bw.write(writetxt);
				bw.newLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void HeaderWriteForAge() {
		try {
			String headtxt = br.readLine();
			if (headtxt == null) {
				headtxt = "구분,주간권,야간권";
				bw.write(headtxt);
				bw.newLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void DataWriteForAge(ProcessTicket pt) {
		try {
			String writetxt = ConstValue.STR_BABY + "," + pt.BabyTick(ConstValue.MENU_DAYTIME[0]) + "," + pt.BabyTick(ConstValue.MENU_DAYTIME[1]) + "\n"
							  + ConstValue.STR_CHILD + "," + pt.ChildTick(ConstValue.MENU_DAYTIME[0]) + "," + pt.ChildTick(ConstValue.MENU_DAYTIME[1]) + "\n"
							  + ConstValue.STR_TEENAGER + "," + pt.TeenTick(ConstValue.MENU_DAYTIME[0]) + "," + pt.TeenTick(ConstValue.MENU_DAYTIME[1]) + "\n"
							  + ConstValue.STR_ADULT + "," + pt.AdultTick(ConstValue.MENU_DAYTIME[0]) + "," + pt.AdultTick(ConstValue.MENU_DAYTIME[1]) + "\n"
							  + ConstValue.STR_OLD + "," + pt.OldTick(ConstValue.MENU_DAYTIME[0]) + "," + pt.OldTick(ConstValue.MENU_DAYTIME[1]) + "\n"
							  + "합계," + (pt.BabyTick(ConstValue.MENU_DAYTIME[0]) + pt.ChildTick(ConstValue.MENU_DAYTIME[0]) + pt.TeenTick(ConstValue.MENU_DAYTIME[0])
									  	  + pt.AdultTick(ConstValue.MENU_DAYTIME[0]) + pt.OldTick(ConstValue.MENU_DAYTIME[0])) + ","
							  + (pt.BabyTick(ConstValue.MENU_DAYTIME[1]) + pt.ChildTick(ConstValue.MENU_DAYTIME[1]) + pt.TeenTick(ConstValue.MENU_DAYTIME[1])
							  + pt.AdultTick(ConstValue.MENU_DAYTIME[1]) + pt.OldTick(ConstValue.MENU_DAYTIME[1])) + "\n"
							  + "매출," + pt.sumPrice(ConstValue.MENU_DAYTIME[0]) + "," + pt.sumPrice(ConstValue.MENU_DAYTIME[1]);
			
			bw.write(writetxt);
			bw.newLine();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
