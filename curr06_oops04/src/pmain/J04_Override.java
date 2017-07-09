package pmain;

import entity.J04_SubCla;

//	수업 내용
//	1. 메소드의 Override

public class J04_Override {
	
//	메소드 오버라이드
//	1. 수퍼클래스의 메소드 기능을 변경하는 처리 기법
//		(서브클래스에서 재정의한 메소드가 호출됨)
//	2. 수퍼클래스의 메소드와 동일한 형식으로 재정의
//	3. 상속관계에서만 존재하는 처리 기법
	
//	참고 : 메소드 오버로딩
//	- 매개변수의 형식에 따라 같은 이름의 메소드를 여러 개 생성하는 처리 기법
	
	public static void main(String[] args) {
		
		J04_SubCla sub = new J04_SubCla();
		
//		1. 메소드 오버로딩
		sub.overLoading();
		sub.overLoading(10);
		sub.overLoading("하나둘");
		sub.overLoading(12.34);
		
		
//		2. 메소드 오버라이드
		sub.works();
	}
}
