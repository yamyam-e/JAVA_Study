package pmain;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

//	수업 내용
//	1. 단순 if
//		- if문의 조건식과 true/false
//	2. if - else
//	3. if - else if - else
//	4. 조건식의 순서 중요
//	5. 참고 : 중괄호 의미 및 생략 가능 상황

public class J03_if {
	public static void main(String[] args) {
		
		
//		조건문 if : 조건식의 결과가 참(true)일 때 해당 명령을 실행
		
		String yn = JOptionPane.showInputDialog("알림 메시지를 보시겠습니까? (y/n)");
		if(yn.equals("y")) {
			JOptionPane.showMessageDialog(
					null, new JTextArea("2시간 후에 미팅이 있습니다."));
		}
		
		
//		조건문 if - else
//			- 조건식의 결과가 참(true)인 경우 if문 해당 명령을 실행
//			- 조건식의 결과가 거짓(false)인 경우 else문 해당 명령을 실행
//			- 둘 중(if/else) 하나는 반드시 실행됨
		
		String rage =
			JOptionPane.showInputDialog("청소년 인증 프로그램\n 나이를 입력하여 주십시오.");
		int age = Integer.parseInt(rage);
		
		if(age <= 19) {
			JOptionPane.showMessageDialog(
					null, new JTextArea("청소년 할인 대상입니다."));
		} else {
			JOptionPane.showMessageDialog(
					null, new JTextArea("청소년 할인 대상이 아닙니다."));
		}
		
		
		
//		조건문 if - else if
//			- 여러 상황으로 표현된 조건식에 대하여, 가장 먼저 참(true)인 상황에 대한 명령을 실행
//			- 참(true)이 되는 상황이 없으면 실행되는 내용 없음
		
		String rpoint = JOptionPane.showInputDialog(
										"등급 산출 프로그램 \n 획득 점수를 입력하세요(0~100)");
		int point = Integer.parseInt(rpoint);
		
		String msg = null;
		
		if(point >= 90) {
			msg = "획득 점수 등급은 A 입니다.";
		} else if(point >= 80) {
			msg = "획득 점수 등급은 B 입니다.";
		} else if(point >= 70) {
			msg = "획득 점수 등급은 C 입니다.";
		} else if(point >= 60) {
			msg = "획득 점수 등급은 D 입니다.";
		} else if(point < 60 && point >= 0) {
			msg = "획득 점수 등급은 F 입니다.";
		}
		JOptionPane.showMessageDialog(null, new JTextArea(msg));
		
		
		
//		조건문 if - else if - else
//			- 여러 상황으로 표현된 조건식에 대하여, 가장 먼저 참(true)인 상황에 대한 명령을 실행
//			- 참(true)이 되는 상황이 없으면 else에 해당하는 명령이 실행
		
		String rpoint2 = JOptionPane.showInputDialog(
				"등급 산출 프로그램 \n 획득 점수를 입력하세요(0~100)");
		int point2 = Integer.parseInt(rpoint);
		
		String msg2 = null;
		
		if(point2 >= 90) {
			msg2 = "획득 점수 등급은 A 입니다.";
		} else if(point2 >= 80) {
			msg2 = "획득 점수 등급은 B 입니다.";
		} else if(point2 >= 70) {
			msg2 = "획득 점수 등급은 C 입니다.";
		} else if(point2 >= 60) {
			msg2 = "획득 점수 등급은 D 입니다.";
		} else if(point2 < 60) {
			msg2 = "획득 점수 등급은 F 입니다.";
		} else {
			msg2 = "잘못된 입력입니다.";
		}
		JOptionPane.showMessageDialog(null, new JTextArea(msg2));
		
//		조건식의 순서가 중요
		
//		참고 : 중괄호 의미 및 생략 사능 상황
		
	}
}
