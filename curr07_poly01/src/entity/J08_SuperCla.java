package entity;

public abstract class J08_SuperCla {

	public abstract void absOverMth();
//	=> abstract 메소드
//		1. 메소드의 이름과 기본적인 형태만 선언(기능이 구체적으로 정의되지 않은 형태)
//		2. 위와 같은 상태를 "추상화 상태"라 함(추상 메소드
//		3. abstract 메소드를 이용하기 위해서는 클래스에도 abstract가 선언되어야 한다.
//		4. abstract 클래스를 상속받는 서브클래스는
//			무조건 abstract 메소드를 오버라이드하도록 강요받게 된다.
//		5. 다형성을 이용하기 위해 오버라이드 용으로 작성되는 메소드에 적용된다.
//		6. 의미없는 기능 구현부를 생략함으로써, 프로그램의 안정성 및 가독성을 높이는 효과가 있음
//		7. abstract 클래스는 멤버 변수를 가질 수 있다.
//		8. 객체를 직접 생성하는 경우, abstract 메소드의 직접 구현을 요구함
	
	String data;
	
	public void overMth() {
		
	}
}
