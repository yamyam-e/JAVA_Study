package pmain;

//	수업 내용
//	1. 클래스 구조 및 명칭
//	2. 메모리(Heap, Stack, Method) 소개 및 변수

public class J06_MemberName {

//	※ 멤버 :
//		- 클래스 내부에 존재하는 각 구성요소
//		- 멤버 변수 && 멤버 메소드
	
	
//	1. 멤버 변수 : 인스턴스 멤버 변수 && 클래스 멤버 변수
	
	int data1;
	String data2;
//	=> 인스턴스 멤버 변수
//		: 객체가 만들어져야만 이용 가능한 변수
//		: Heap 메모리 사용
	
	static int sdata1;
	static String sdata2;
//	=> 클래스 멤버 변수
//		: 클래스 완성 시 이용 가능한 변수
//		: Method 메모리 사용
	
	
//	2. 멤버 메소드 : 인스턴스 멤버 메소드 && 클래스 멤버 메소드
//		=> 메소드 내부에서 선언된 변수는 stack 메모리 사용
	
	void works1() {
		int stackVariable;
		System.out.println("인스턴스 멤버 메소드");
	}
//	=> 인스턴스 멤버 메소드
//		: 객체가 만들어져야만 이용 가능한 메소드
	
	
	static void works2() {
		int stackVariable;
		System.out.println("클래스 멤버 메소드");
	}
//	=> 클래스 멤버 메소드
//		: 클래스 완성 시 이용 가능한 메소드
	
	
//	3. 생성자 : 기본생성자 및 그 외 오버로딩 형식
	public J06_MemberName() {

	}
//	=> 기본생성자
	
	
	public J06_MemberName(int a) {
		
	}
//	=> 생성자 오버로딩
	
	
//	4. static 변수 초기화 영역
	static {
		
	}
}
