package pmain;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

//	수업 내용
//	1. 콘솔창 출력과 JOption 출력
//	2. JOption : show && input
//	3. Integer.parseInt();

public class J02_JOption {
	public static void main(String[] args) {
		
		
		String msg = "출력하고 싶은 메시지";
		
		System.out.println(msg);		// 콘솔창 출력
		
		JOptionPane.showMessageDialog(null, new JTextArea("출력 내용"));
		JOptionPane.showMessageDialog(null, new JTextArea(msg));
		
//		JOptionPane.showMessageDialog(null, new JTextArea(10));
//		=> String 형태의 값만 가능
		
		
		
		JOptionPane.showInputDialog("입력하세요.");
		
		String name = JOptionPane.showInputDialog("이름 입력");
		JOptionPane.showMessageDialog(null, new JTextArea("입력받은 이름 = " + name));
		
		String rage = JOptionPane.showInputDialog("나이 입력");
		JOptionPane.showMessageDialog(null, new JTextArea("입력받은 나이 = " + rage));
		
		
//		10년 후의 나이는?
		int age = Integer.parseInt(rage);
		JOptionPane.showMessageDialog(
								null, new JTextArea("10년 후의 나이 = " + (age+10)));
		
		
//		문제 
//		1. 다음 내용을 JOption으로 입력받음 : 이름, 국어-영어-수학 점수 (점수는 int)
//		2. 총점 및 평균을 계산 (평균은 double)
//		3. 전체 결과를 JOption으로 출력
		
//		참고 : character
		String temper = JOptionPane.showInputDialog("문자 정보 입력");
		char temper2 = temper.charAt(0);
	}
}
