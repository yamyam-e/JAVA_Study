package pmain;

//	수업 내용
//	1. 지정예약어 final
//		- Math.PI
//	2. 지정예약어 static

public class J07_Modifier {
	public static void main(String[] args) {
		
//		지정예약어 final 과 static
		
		
//		1. final
		System.out.println(Math.PI);
		
//		Math.PI = 12.34;
//		=> 변경 불가
		
		J07_MyMath math = new J07_MyMath();
		System.out.println(math.fmyPI);
		System.out.println(math.myPI);
		
//		math.fmyPI = 12.34;
//		=> 변경 불가
		
		
		
//		2. static
		
//		System.out.println(J07_MyMath.fmyPI);
//		=> 객체 없이 사용 불가능
		
		System.out.println(J07_MyMath.smyPI);
		
		
		
//		3. static final 적용
		System.out.println(J07_MyMath.sfmyPI);
	}
}
