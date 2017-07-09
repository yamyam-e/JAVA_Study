package pmain;

import entity.J05_SubCla;

//	수업 내용
//	1. 수퍼클래스의 멤버변수를 재정의하는 경우

public class J05_OverVar {
	public static void main(String[] args) {
		
		J05_SubCla sub = new J05_SubCla();
		
//		1. 일반 getter 메소드
		System.out.println("1. " + sub.supGetData());
		System.out.println("1. " + sub.subGetData());
		
		
//		2. 오버라이드 메소드
		System.out.println("2. " + sub.getData01());
		
		
//		3. 수퍼클래스 멤버변수를 호출하는 오버라이드 메소드
		System.out.println("3. " + sub.getData02());
	}
}
