package entity;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J05_Blog extends J05_Contents {

	int viewcnt;
	
	@Override
	public void write() {
		msg = JOptionPane.showInputDialog("블로그 쓰기");
	}
	
	@Override
	public void read() {
		viewcnt++;
		JOptionPane.showMessageDialog(
				null, new JTextArea("블로그 읽기[조회수:" + viewcnt + "] : " + msg));
	}
}
