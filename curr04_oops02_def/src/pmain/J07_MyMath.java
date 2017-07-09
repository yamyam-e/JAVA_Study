package pmain;

public class J07_MyMath {

	
	double myPI = 3.14;
	
//	final
//		- 이용 대상 및 효과
//			1. 멤버 변수 : 값을 변경할 수 없는 상수로 처리됨
//			2. 메소드 : 상속 관계에서 오버라이드 불가능
//			3. 클래스 : 상속 불가능
	
	final double fmyPI = 3.14;
	
//	에러 :
//	final double fmyPI;
//	=> final 멤버 변수는 선언 시 초기값을 지정해야만 한다.
//		- 초기값 지정 방법 2가지
//			1. 선언 시 대입을 이용한 초기화
//			2. 생성자를 이용한 초기화
	
	
	
//	2. static
//		- 이용 대상 및 효과
//			1. 공통 : 객체 없이 사용 가능한 멤버가 됨
//			2. 멤버 변수 : 객체가 공유하는 멤버 변수가 됨
//		- 초기화 진행 시 static {} 이용
	
	static double smyPI = 3.14;
	
	static final double sfmyPI = 3.14;
}
