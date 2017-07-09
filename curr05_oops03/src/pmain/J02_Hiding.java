package pmain;

import entity.J02_ModelAcc;

//	수업 내용
//	1. 은닉화
//	2. 접근제한자

public class J02_Hiding {
	
//	객체 지향 설계 중요 관점
//	1. 캡슐화	
//		- 한가지 목적을 실현하는 여러가지 복합적인 기능들을 하나의 기능 단위로 묶는 처리 기법
//		- 이용자 입장에서 프로그램을 쉽게 이용
//		- 캡슐화의 본래적인 목적은 접근제어자(private, public 등)를 통해 샹상됨
//	2. 은닉화
//		- 프로그램의 변질을 막기 위해 정보 및 기능에 대한 접근 권한에 제한을 두는 처리 기법
//		- 기본적으로 모든 멤버변수 및 공개할 필요가 없는 멤버 베소드에 대해서는
//			private을 선언하여 접근을 허용하지 않도록 함
//		- 은닉화된 멤버 변수에 대해서는 public으로 선언된 setter/getter 메소드를 통해
//			접근을 허용하도록 권장한다.
	
//	접근제한자
//	- 지정한 멤버 및 클래스를 외부로부터 접근하지 못하도록 하는 기능 키워드
//	- 기능
//		1. private
//			- 클래스 내부에서의 멤버 변수 및 메소드에서만 이용 가능
//			- 다른 클래스에서 접근 불가능
//		2. (default) : 접근제한자가 명시되지 않은 경우의 상태
//			- 같은 클래스 내부에서 접근 가능
//			- 같은 패키지에 있는 클래스에서 접근 가능
//			- 다른 패키지에 있는 클래스에서 접근 불가능
//		3. protected : 상속 관계 상황에서만 이용 가능한 키워드
//			- 같은 클래스 내부에서 접근 가능
//			- 같은 패키지에 있는 다른 클래스에서 접근 가능
//			- 다른 패키지에 있는 다른 클래스에서 접근 불가능
//			- 단, 상속 관계에 있는 클래스에 대해서는 모든 상황에서 접근 가능
//		4. public
//			- 모든 상황에서 접근 가능
	
	
	public static void main(String[] args) {
		
		
//		1. 메인 메소드를 가진 클래스와 같은 패키지에 있는 클래스에 접근
		 J02_MainAcc ma1 = new J02_MainAcc();
		 
		 
//		 에러 : System.out.println(ma1.primsg);
		 System.out.println(ma1.defmsg);
		 System.out.println(ma1.protmsg);
		 System.out.println(ma1.pubmsg);
		 
//		 에러 : ma1.primth();
		 ma1.defmth();
		 ma1.protmth();
		 ma1.pubmth();
		 
		 
		 
//		 2. 메인메소드를 가진 클래스와 다른 패키지에 있는 클래스에 접근
		 J02_ModelAcc ma2 = new J02_ModelAcc();
		 
//		 에러 : System.out.println(ma2.primsg);
//		 에러 : System.out.println(ma2.defmsg);
//		 에러 : System.out.println(ma2.protmsg);
		 System.out.println(ma2.pubmsg);
		 
//		 에러 : ma1.primth();
//		 에러 : ma2.defmth();
//		 에러 : ma2.protmth();
		 ma2.pubmth();
		 
	}
}
