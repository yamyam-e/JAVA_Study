package pmain;

//	수업 내용
//	1. 타입(Type) 의미
//	2. 기본형 타입 및 String
//	3. 상수 소개

public class J05_Type {
	
//	타입(Type) :
//		- 데이터의 형태와 관련된 내용이 약속된 키워드
	
//	변수 선언 시
//		1. 저장되는 데이터의 형태 => 기본적으로, 정해진 형태의 데이터만 저장 가능
//		2. 제공되는 메모리 공간의 크기 => 데이터의 범위 또는 오차율과 관련됨
	
	public static void main(String[] args) {
	
//		1. 정수 타입
		
//		1-1. int : 일반 정수 / 4byte / -21억4748.. ~ +21억4748..
		int i;
		i = 10;
		
//		1-2. long : 확장 정수(L/l) / 8byte / -9223경.. ~ +9223경..
		long l;
		l = 10L;
		
//		1-3. byte : 일반 정수 / 1byte / -128 ~ +127
		byte b;
		b = 10;
		
//		1-4. short : 일반 정수 / 2byte / -32768 ~ + 32767
		short sh;
		sh = 10;
		
		
		
		
//		2. 실수 타입
		
//		2-1. double : 일반 실수 / 8byte / ..
		double d;
		d = 123456789.123456789;
		
//		2-2. float : 약식 실수 / 4byte / ..
		float f;
		f = 123.456f;
		
		
		
		
//		3. 단일문자 타입 : char / 2byte /
//			- 유니코드에서 정의된 문자
//			- 참고 : 유니코드 - 각 국 언어를 토일된 방법으로 표현할 수 있도록 제안된 국제 코드 규약
//			- 예 : 'A'의 경우 10진수 65는 16진수 유니코드로 0041이며 '\u0041\'로 이용 가능
//				char c = '\u0041';
//				System.out.println(c);	=> 결과 A 출력됨
		
		char c;
		c = 'A';
		System.out.println(c);
		
		c = 65;
		System.out.println(c);
//		=> 모두 A를 출력함
		
		c = '밥';
		System.out.println(c);
		
		
		
		
//		4. 문자열 타입 : String 클래스
		String s1 = "가나다";
		String s2 = "1234";
		String s3 = "밥";
		
		String s4 = "";
		String s5 = null;
		System.out.println("s4 = " + s4);
		System.out.println("s5 = " + s5);
		
		
		
		
//		5. 논리타입 : boolean / 1byte /
		boolean b1 = true;
		boolean b2 = false;
		
		
		
//		문제
//		1. 다음 내용을 변수를 이용한 프로그램을 통해 출력하세요.
//			- 내 정보 : 이름, 나이, 키, 전화번호, 꿈
//			- 친구 정보 : 이름, 나이, 취미, 성격
	}
}
