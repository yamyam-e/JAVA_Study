package pmain;

//	수업 내용
//	1. 관계연산자
//	2. String : .equal()

public class J06_Operator03 {
	public static void main(String[] args) {
		
//		관계연산자 : > >= < <= == !=
//			- 연산 결과는 참/거짓(boolean) 형태로 제공됨
//			== : 두 값이 같다.
//			!= : 두 값이 다르다.
		
		
//		1. 
		int n = 10, m = 5;
		System.out.println("1-1 : " + (n == m));
		boolean res = n != m;
		System.out.println("1-2 : " + res);
		
		
//		2.
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		
		boolean b4 = b1 == b2;
		System.out.println("2-1. b4 : " + b4);
		
		boolean b5 = b1 == b3;
		System.out.println("2-2. b5 : " + b5);
		
		
//		3. String
		String s1 = "가나다";
		String s2 = "가나다";
		
		boolean s3 = s1 == s2;			// X
		boolean s4 = s1.equals(s2);		// O
	}
}
