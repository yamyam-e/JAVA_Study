package pmain;

//	수업 내용
//	1. 증감연산자 - 독립적 사용 && 병행사용

public class J06_Operator02 {
	public static void main(String[] args) {
		
//		증감연산자 : ++ --
//			a++ && ++a =>	a = a + 1
//			a-- && --a =>	a = a - 1
		
		
//		1. 독립적 사용
		int a1 = 10;
		a1++;
		
		int a2 = 10;
		++a2;
		
		
		int b1 = 10;
		b1--;
		
		int b2 = 10;
		--b2;
		
		
//		2. 병행 사용
		int c1 = 10;
		System.out.println(++c1);
		
		int c2 = 10;
		System.out.println(c1++);
		System.out.println(c1);
	}
}
