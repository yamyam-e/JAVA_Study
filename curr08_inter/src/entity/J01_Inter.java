package entity;

public interface J01_Inter {

//	인터페이스
//	1. 생성자가 없다.
//		=> 다형성 이용을 위해 존재하는 처리 단위이므로, 객체 생성을 목적으로 하지 않음
//	2. 인스턴스 멤버를 가질 수 없다.
//		=> 생성자를 통해 생성되는 객체와 관련된 멤버 변수 및 메소드 이용 불가
//	3. abstract 메소드 선언 가능
//		=> abstract 키워드 생략 가능 : 생략해도 자동으로 abstract가 적용된다.
//	4. 초기화된 멤버 변수만 선언 가능
//		=> 초기화를 진행하는 변수에는 자동으로 static final이 적용되며,
//			static멤버이므로 객체 없이도 사용 가능함
	
	
	
//	1. 생성자 없음
//	public J01_Inter() {
//		
//	}
	
	
//	2. 인스턴스 멤버 보유 불가능
//	int a;
//	
//	public void imth() {
//	
//	}
	
	
//	3. abstract 메소드 선언 및 키워드 생략 가능(자동 적용됨)
	public abstract void overMth01();
	public void overMth02();
	
	
//	4. 초기화된 멤버 변수(static final) 가능 : static 멤버 변수 && 변셩 불가능
	public int b = 10;
	
}
