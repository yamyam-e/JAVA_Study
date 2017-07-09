package entity;

public class J04_SuperCla {

//	# 메소드 오버로딩
	public void overLoading() {
		System.out.println("수퍼클래스 오버로딩01() 메소드");
	}
	
	public void overLoading(int data) {
		System.out.println("수퍼클래스 오버로딩(int) 메소드");
	}
	
	
//	# 메소드 오버라이드
	public void works() {
		System.out.println("수퍼클래스 works() 메소드");
	}
}
