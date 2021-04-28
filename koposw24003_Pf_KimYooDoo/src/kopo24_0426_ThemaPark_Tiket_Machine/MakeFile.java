package kopo24_0426_ThemaPark_Tiket_Machine;

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
			File f = new File("C:\\Users\\Yang\\Desktop\\Report.csv");
			bw = new BufferedWriter(new FileWriter(f, true)); // f�� ���� ���Ͽ� append �Ҳ���? true
			br = new BufferedReader(new FileReader(f));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void FileClose() {
		try {
			bw.flush(); // ���������� ���ۿ� ������ �� ����(���� ����)
			bw.close(); // �ٸ� ����� ����� �� �ֵ��� ������ �ݴ´�.
			br.close(); // �ٸ� ����� ����� �� �ֵ��� ������ �ݴ´�.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void HeaderWrite() {
		try {
			String headtxt = br.readLine();
			if (headtxt == null) {
				headtxt = "��¥,����,���ɱ���,����,����,������";
				bw.write(headtxt);
				bw.newLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void DataWrite(ArrayList<Processing> proAL) {
		try {
			for (int i = 0; i < proAL.size(); i++) {
				String writetxt = proAL.get(i).Date() + "," + proAL.get(i).WhatTime() + ","
								  + proAL.get(i).Age() + "," + proAL.get(i).Amount() + ","
								  + proAL.get(i).Price() + "," + proAL.get(i).UooDae();
				
				bw.write(writetxt);
				bw.newLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
