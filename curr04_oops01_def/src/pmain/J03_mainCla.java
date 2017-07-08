package pmain;

//	수업 내용
//	1. 명칭 - "멤버변수" 소개
//	2. 각 타입 멤버 별 기본값 소개

public class J03_mainCla {
	public static void main(String[] args) {
		
		J03_Member cla = new J03_Member();
		
		System.out.println("1. 객체에 존재하는 각 멤버 변수의 기본값 확인");
		System.out.println("1. int형 멤버 변수 = " + cla.i);
		System.out.println("1. long형 멤버 변수 = " + cla.l);
		System.out.println("1. double형 멤버 변수 = " + cla.d);
		System.out.println("1. float형 멤버 변수 = " + cla.f);
		System.out.println("1. String형 멤버 변수 = " + cla.s);
		
		
		J03_Member02 cla2 = new J03_Member02();
		
		System.out.println("1. 객체에 존재하는 각 멤버 변수의 지정된 초기화값 확인");
		System.out.println("2. i = " + cla2.i);
		System.out.println("2. l = " + cla2.l);
		System.out.println("2. d = " + cla2.d);
		System.out.println("2. f = " + cla2.f);
		System.out.println("2. s = " + cla2.s);
	}
}
