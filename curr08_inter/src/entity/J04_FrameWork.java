package entity;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J04_FrameWork {

	String infoName;
	String showMenu;
	
	J04_FameSource implSource;
	
	public J04_FrameWork(J04_FameSource makeSource) {

		this.implSource = makeSource;
		this.infoName = makeSource.retInfoName();
		this.showMenu =
				"1. " + implSource.retInfoName() + "정보 입력 \n"
				+ "2. " + implSource.retInfoName() + "정보 출력 \n"
				+ "3. 프로그램 종료 \n\n"
				+ "번호 선택";
	}
	
	public void start() {
		
		while(true) {
			
			String sel = JOptionPane.showInputDialog(showMenu);
			
			String msg = null;
			if(sel.equals("1")) {
				this.implSource.setInfo();
				msg = "저장 완료";
				
			} else if(sel.equals("2")) {
				msg = this.implSource.getInfo();
				
			} else if(sel.equals("3")) {
				break;
				
			} else {
				msg = "잘못된 입력";
			}
			
			JOptionPane.showMessageDialog(null, new JTextArea(msg));
		}
	}
}
