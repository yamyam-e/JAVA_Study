package pmain;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

//	수업 내용
//	1. 객체 지향 프로그램(인사정보)

public class J01_Intro {
	public static void main(String[] args) {
		
//		인사 정보 프로그램 : 이름, 나이
//		메뉴 항목 :
//			1. 인사 정보 입력
//			2. 인사 정보 출력
//			3. 프로그램 종료
		
		String name = null;
		int age = 0;
		
		String showMenu = 
				"1. 인사 정보 입력 \n"
				+ "2. 인사 정보 출력 \n"
				+ "3. 프로그램 종료\n\n"
				+ "번호 선택";
		
		while(true) {
			
			String sel = JOptionPane.showInputDialog(showMenu);
			
			String msg = null;
			
			if(sel.equals("1")) {
				
				name = JOptionPane.showInputDialog("이름 입력");
				String rage = JOptionPane.showInputDialog("나이 입력");
				age = Integer.parseInt(rage);
				
				msg = "저장이 완료되었습니다.";
				
			} else if(sel.equals("2")) {
				
				msg = "[인사 정보 관리 프로그램]\n"
						+ "이름\t 나이 \n"
						+ "----------------------------------------\n"
						+ name + "\t" + age;
				
			} else if(sel.equals("3")) {
				break;
				
			} else {
				msg = "잘못된 입력입니다.";
			}
			
			JOptionPane.showMessageDialog(null, new JTextArea(msg));
		}
	}
}
