package entity;

public class J01_ImpCla implements J01_Inter {

//	implements 클래스
//		- 다형성 이용을 위해서 추상 상태로 선언된 인터페이스의 내용을 구체화하는 클래스이므로,
//			extends가 아닌 implements를 사용
//		- 인터페이스에 선언된 추상메소들들을 반드시 구현(오버라이드)하도록 강요받는다.
	
	@Override
	public void overMth01() {
		System.out.println("J01_ImpCla 클래스에서 구현된 메소드01");
	}
	
	@Override
	public void overMth02() {
		System.out.println("J01_ImpCla 클래스에서 구현된 메소드02");
	}
}
