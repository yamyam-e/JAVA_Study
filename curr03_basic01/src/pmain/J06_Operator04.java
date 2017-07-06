package pmain;

//	수업 내용
//	1. 논리연산자
//	2. 부정연산자

public class J06_Operator04 {
	public static void main(String[] args) {
		
//		논리연산자 : && ||
//			&& :
//				- 논리곱연산자(AND연산자)
//				- 모든 조건 상황이 참인 경우 최종 결과 참
//			|| :
//				- 논리합연산자(OR연산자)
//				- 조건 상황 중 하나만 참이여도 최종 결과 참
		
		
//		1. &&
		boolean a1 = true && true;
		System.out.println("a1 = " + a1);
		
		
//		2. ||
		boolean b1 = false && true;
		System.out.println("b1 = " + b1);
		
		
//		3. 부정연산자 : !
//			- 부정(NOT연산자)
//			- 뒤의 논리 상황을 부정
		boolean c1 = !true;
		System.out.println("c1 = " + c1);
	}
}
