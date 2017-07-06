package pmain;

public class J07_Cast {
	public static void main(String[] args) {
		
//		Cast연산자
//		- 지정된 형태로 변환시키는 연산자
//		- 강제형변환
//		- boolean을 제외한 7개의 기본자료형은 서로 형변환이 가능함
		
		double d1 = 12.34;
		float f1;
		
//		에러 : f1 = d1;
		f1 = (float)d1;
		
		
		double d2 = 123.456;
		System.out.println("d2 = " + d2);
		System.out.println("(int)d2 = " + (int)d2);
		
		int i2;
		i2 = (int)d2;
		
		
		
//		자동형변환
//		- Cast 연산자를 명령하지 않아도, 자동으로 Cast연산자가 적용되는 처리상황
		
		
//		1. 대입연산식에서의 형변환 관계 : short < int < long < float < double
		
		short s3 = 10;
		int i3 = s3;
		
		int i4 = 10;
		long l4 = i4;
		
		long l5 = 10L;
		float f5 = l5;
		
		float f6 = 12.34f;
		double d6 = f6;
		
		
		
//		2. 산술연산식에서의 형변환
		
		short ss1 = 10;
		short ss2 = 20;
		
//		에러 : short ss3 = ss1 + ss2; => short의 산술연산 결과는 int
		
		
		int age = 10;
		System.out.println(age + "살");
//		=> int 자료형으로 인해 유니코드의 숫자데이터가 호출된 후 계산됨
		
		
		System.out.println("5 / 2 = " + (5 / 2));
		System.out.println("5 / 2.0 = " + (5 / 2.0));
		System.out.println("5.0 / 2 = " + (5.0 / 2));
		System.out.println("5.0 / 2.0 = " + (5.0 / 2.0));
//		=> 나눗셈 식에서의 5를 5.0으로 해석하여 연산을 진행함
	}
}
