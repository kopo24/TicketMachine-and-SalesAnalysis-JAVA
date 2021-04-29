package kopo24_0428_Ticket_Sales_Analysis;

import java.util.ArrayList;

public class ProcessTicket {
	
	ExchangeType et;
	
	// �����ڷμ� �� Ŭ������ ��ü pt�� ȣ��ɶ����� ����� �ϰ� ��.
	ProcessTicket(ExchangeType et, ArrayList<ExchangeType> etAL) { 
		
		// �ʵ���� ������ �������� ù ��° �� �ݾ� ���� ���� ���� -> ��� [���� �� +1]�� �ֱ⿡ ù ��° ���� �� �־�� ��
		et.dateprice = etAL.get(0).price;
		
		// ���ڰ� ���� �ݾ׵��� ���� add
		et.incomePerdate = new ArrayList<String>();
		
		for (int i = 0; i < etAL.size(); i++) {
			
			/*
			 * if -> �ְ� �� �Ǹ� ��Ȳ ���� ���
			 * else -> �߰� �� �Ǹ� ��Ȳ ���� ���
			 */
			if (etAL.get(i).whatTime == ConstValue.MENU_DAYTIME[0]) {
				// �ְ��� Ƽ�� �� ��
				et.dayTime += etAL.get(i).hwmyTiket;
				
				// �ְ��ǿ��� ���ɴ뺰 Ƽ�� �� ��
				if (etAL.get(i).age == ConstValue.AGE_GRADE[0]) et.adult[0] += etAL.get(i).hwmyTiket;
				else if (etAL.get(i).age == ConstValue.AGE_GRADE[1]) et.teenager[0] += etAL.get(i).hwmyTiket;
				else if (etAL.get(i).age == ConstValue.AGE_GRADE[2]) et.child[0] += etAL.get(i).hwmyTiket;
				else if (etAL.get(i).age == ConstValue.AGE_GRADE[3]) et.old[0] += etAL.get(i).hwmyTiket;
				else /*etAL.get(i).age == ConstValue.AGE_GRADE[4]*/et.baby[0] += etAL.get(i).hwmyTiket;
				
				// �ְ��� �ݾ��� ��
				et.sumprice[0] += etAL.get(i).price;
			} else /*etAL.get(i).whatTime == ConstValue.MENU_DAYTIME[1]*/{
				// �߰��� Ƽ�� �� ��
				et.nightTime += etAL.get(i).hwmyTiket;
				
				// �߰��ǿ��� ���ɴ뺰 Ƽ�� ��
				if (etAL.get(i).age == ConstValue.AGE_GRADE[0]) et.adult[1] += etAL.get(i).hwmyTiket;
				else if (etAL.get(i).age == ConstValue.AGE_GRADE[1]) et.teenager[1] += etAL.get(i).hwmyTiket;
				else if (etAL.get(i).age == ConstValue.AGE_GRADE[2]) et.child[1] += etAL.get(i).hwmyTiket;
				else if (etAL.get(i).age == ConstValue.AGE_GRADE[3]) et.old[1] += etAL.get(i).hwmyTiket;
				else /*etAL.get(i).age == ConstValue.AGE_GRADE[4]*/et.baby[1] += etAL.get(i).hwmyTiket;
				
				// �߰��� �ݾ��� ��
				et.sumprice[1] += etAL.get(i).price;
			}
			
			// ���� �Ǹ� �� ��
			et.sumUooDae += etAL.get(i).hwmyTiket;
			
			// ���� ������ ��
			if (etAL.get(i).UooDae == ConstValue.UOODAE[0]) et.eachUooDae[0] += etAL.get(i).hwmyTiket;
			else if (etAL.get(i).UooDae == ConstValue.UOODAE[1]) et.eachUooDae[1] += etAL.get(i).hwmyTiket;
			else if (etAL.get(i).UooDae == ConstValue.UOODAE[2]) et.eachUooDae[2] += etAL.get(i).hwmyTiket;
			else if (etAL.get(i).UooDae == ConstValue.UOODAE[3]) et.eachUooDae[3] += etAL.get(i).hwmyTiket;
			else /*etAL.get(i).UooDae == ConstValue.UOODAE[4]*/ et.eachUooDae[4] += etAL.get(i).hwmyTiket;
			
			// ���ں� ���� ���
			if (i == (etAL.size() - 1)) { // ������ ���̶�� �׳� ������ ���ڿ� ���±����� ���� ArrayList�� add
				et.incomePerdate.add(etAL.get(i).ticketdate + "," + et.dateprice);
			} else { // ������ ���� �ƴ϶��
				// i���� ���� ��¥�� i+1��° ���� ��¥�� ���� �ʴٸ�(== �ٸ��ٸ�)
				if (!(etAL.get(i).ticketdate.equals(etAL.get(i+1).ticketdate))) {
					// i��° ��¥�� �޸��� ���̰� �̾ ���±����� �ݾ� ���� ���������� �ٲ� add(���Խ� �պκ��� ���ڿ��̸� ������ ���ڿ��� �ٲ�)
					et.incomePerdate.add(etAL.get(i).ticketdate + "," + et.dateprice);
					// ���� ��¥ �ݾװ��� ù ��° �ݾװ��� ������
					et.dateprice = etAL.get(i+1).price;
				}
				// i��° ���� ��¥�� i+1��° ���� ��¥�� ���ٸ�
				else et.dateprice += etAL.get(i+1).price; // ���� �ݾװ��� i+1�� �ݾװ��� ���Ѵ�.
			}
		}
		
		// ���� �����ںκп��� ���ǵ� ExchageType�� ����� �� Ŭ�������� �θ� ExchangeType�� ���� ���� �����.
		this.et = et;
		
	}
	
