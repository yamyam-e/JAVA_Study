package pmain;

import javax.swing.JOptionPane;

import entity.J05_Blog;
import entity.J05_Contents;
import entity.J05_Diary;

//	수업 내용
//	1. 다형성 이용 예제

public class J05_MyHome {
	public static void main(String[] args) {
		
		String showMenu =
				"1. 블로그 쓰기 \n"
				+ "2. 다이어리 쓰기 \n"
				+ "3. 블로그 읽기 \n"
				+ "4. 다이어리 읽기 \n"
				+ "5. 프로그램 종료 \n\n"
				+ "번호 선택";
		
		J05_Contents con = null;
		
		J05_Blog blog = new J05_Blog();
		J05_Diary diary = new J05_Diary();
//		=> 추후 객체가 DataBase로 대체됨
		
		while(true) {
			
			String sel = JOptionPane.showInputDialog(showMenu);
			
			if(sel.equals("5")) {
				break;
			}
			
			if(sel.equals("1") || sel.equals("3")) {
				con = blog;
			} else {
				con = diary;
			}
			
			if(sel.equals("1") || sel.equals("2")) {
				con.write();
			} else {
				con.read();
			}
		}
	}
}
