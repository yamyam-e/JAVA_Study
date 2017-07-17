package entity;

public class J04_SubClaCCC extends J04_SuperCla {
	
	String msg = "CCC 클래스의 멤버 변수 메시지";
	
	@Override
	public void overMth() {
		System.out.println("CCC 클래스 : " + msg);
	}
}
