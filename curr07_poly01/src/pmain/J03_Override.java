package pmain;

import entity.J03_SubCla;
import entity.J03_SuperCla;

//	수업 내용
//	1. 메소드 오버라이드와 형변환 시 호출 관계

public class J03_Override {
	public static void main(String[] args) {
		
		
//		1. 서브 객체 생성
		J03_SubCla sub = new J03_SubCla();
		
		
//		2. 수퍼 타입 레퍼런스 생성 및 형변환 초기화
		J03_SuperCla sup = sub;
		
		
		
//		3. 접근
		
//		3-1. 수퍼클래스 접근
		sup.supMth();
		
//		3-2. 서브클래스 접근 : 불가능
//		에러 : sup.subMth();
		
//		3-3. 오버라이드 메소드 접근 : 서브 객체 메소드가 호출됨
		sup.overMth();
//		=> 오버라이드 메소드를 이용하여 레퍼런스의 다형성을 이용
	}
}
