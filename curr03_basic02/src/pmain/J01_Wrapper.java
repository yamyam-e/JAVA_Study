package pmain;

import javax.swing.JOptionPane;

//	수업 내용
//	1. String 값의 Cast 연산 변환 => 불가능
//	2. Integer.parseInt();
//	3. Double.parseDouble();

public class J01_Wrapper {
	public static void main(String[] args) {
		
		String i1 = "123";
		System.out.println(i1 + 100);
		
//		에러 :
//		int i3 = (int)i1;
		
		int i3 = Integer.parseInt(i1);
		System.out.println(i3 + 100);
		
		
		String d1 = "12.34";
		System.out.println(d1 + 2.2);
		
		double d2 = Double.parseDouble(d1);
		System.out.println(d2 + 2.2);
		
		
		String b1 = "true";
		boolean b2 = Boolean.parseBoolean(b1);
		
		String b3 = "false";
		boolean b4 = Boolean.parseBoolean(b3);
		
//		참고 : character
		String temper = JOptionPane.showInputDialog("문자 정보 입력");
		char temper2 = temper.charAt(0);
	}
}
