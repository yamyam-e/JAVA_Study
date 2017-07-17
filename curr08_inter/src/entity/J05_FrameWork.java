package entity;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J05_FrameWork {

	String infoName;
	String showMenu;
	
	J05_FrameSource rcvSource;
	
	public J05_FrameWork(J05_FrameSource makeSource) {

		this.rcvSource = makeSource;
		this.showMenu = 
				"1. " + rcvSource.retInfoName() + "정보 입력 \n"
				+ "2. " + rcvSource.retInfoName() + "정보 출력 \n"
				+ "3. 프로그램 종료 \n\n"
				+ "번호 선택";
	}
	
	public void start() {
		
		while(true) {
			
			String sel = JOptionPane.showInputDialog(showMenu);
			
			String msg = null;
			if(sel.equals("1")) {
				this.rcvSource.setInfo();
				msg = "저장 완료";
				
			} else if(sel.equals("2")) {
				msg = this.rcvSource.getInfo();
				
			} else if(sel.equals("3")) {
				break;
			} else {
				msg = "잘못된 입력입니다.";
			}
			
			JOptionPane.showMessageDialog(null, new JTextArea(msg));
		}
	}
}
