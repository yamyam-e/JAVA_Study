package entity;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J02_Blog implements J02_Contents {

	@Override
	public void write() {
		JOptionPane.showInputDialog("블로그 쓰기 : 작성한 글은 DB에 저장됩니다.");
	}
	@Override
	public void read() {
		JOptionPane.showMessageDialog(
				null, new JTextArea("블로그 읽기 : 저장된 블로그 글을 보여줍니다."));
	}
}
