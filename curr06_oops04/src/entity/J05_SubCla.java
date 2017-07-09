package entity;

public class J05_SubCla extends J05_SuperCla {

	private String data = "서브클래스 메시지";
	
//	1. 일반 getter 메소드 : 서브클래스 멤버 호출
	public String subGetData() {
		return "서브클래스 : data = " + data;
	}
	
	
//	2. Override 메소드 : 서브클래스 멤버 호출
	public String getData01() {
		return "서브클래스 : data = " + data;
	}
	
	
//	3. 수퍼클래스 멤버변수를 호출하는 Override 메소드
	public String getData02() {
		return super.supGetData();
	}
}
