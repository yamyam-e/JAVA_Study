package entity;

public class J04_SubCla extends J04_SuperCla {
	
	
//	# 메소드 오버로딩
	public void overLoading(String data) {
		System.out.println("서브클래스 오버로딩(String) 메소드");
	}
	
	public void overLoading(double data) {
		System.out.println("서브클래스 오버로딩(double) 메소드");
	}
	
	
//	# 메소드 오버라이드
	public void works() {
		System.out.println("서브클래스 works() 메소드");
	}

}
