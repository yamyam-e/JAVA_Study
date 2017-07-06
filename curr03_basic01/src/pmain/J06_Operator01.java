package pmain;

//	수업 내용
//	1. 대입연산자
//	2. 산술연산자
//	3. 복합대입연산자

public class J06_Operator01 {
	public static void main(String[] args) {
		
//		1. 대입연산자 : =
//			- 값을 동일한 type의 변수에 저장 가능
		
		int a;
		a = 10;
		
		int b = a = 20;
		
		String w1 = "가나";
		String w2 = w1;
		
//		1-1. 에러 : 형태 다른 경우
//		int c = "문자열";
//		int e = 10L;
//		float f = 12.34;
		
		
		
//		1-2. 참고 :
//			String 변수에 대하여 변수 선언 이후에 의미있는 값이 초기화되는 경우, 기본값 null 저장
		String name = null;
		name = "둘리";
		
		
		
		
//		2. 산술연산자 : + - * / %
//			- 숫자 값 산술연산
//				/ : 나눈 후 몫의 결과만 제공
//				% : 나눈 후 나머지 결과만 제공(정수 연산만 가능)
		
//		2-1. 정수 간 산술연산
		int g = 5, h = 2;
		System.out.println("+ : 합 => " + (g+h));
		System.out.println("- : 곱 => " + (g-h));
		System.out.println("* : 차 => " + (g*h));
		System.out.println("/ : 나눈 후 몫 => " + (g/h));
		System.out.println("% : 나눈 후 나머지 => " + (g%h));
		
//		2-2. 실수 간 산술연산
		double i = 6.3, j = 2.1;
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/j);
		System.out.println(i%j);
//		=> 실수를 이용한 mod연산은 의미 없음(사용 불가)
		
//		2-3. 예외 상황 : 정수와 실수 간 / 연산 => 소수점(나머지값) 제공
		System.out.println(5 / 2);
		System.out.println(5 / 2.0);
		System.out.println(5.0 / 2);
		System.out.println(5.0 / 2.0);
		
//		2-4. String에 대한 산술연산 : + 연산자만 가능(결합 기능)
		
		String s0 = "";		// 아무런 내용이 없는 빈 문자열을 저장
		String s1 = "가";
		String s2 = "나";
		String s3 = s0 + s1 + s2;
		System.out.println("s3 = " + s3);
		
//		2-5. String과 다른 type의 + 결합 => 통일된 String 타입으로 진행됨 => 결과는 String
		
		String t1 = "나이 : " ;
		int age = 10;
		String res = t1 + age;
		System.out.println(res);
		
		
		
		
//		3. 복합대입연산자 : += -= *= /= %=
//			n += m	=>	n = n + m
//			n -= m	=>	n = n - m
//			n *= m	=>	n = n * m
//			n /= m	=>	n = n / m
//			n %= m	=>	n = n % m
		
		int n = 5;
		int m = 2;
		
		System.out.println("3-1. n = " + n + ", m = " + m);
		
		n += m;
		System.out.println("3-2. n = " + n + ", m = " + m);
		
		n -= m;
		System.out.println("3-3. n = " + n + ", m = " + m);
		
		n *= m;
		System.out.println("3-4. n = " + n + ", m = " + m);
		
		n /= m;
		System.out.println("3-5. n = " + n + ", m = " + m);
		
		n %= m;
		System.out.println("3-6. n = " + n + ", m = " + m);
		
		
		
//		4. final 변수 : 선언된 변수를 수정이 불가능한 상수로 설정하는 키워드
		final int ff = 10;
//		에러 : ff = ff + 20;
	}
}
