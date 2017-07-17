package entity;

public class J04_SubClaBBB extends J04_SuperCla {

	String msg = "BBB 클래스의 멤버 변수 메시지";
	
	@Override
	public void overMth() {
		System.out.println("BBB 클래스 : " + msg);
	}
}
