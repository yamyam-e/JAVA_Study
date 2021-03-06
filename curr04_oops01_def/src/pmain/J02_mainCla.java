package pmain;

//	수업 내용
//	1. 객체 지향 프로그램
//	2. 클래스 && 인스턴스 && 레퍼런스

//	문제
//	1. 클래스 && 인스턴스 && 레퍼런스

public class J02_mainCla {
	public static void main(String[] args) {
		
//		객체 지향 프로그램 설계
//		1. 클래스
//			- 구현하고자 하는 대상에 대하여, 특성(속성)을 나타내는 값과 역할(행동)을 나타내는 기능을 표현
//			- 대상에 대한 설계도
//			- 실제 객체 정보를 저장할 수 있는 공간이 생성되진 않으므로 주의
//			- Method 메모리에 존재
//		2. 객체	
//			- 실제 객체 정보를 저장할 수 있는 공간
//			- 생성된 객체 안에 존재하는 저장 공간에는 자동으로 각 타입별 기본값이 저장됨
//			- 객체 생성 후, 객체값(고유번호)을 제공한다.
//			- 객체 고유번호를 프로그래머가 저장하지 않으면, 프로그래머는 객체를 계속적으로 이용할 수 없으며
//				이용할 수 없게 된 객체는 다음 과정에서 자동으로 삭제된다.
//			- "인스턴스"라 부르기도 함
//			- Heap 메모리에 존재
//		3. 레퍼런스 변수
//			- 실제 객체가 생성될 때 제공되는 객체값(고유번호)을 저장하는 변수
//			- 저장된 고유번호의 대상에 대해 "형태를 언급하는 역할"을 함
//			- 변수가 선언되어도 기본값이 없는 상태이며, 기본값을 저장하려는 경우 null 키워드를 사용한다.
//			- "참조 변수"라 부르기도 함
//			- Stack 메모리에 존재
		
		
//		1. 클래스 작성 : J02_People
		
//		2. 객체 생성
//			1. 형식 : new 클래스이름();
//			2. new :
//				- 객체 생성을 명령하는 키워드
//			3. 클래스이름() :
//				- new를 통해 호출될 때에만 실행됨
		
		
		new J02_People();		// 1. 객체 생성(생성과 동시에 고유번호 제공)
								// 2. 객체 소면(고유번호 미저장 시 이 지점에서 소멸됨)
		
		
//		3. 레퍼런스 변수
		
//		3-1. 레퍼런스 변수 생성
//			- 객체의 고유번호를 저장할 수 있는 변수 공간
//			- 기본적으로, 지정된 클래스 종류에 대한 객체 고유번호만 저장 가능
		
		J02_People aa;
//		에러 : System.out.println("3-1. aa = " + aa);
		
		
//		3-2. 레퍼런스 변수 이용 - 지정된 객체의 고유번호를 저장
		aa = new J02_People();
		System.out.println("3-2. aa = " + aa);
		
		
//		3-3. 객체 생성과 레퍼런스 생성 및 저장 작업을 동시에 하는 경우
		J02_People bb = new J02_People();
		System.out.println("3-3. bb = " + bb);
		
		
//		3-4. 레퍼런스 선언 이후에 객체 번호를 저장하려는 경우
//				기본값으로 null을 저장함으로써 프로그램의 안정성을 높인다.
		J02_People cc = null;
		System.out.println("3-4. cc = " + cc);
		
		cc = new J02_People();
		System.out.println("3-4. cc = " + cc);
		
		
		
		
//		4. 생성된 객체를 이용한 정보 저장 및 호출
//			- 렐퍼런스 변수에 레퍼런스연산자(참조연산자)인 . 을 이용
//			- 렐퍼런스연산자를 이용하면 레퍼런스 변수가 언급하고 있는 객체를 이용할 수 있다.
//			- 값을 저장하지 않으면, 객체 안의 공간은 각 형태별로 저장된 기본값이 출력된다.
		
		J02_People dd = new J02_People();
		
		
		
		
//		4-1. 객체 고유번호 및 객체 빈공간에 저장된 기본값
		System.out.println("4-1. dd = " + dd);
		System.out.println("4-1. dd.name = " + dd.name);
		System.out.println("4-1. dd.age = " + dd.age);
		
		
//		4-2. 객체 빈공간에 정보 저장
		dd.name = "이순신";
		dd.age = 10;
		
		
//		4-3. 객체 빈공간에 저장된 정보 이용
		System.out.println("4-3. 이름 : " + dd.name + ", 나이 : " + dd.age);
		System.out.println("4-3. " + dd.name + "의 10년 후의 나이 : " + (dd.age + 10));
		
		
//		문제 : 다음 각 정보들을 관리하는 프로그램을 객체 지향 설계로 작성
//		1. 햄버거 정보 관리 프로그램
//			- 이름, 판매브랜드 이름, 주재료1, 주재료2, 가격, 칼로리
//			- 햄버거 정보 3개를 저장 후 출력
		
//		2. 게임 캐릭터 정보 관리 프로그램
//			- 이름, 게임 이름, 공격력, 방어력
//			- 캐릭터 정보 2개를 저장 후 출력
	}
}
