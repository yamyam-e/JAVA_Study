package pmain;

import javax.swing.JOptionPane;

import entity.J04_SubClaAAA;
import entity.J04_SubClaBBB;
import entity.J04_SubClaCCC;
import entity.J04_SuperCla;

//	수업 내용
//	1. 다형성을 이용한 호출 관계

public class J04_Polymorphism01 {
	public static void main(String[] args) {
		
		
		J04_SuperCla sup = null;
		
		String showMenu =
				"1. AAA 클래스의 기능 이용하기 \n"
				+ "2. BBB 클래스의 기능 이용하기 \n"
				+ "3. CCC 클래스의 기능 이용하기 \n"
				+ "4. 프로그램 종료 \n\n"
				+ "번호 선택";
		
		while(true) {
			
			String sel = JOptionPane.showInputDialog(showMenu);
			
			if(sel.equals("1")) {
				sup = new J04_SubClaAAA();
				
			} else if(sel.equals("2")) {
				sup = new J04_SubClaBBB();
				
			} else if(sel.equals("3")) {
				sup = new J04_SubClaCCC();
				
			} else if(sel.equals("4")) {
				break;
				
			} else {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			sup.overMth();
		}
	}
}
