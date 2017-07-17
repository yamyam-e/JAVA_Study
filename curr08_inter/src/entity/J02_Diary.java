package entity;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J02_Diary implements J02_Contents {

	@Override
	public void write() {
		JOptionPane.showInputDialog("다이어리 쓰기 : 작성한 글은 DB에 저장됩니다.");
	}
	@Override
	public void read() {
		JOptionPane.showMessageDialog(
				null, new JTextArea("다이어리 읽기 : DB에 저장된 다이어리를 보여줍니다."));
	}
}
