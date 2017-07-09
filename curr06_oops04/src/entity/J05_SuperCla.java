package entity;

public class J05_SuperCla {

	private String data = "수퍼클래스 메시지";
	
//	1. 일반 getter 메소드
	public String supGetData() {
		return "수퍼클래스 : data = " + data;
	}
	
	
//	2. Override 메소드
	public String getData01() {
		return "수퍼클래스 : data = " + data;
	}
	
	
//	3. Override 메소드
	public String getData02() {
		return "수퍼클래스 : data = " + data;
	}
}
