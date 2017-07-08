package pmain;

import javax.swing.JOptionPane;

public class J11_mainCla {
	public static void main(String[] args) {
		
		
//		정수 데이터 2개, String 형태 데이터 3개를 가지는 객체 이용
		
		J11_ArrayinCla cla1 = new J11_ArrayinCla();
		
		System.out.println("1. cla1 = " + cla1);
		System.out.println("1. cla1.st = " + cla1.st);
		System.out.println("1. cla1.in = " + cla1.in);
		
		cla1.in = new int[2];
		cla1.st = new String[3];
		
		System.out.println("3. cla1.in = " + cla1.in);
		System.out.println("3. cla1.st = " + cla1.st);
		
		
		System.out.println("3. cla1.in[0] = " + cla1.in[0]);
		System.out.println("3. cla1.in[1] = " + cla1.in[1]);
		
		
		cla1.in[0] = 10;
		cla1.in[1] = 20;
		
		System.out.println("4. cla1.in[0] = " + cla1.in[0]);
		System.out.println("4. cla1.in[1] = " + cla1.in[1]);
		
		
		for(int i=0; i<cla1.st.length; i++) {
			cla1.st[i] = JOptionPane.showInputDialog("문자열 입력");
		}
		
		for(int i=0; i<cla1.st.length; i++) {
			System.out.println("5. cla1.st[" + i + "] = " + cla1.st[i]);
		}
	}
}
