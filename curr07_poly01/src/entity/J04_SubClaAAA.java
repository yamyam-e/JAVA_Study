package entity;

public class J04_SubClaAAA extends J04_SuperCla {

	String msg = "AAA 클래스의 멤버 변수 메시지";
	
	@Override
	public void overMth() {
		System.out.println("AAA 클래스 : " + msg);
	}
}
