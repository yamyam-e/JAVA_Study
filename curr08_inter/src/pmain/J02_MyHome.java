package pmain;

import javax.swing.JOptionPane;

import entity.J02_Blog;
import entity.J02_Contents;
import entity.J02_Diary;

//	수업 내용
//	1. 인터페이스를 이용한 다형성 프로그램

public class J02_MyHome {
	public static void main(String[] args) {
		
		String showMenu =
				"1. 블로그 쓰기 \n"
				+ "2. 다이어리 쓰기 \n"
				+ "3. 블로그 읽기 \n"
				+ "4. 다이어리 읽기 \n"
				+ "5. 프로그램 종료 \n\n"
				+ "번호 선택";
		
		J02_Contents con = null;
		
		while(true) {
			
			String sel = JOptionPane.showInputDialog(showMenu);
			
			if(sel.equals("7")) {
				break;
			}
			
			if(sel.equals("1") || sel.equals("3")) {
				con = new J02_Blog();
			} else if(sel.equals("2") || sel.equals("4")) {
				con = new J02_Diary();
			} 
			
			if(sel.equals("1") || sel.equals("2")) {
				con.write();
			} else if(sel.equals("3") || sel.equals("4")) {
				con.read();
			} 
			
		}
		
//		참고 
//		try {
//			
//			con = (J03_SuperCla) Class.forName("entity.J02_" + urlSeg[1]).newInstance();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
}
