package pmain;

//	수업 내용
//	1. 캡슐화
//	2. 컨트롤 클래스

public class J04_EnCapsulation {
	
//	객체 지향 설계 중요 관점
//	1. 캡슐화
//		- 한가지 목적을 실현하는 여러가지 복합적인 기능들을 하나의 기능 단위로 묶는 처리 기법
//		- 이용자 입장에서 프로그램을 쉽게 이용
//		- 캡슐화의 본래적인 목적은 접근제어자(private, public 등.)를 통해 향상됨
//	2. 은닉화
	
	
//	Entity 클래스와 Control 클래스
//	- Entity 클래스 : 객체의 속성 및 기능이 구현된 클래스
//	- Control 클래스 : 여러 객체들을 통제, 제어하는 시스템이 구현된 클래스
	
	public static void main(String[] args) {
		
//		인사정보 프로그램(5명)
		
//		메뉴 :
//			1. 인사 정보 입력
//			2. 인사 정보 출력(입력순서)
//			3. 인사 정보 출력(나이 많은 순서)
//			4. 프로그램 종료
		
		J04_ControlCla master = new J04_ControlCla();
		master.works();
	}
}
