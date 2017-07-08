package pmain;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

//	수업 내용
//	1. 컴퓨터 정보 프로그램
//		- 브랜드 이름, 키보드 가격, 모니터 가격, 본체 가격, 총 구매가격
//		- menu && while && if

public class J09_while_menu {
	public static void main(String[] args) {
		
		String name = null;
		int kp = 0, mp = 0, bp = 0;
		int total = 0;
		
		String showMenu = 
				"1. 컴퓨터 정보 입력\n"
				+ "2. 컴퓨터 정보 출\n"
				+ "3. 프로그램 종료\n"
				+ "번호 선택";
		
		while(true) {
			
			String sel = JOptionPane.showInputDialog(showMenu);
			
			String msg = null;
			
			if(sel.equals("1")) {
				
				name = JOptionPane.showInputDialog("브랜드 이름 입력");
				kp = Integer.parseInt(
						JOptionPane.showInputDialog("키보드 가격 입력"));
				mp = Integer.parseInt(
						JOptionPane.showInputDialog("모니터 가격 입력"));
				bp = Integer.parseInt(
						JOptionPane.showInputDialog("본체 가격 입력"));
				total = kp + mp + bp;
				
				msg = "저장이 완료되었습니다.";
				
			} else if(sel.equals("2")) {
				
				msg = "[컴퓨터 정보 관리 프로그램]\n"
						+ "이름\t 키보드\t 모니터\t 본체\t 총 구매가격 \n"
						+ "====================================\n"
						+ name + "\t" + kp + "\t" + mp + "\t" + bp + "\t" + total;
				
			} else if(sel.equals("3")) {
				break;
				
			} else {
				msg = "잘못된 입력입니다.";
			}
			
			JOptionPane.showMessageDialog(null, new JTextArea(msg));
		}
	}
}
