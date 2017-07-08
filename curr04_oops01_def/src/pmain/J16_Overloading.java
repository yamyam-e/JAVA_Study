package pmain;

public class J16_Overloading {

//	메소드 오버로딩
//	- 이름 및 매개변수를 기준으로 메소드의 구분이 이루어짐
//	- 이름이 같은 메소드를 여러개 생성할 수 있음
//	- 여러 상황에서 한가지 목적으로 사용하려는 메소드에 적용
	
//	오버로딩 조건
//	1. 매개변수의 유무
//	2. 매개변수의 갯수 차이
//	3. 매개변수 타입의 순서 차이
	
//	주의 - 오버로딩과 리턴과는 아무런 관련이 없음
	
	public static void main(String[] args) {
		
		abc();
		abc(1);
		abc(1, 2);
		abc(1, 2.2);
		abc(1.1, 2);
	}
	
	public static void abc() {
		System.out.println("1. abc() 메소드");
	}
	
	public static void abc(int a) {
		System.out.println("2. abc(int a) 메소드");
	}
	
	public static void abc(int a, int b) {
		System.out.println("3. abc(int a, int b) 메소드");
	}
	
	public static void abc(int a, double b) {
		System.out.println("4. abc(int a, double b) 메소드");
	}
	
	public static void abc(double a, int b) {
		System.out.println("5. abc(double a, int a) 메소드");
	}
}
