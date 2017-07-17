package pmain;

import entity.J02_SubCla;
import entity.J02_SuperCla;

//	수업 내용
//	1. 형변환 시 멤버 접근 여부
//	2. 레퍼런스의 의미

public class J02_Access {
	public static void main(String[] args) {
		
		
//		1. 서브 객체 생성
		J02_SubCla sub01 = new J02_SubCla();
		System.out.println("1. sub01 = " + sub01);
		
		
		
//		2. 멤버 접근
		
//		2-1. 수퍼클래스 멤버 접근 : 가능
		System.out.println("2-1. " + sub01.supMsg);
		sub01.supMth();
		
//		2-2. 서브클래스 멤버 접근 : 가능
		System.out.println("2-2. " + sub01.subMsg);
		sub01.subMth();
		
		
		
//		3. 수퍼클래스 레퍼런스 생성
		J02_SuperCla sup = null;
		System.out.println("3. sup = " + null);
		
		
		
//		4. 서브 객체 레퍼런스 값 형변환 및 저장(UpCasting)
		sup = (J02_SuperCla)sub01;
		
//		참고 : Casting 생략 가능
		sup = sub01;
		System.out.println("4. sup = " + sup);
		
		
		
//		5. 멤버 접근
		
//		5-1. 수퍼클래스 멤버 접근 : 가능
		System.out.println("5-1. " + sup.supMsg);
		sup.supMth();
		
//		5-2. 서브클래스 멤버 접근 : 불가능
//		에러 :
//		System.out.println("5-2. " + sup.subMsg);
//		sup.subMth();
		
		
		
//		6. 서브 레퍼런스로 다시 재형변환(DownCasting)
		J02_SubCla sub02 = null;
		
		sub02 = (J02_SubCla)sup;
		
//		참고 : Casting 연산자 생략 불가능
//		에러 : sub02 = sup;
		
		System.out.println("6. sub02 = " + sub02);
		
		
		
//		7. 멤버 접근
		
//		7-1. 수펀클래스 멤버 접근 : 가능
		System.out.println("7-1. " + sub02.supMsg);
		sub02.supMth();
		
//		7-2. 서브클래스 멤버 접근 : 가능
		System.out.println("7-2. " + sub02.subMsg);
		sub02.subMth();
		
		
		
//		서브 타입 레퍼런스 값 => 수퍼 타입 레퍼런스 형태로 변환 : UpCasting
//		수퍼 타입 레퍼런스 값 => 서브 타입 레퍼런스 형태로 변환 : DownCasting
//		UpCasting은 Cast연산자 생략 가능하지만, DownCasting은 생략 불가능
		
		
	}
}
