package pmain;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

//	수업 내용
//	1. while - 조건식의 true/false
//	2. 기본 while - 무한루프
//		- 무한루프 이후의 명령 에러
//	3. while문 작성
//		- 조건식
//		- if - break;
//	4. while - if - continue
//	5. while - switch - break label;
//	6. 참고 : 중괄호 의미 및 생략 가능 상황
//	7. do-while

public class J07_while {
	public static void main(String[] args) {
		
//		while
//		- 조건식인 참인 경우, 해당 명령을 무조건 실행한 후 다시 조건식으로 반복 여부 판별
//		- 기본적으로, 반복을 멈추는 형식이 없으므로 추가적인 작업이 필요하다.
		
//		while(true) {
//			System.out.println("1. 무한 루프 출력");
//		}
//		=> 무한 루프 이후의 명령은 에러 발생됨
		
		
		
		String rcv2 = JOptionPane.showInputDialog("2 : 반복하시겠습니까? (y/n)");
		while(rcv2.equals("y") || rcv2.equals("Y")) {
			System.out.println(("2 : 해당 명령을 계속 반복합니다."));
		}
//		=> 반복문의 조건식으로 이동하므로, 의미 없는 상황
		
		
		
//		반복문 작성 방법
//		1. 반복하고자 하는 내용에 대하여 범위 또는 횟수를 구분
//		2. 반복하고자 하는 내용에 따라
//			- 범위인 경우, 시작값과 끝값을 파악한다.
//			- 횟수인 경우, 횟수를 범위 형식으로 변환한 후 시작값과 끝값을 결정한다.
//		3. 반복문이 사용할 변수를 선언한다.
//			- 일반적으로 int 변수
//		4. 선언된 변수에 설정된 시작값을 저장한다.
//		5. 반복문의 조건식을 통해서, 선언된 변수의 끝값이 표현되도록 한다.
//		6. 반복 과정 속에서, 선언된 변수가 능가 또는 감소되도록 증감식을 표현한다.
//		7. 반복하고 싶은 명령을 반복 과정에 포함시킨다.
		
		
//		예제 1 : 1 ~ 10의 범위에 있는 모든 정수 출력
		int start1 = 1;
		while(start1 <= 10) {
			System.out.println("3 : 현재 start1 변수의 값 = " + start1);
			start1++;
		}
		
		
//		예제 2 : "안녕"을 5번 출력
		int start2 = 1;
		while(start2 <= 5) {
			System.out.println("4 : 안녕 (현재 star2 = " + start2 + ")");
			start2++;
		}
		
		
//		while - if break;
//		- 특정 조건에서 반복문을 멈추고자 하는 경우
		
		while(true) {
			String rcv5 = JOptionPane.showInputDialog(
					"5 : 저장하려는 데이터를 입력하세요.(계속 입력 - 정치하려는 겨우 0 입력");
			
			if(rcv5.equals("0")) {
				JOptionPane.showMessageDialog(
						null, new JTextArea("5 : 저장 작업을 종료합니다."));
				break;
			}
			
			JOptionPane.showMessageDialog(
					null, new JTextArea("5 : 저장이 완료되었습니다.\n 저장을 계속합니다."));
		}
		
		
		
//		while - if - continue
//		- 반복 중 특정 조건에서 명령을 처음부터 재실행하고자 하는 경우
		
		while(true) {
			
			String rcv6 = JOptionPane.showInputDialog("6 : 정수를 입력하세요(범위 1 ~ 5)");
			
			int n6 = Integer.parseInt(rcv6);
			
			if(n6 < 1 || n6 > 5) {
				JOptionPane.showMessageDialog(
						null, new JTextArea("6 : 잘못된 입력입니다.\n 입력을 다시 시작합니다."));
				continue;
			}
			
			JOptionPane.showMessageDialog(
					null, new JTextArea("6 : 입력된 정수는 " + rcv6 + "입니다."));
			break;
		}
		
		
		
//		while - switch - break label
//		- 제어문이 중첩적으로 사용되는 경우, break의 대상을 레이블을 통해 지정해 줄 수 있다.
//		- break의 대상 3가지 : switch-case, while, for
		
		wh : while(true) {
			
			String rcv7 = JOptionPane.showInputDialog("7 : 알림을 보시겠습니까? (y/n)");
			
			switch(rcv7) {
			case "y": case "Y":
				JOptionPane.showMessageDialog(
									null, new JTextArea("7 : 5시 미팅이 있습니다."));
				break;
			
			case "n": case "N":
				JOptionPane.showMessageDialog(
									null, new JTextArea("7 : 프로그램을 종료합니다."));
				break wh;
				
				default :
					JOptionPane.showMessageDialog(
									null, new JTextArea("7 : 잘못된 입력입니다."));
				
			}
		}
		
//		참고 : 중괄호 의미 및 생략 가능 상황
		
		
//		do - while
//		- 명령을 상황에 관계없이 무조건 1회 실행한 후, 상황을 판별하여 반복 여부를 진행할 때 사용
		
		String rcv8 = null;
		
		do {
			
			JOptionPane.showMessageDialog(
								null, new JTextArea("8 : 오늘의 미팅 시간은 5시 입니다."));
			
			rcv8 = JOptionPane.showInputDialog("8 : 알림을 계속 보시겠습니까? (y/n)");
		} while(rcv8.equals("y"));
		
		System.out.println("프로그램 종료");
	}
}
