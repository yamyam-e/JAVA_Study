package entity;

import javax.swing.JOptionPane;

public class J05_CarCorp implements J05_FrameSource {

	String name;
	int enginePrice;
	int tirePrice;
	int total;
	
	@Override
	public String retInfoName() {
		return "자동차";
	}

	@Override
	public void setInfo() {
		name = JOptionPane.showInputDialog("자동차 이름 입력");
		enginePrice = myJopInt("엔진 가격 입력");
		tirePrice = myJopInt("타이어 가격 입력");
		total = enginePrice + tirePrice;
	}

	@Override
	public String getInfo() {
		return "이름 : " + name + "\n"
				+ "엔진 가격 : " + enginePrice + "\n"
				+ "타이어 가격 : " + tirePrice + "\n"
				+ "총 구매가격 : " + total + "원"; 
	}

	private int myJopInt(String title) {
		return Integer.parseInt(JOptionPane.showInputDialog(title));
	}
	
}
