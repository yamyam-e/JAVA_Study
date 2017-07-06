package pmain;

//	수업 내용
//	1. 데이터 형태

public class J02_DataType {
	
//	자바 데이터의 형태에 따른 종류
	
	public static void main(String[] args) {
	
//		1. 정수 데이터 :
//			- 소수점이 없는 숫자값
//			- 일반형(기본) && 확장(L/l)
		
		System.out.println(123123);
		System.out.println(123123L);
		
//		System.out.println(2200000000);
//		=> 일반형 정수가 적용되는 수의 범위 : -21억... ~ +21억...
		
		System.out.println(2200000000L);
		System.out.println();
		
		
		
//		2. 실수 데이터 :
//			- 소수점이 있는 숫자값
//			- 일반형(기본) && 약식(F/f)
		
		System.out.println(12.34);
		System.out.println(12.34f);
		
		System.out.println(123123.123123123);
		System.out.println(123123.123123123f);
//		=> 오차의 크기 차이
		
		System.out.println();
		
		
		
//		3. 단일문자 데이터 :
//			- 유니코드 표에 명시된 데이터 1개
//			- 각 나라 언어, 숫자, 기호
//			- 외따옴표 표기
		System.out.println('한');
		System.out.println('ㄱ');
		System.out.println('A');
		System.out.println('&');
		System.out.println('尹');
		System.out.println('1');
		
		System.out.println();
		
		
		
//		4. 문자열 데이터 :
//			- 일반적으로 사용되는 문장을 의미한다.
//			- String
//			- 쌍따옴표 표기
		System.out.println("둘리");
		System.out.println("둘리의 취미");
		System.out.println("1234");
		
		System.out.println();
		
		
		
//		5. 참/거짓 데이터 :
//			- 맞다/틀리다의 의미를 가짐
//			- true/false 키워드로 표현
//			- 출력 시 키워드가 그대로 출력됨
		System.out.println(true);
		System.out.println(false);
		
	}
}
