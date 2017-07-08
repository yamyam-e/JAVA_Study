package pmain;

import javax.swing.JOptionPane;

//	수업 내용
//	1. switch - case
//	2. switch - case - break
//	3. switch - case - break - default
//	4. switch - case - case - break - default
//	5. switch : char
//	6. switch : String

public class J05_switch {
	public static void main(String[] args) {
		
//		switch - case
//		- 입력된 값과 동일한 값을 가진 case의 해당 명령을 싱행한 후, 이후의 모든 case 명령을 실행
		
		String rcv1 = JOptionPane.showInputDialog("정수 입력(1~3)");
		int num1 = Integer.parseInt(rcv1);
		
		System.out.println(">>>>>>> 입력된 num1 = " + num1);
		
		switch(num1) {
		case 1 :
			System.out.println("num1 : case 1번 영역의 해당 명령 실행됨");
		case 2 :
			System.out.println("num1 : case 2번 영역의 해당 명령 실행됨");
		case 3 :
			System.out.println("num1 : case 3번 영역의 해당 명령 실행됨");
		}
		
		
//		switch - case - break
//		- 입력된 값과 동일한 값을 가진 case의 해당 명령만 실행한 후, switch 구문 전체를 빠져나옴
		
		String rcv2 = JOptionPane.showInputDialog("정수 입력(1~3)");
		int num2 = Integer.parseInt(rcv2);
		
		System.out.println(">>>>>>> 입력된 num2 = " + num2);
		
		switch(num2) {
		case 1 :
			System.out.println("num2 : case 1번 영역의 해당 명령 실행됨");
			break;
			
		case 2 :
			System.out.println("num2 : case 2번 영역의 해당 명령 실행됨");
			break;
			
		case 3 :
			System.out.println("num2 : case 3번 영역의 해당 명령 실행됨");
			break;
		}
		
		
		
//		switch - case - break - default
//		- 입력된 값과 동일한 값을 가진 case의 해당 명령만 실행한 후, switch 구문 전체를 빠져나옴
//		- 입력된 값과 동일한 값을 가진 case가 없는 경우, default에 해당하는 명령을 실행
		
		String rcv3 = JOptionPane.showInputDialog("정수 입력(1~3)");
		int num3 = Integer.parseInt(rcv3);
		
		System.out.println(">>>>>>> 입력된 num3 = " + num3);
		
		switch(num3) {
		case 1 :
			System.out.println("num3 : case 1번 영역의 해당 명령 실행됨");
			break;
			
		case 2 :
			System.out.println("num3 : case 2번 영역의 해당 명령 실행됨");
			break;
			
		case 3 :
			System.out.println("num3 : case 3번 영역의 해당 명령 실행됨");
			break;
			
			default :
				System.out.println("num3 : default 영역의 해당 명령이 실행됨");
		}
		
		
		
//		switch - case - case - break - default
//		- 여러가지 case에 대하여 하나의 해당 명령을 설정할 수 있다.
		
		String rcv4 = JOptionPane.showInputDialog("정수 입력(1~10)");
		int num4 = Integer.parseInt(rcv4);
		
		System.out.println(">>>>>>> 입력된 num4 = " + num4);
		
		switch(num3) {
		case 1: case 3: case 5: case 7: case 9:
			System.out.println("num4 : 입력된 수는 홀수");
			break;
			
		case 2: case 4: case 6: case 8: case 10:
			System.out.println("num4 : 입력된 수는 짝수");
			break;
			
			default :
				System.out.println("num4 : 잘못된 입력입니다.");
		}
		
		
		
//		switch : char
//		- char 입력값에 대하여 사용 가능
		
		char rcv5 = 'y';
		
		System.out.println(">>>>>>> 입력된 rcv5 = " + rcv5);
		
		switch(rcv5) {
		case 'y': case 'Y':
			System.out.println("저장이 완료되었습니다.");
			break;
		
		case 'n': case 'N':
			System.out.println("저장이 취소되었습니다.");
			break;
			
			default :
				System.out.println("잘못된 입력입니다.");
		}
		
		
		
//		switch : String
//		- String 입력값에 대하여 사용 가능
		
		String rcv6 = JOptionPane.showInputDialog(
				"원하는 단어를 입력하세요.(spring/summer/autumn/winter)");
		System.out.println(">>>>>>> 입력된 rcv6 = " + rcv6);
		
		switch(rcv6) {
		case "spring" :
			System.out.println("rcv6 : 입력한 단어를 번역하면 봄입니다.");
			break;
			
		case "summer" :
			System.out.println("rcv6 : 입력한 단어를 번역하면 여름입니다.");
			break;
			
		case "autumn" :
			System.out.println("rcv6 : 입력한 단어를 번역하면 가을입니다.");
			break;
			
		case "winter" :
			System.out.println("rcv6 : 입력한 단어를 번역하면 겨울입니다.");
			break;
			
			default :
				System.out.println("잘못된 입력입니다.");
		}
	}
}
