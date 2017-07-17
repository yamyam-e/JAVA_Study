package entity;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J05_Diary extends J05_Contents {

	String date;
	
	@Override
	public void write() {
		date = JOptionPane.showInputDialog("다이어리 쓰기 : 오늘의 날짜 입력");
		msg = JOptionPane.showInputDialog("다이어리 쓰기");
	}
	
	@Override
	public void read() {
		JOptionPane.showMessageDialog(
				null, new JTextArea("다이어리 읽기[날짜:" + date + "] : " + msg));
	}
}
