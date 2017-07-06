package pmain;

//	수업 내용
//	1. 조건(삼항)연산자

public class J06_Operator05 {

//	조건(삼항)연산자
//	- 형식 : 조건식 ?   참인경우의 반환값 : 거짓인 경우의 반환값;
	
	public static void main(String[] args) {
		
		int n = 10;
		
		String res = n > 10 ?	n + "은 10보다 크다." : n + "은 10보다 크지 않다.";
		System.out.println(res);
		
		
//		주의 : 반환값만 가능
//		n > 10 ?		syso(n + "은 10보다 크다.") : syso(n + "은 10보다 크지 않다.");
		
	}
}
