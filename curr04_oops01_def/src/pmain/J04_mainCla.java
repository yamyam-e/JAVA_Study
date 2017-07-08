package pmain;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

//	수업 내용
//	1. oops 프로그램 예제
public class J04_mainCla {
	public static void main(String[] args) {
		
//		컴퓨터 정보 관리 프로그램 : 이름, 키보드-모니터-본체 가격, 총 구매가격
		
		J04_Computer com = new J04_Computer();
		
		String showMenu =
				"[컴퓨터 정보 프로그램] \n" 
				+ "1. 컴퓨터 정보 입력 \n"
				+ "2. 컴퓨터 정보 보기 \n"
				+ "3. 프로그램 종료 \n\n"
				+ "번호 선택";
		
		while(true) {
			
			String sel = JOptionPane.showInputDialog(showMenu);
			
			String msg = null;
			
			if(sel.equals("1")) {
				
				com.name = JOptionPane.showInputDialog("이름 입력");
				
				String rcv = JOptionPane.showInputDialog("키보드 가격 입력");
				com.kp = Integer.parseInt(rcv);
				
				rcv = JOptionPane.showInputDialog("본체 가격 입력");
				com.bp = Integer.parseInt(rcv);
				
				rcv = JOptionPane.showInputDialog("모니터 가격 입력");
				com.mp = Integer.parseInt(rcv);
				
				com.total = com.kp + com.bp + com.mp;
				
				msg = "저장이 완료되었습니다.";
				
			} else if(sel.equals("2")) {
				
				msg = "컴퓨터 정보 프로그램] \n"
					+ "이름\t키보드\t모니터\t본체\t총 구매가격\n"
					+ "===========================================\n"
					+ com.name + "\t" + com.kp + "\t" + com.mp + "\t" + com.bp + "\t"
					+ com.total;
				
			} else if(sel.equals("3")) {
				break;
				
			} else {
				msg = "잘못된 입력입니다.";
			}
			JOptionPane.showMessageDialog(null, new JTextArea(msg));
		}
	}
}