	/*
	 * ����� ExchangeType�� ������ �Ʒ� �޼ҵ庰 ���ǿ� �����ϴ� ���� return�Ѵ�.
	 */
	// [����,�ݾ���]����� ���ڿ��� add�Ǿ��ִ� ArrayList
	public ArrayList<String> incomePerdate() {
		return et.incomePerdate;
	}
	
	// �Ű������� �´� ���� ������ ���� ����
	public int eachUooDae(int what) {
		if (what == ConstValue.UOODAE[0]) return et.eachUooDae[0];
		else if (what == ConstValue.UOODAE[1]) return et.eachUooDae[1];
		else if (what == ConstValue.UOODAE[2]) return et.eachUooDae[2];
		else if (what == ConstValue.UOODAE[3]) return et.eachUooDae[3];
		else /*what == ConstValue.UOODAE[4]*/ return et.eachUooDae[4];
	}
	
	// ����Ǹ�Ƽ�� �ѷ� ����
	public int sumUooDae() {
		return et.sumUooDae;
	}
	
	// �ְ��� Ƽ�� �Ǹ� �� �� ����
	public int dayTime() {
		return et.dayTime;
	}
	
	// �߰��� Ƽ�� �Ǹ� �� �� ����
	public int nightTime() {
		return et.nightTime;
	}
	
	// �Ű������� �´� ���� Ƽ�� �Ǹ� �� ���� --- 1:�ְ�, 2:�߰�
	public int AdultTick(int day) {
		if (day == ConstValue.MENU_DAYTIME[0]) return et.adult[0];
		else return et.adult[1];
	}
	
	// �Ű������� �´� û�ҳ� Ƽ�� �Ǹ� �� ���� --- 1:�ְ�, 2:�߰�
	public int TeenTick(int day) {
		if (day == ConstValue.MENU_DAYTIME[0]) return et.teenager[0];
		else return et.teenager[1];
	}
	
	// �Ű������� �´� ��� Ƽ�� �Ǹ� �� ���� --- 1:�ְ�, 2:�߰�
	public int ChildTick(int day) {
		if (day == ConstValue.MENU_DAYTIME[0]) return et.child[0];
		else return et.child[1];
	}
	
	// �Ű������� �´� ���� Ƽ�� �Ǹ� �� ���� --- 1:�ְ�, 2:�߰�
	public int OldTick(int day) {
		if (day == ConstValue.MENU_DAYTIME[0]) return et.old[0];
		else return et.old[1];
	}
	
	// �Ű������� �´� �Ʊ� Ƽ�� �Ǹ� �� ���� --- 1:�ְ�, 2:�߰�
	public int BabyTick(int day) {
		if (day == ConstValue.MENU_DAYTIME[0]) return et.baby[0];
		else return et.baby[1];
	}
	
	// �Ű������� �´� Ƽ�� �Ǹ� �ݾ��� �� ���� --- 1:�ְ�, 2:�߰�
	public int sumPrice(int day) {
		if (day == ConstValue.MENU_DAYTIME[0]) return et.sumprice[0];
		else return et.sumprice[1];
	}
	
}
