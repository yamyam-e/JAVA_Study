package pmain;

import javax.swing.JOptionPane;

//	수업 내용
//	1. 메소드의 리턴

public class J15_Method02 {
//	메소드의 리턴
//	- 매소드가 값 한개를 메소드를 사용한 곳으로 전달
//	- return은 하나의 값만 전달 가능
//	- return은 값을 전달하는 의미 외에 메소드를 종료시키는 의미가 있으므로, 뒤에는 명령이 올 수 없다.
	
	public static void main(String[] args) {
		
		int num1 = 0;
		setNum1(num1);
		System.out.println("num1 = " + num1);
		
		int num2 = 0;
		num2 = setNum2();
		System.out.println("num2 = " + num2);
		
		int num3 = 0;
		num3 = setNum3();
		System.out.println("num3 = " + num3);
		
	}

	private static void setNum1(int gate) {
		gate = 10;
	}
	
	private static int setNum2() {
		return 10;
	}
	
	private static int setNum3() {
		
		String rcv = JOptionPane.showInputDialog("정수(1~10) 입력");
		
		int ret = Integer.parseInt(rcv);
		
		if(ret >=1 && ret <= 10) {
			return ret;
		} else {
			return 0;
		}
	}
	
	public static void showNum() {
		
		String rcv = JOptionPane.showInputDialog("실행/정지");
		
		if(rcv.equals("정지")) {
			System.out.println("프로그램을 정지합니다.");
			return;
		}
		System.out.println("프로그램을 계속해서 실행합니다.");
	}
}
