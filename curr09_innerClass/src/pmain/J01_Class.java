package pmain;

public class J01_Class {

	String outInData = "J01_Class 인스턴스 멤버 메시지";
	static String outStData = "J01_Class Static 멤버 메시지";
	
	
//	1. 멤버 이너클래스
//		- 인스턴스 멤버 변수와 같이 외부 클래스로 인스턴스 생성 후에만 객체 생성이 가능한 클래스
	class mCla {
		
		public String mData = "멤버 이너클래스 메시지";
		
		public void mMth() {
			System.out.println("멤버 이너클래스 메소드");
		}
	}
	
	
//	2. static 멤버 이너클래스
//		- static 멤버 변수와 같이 외부 클래스보다 먼저 존재하기 때문에
//			외부 클래스의 인스턴스 없이도 객체 생성이 가능
//		- 외부클래스에 대하여 static 멤버에 대해서만 접근 가능
	static class stCla {
		
		public String stClaInData = "static 멤버 이너클래스 인스턴스 메시지";
		public static String stClaStDat = "static 멤버 이너클래스 static 메시지";
		
		public void stClaInMth() {
			System.out.println("static 멤버 이너클래스 인스턴스 메소드");
		}
		
		public static void stClaStMth() {
			System.out.println("static 멤버 이너클래스 static 메소드");
		}
	}
	
	
//	3. local(지역) 이너클래스
//		- 인스턴스 멤버 변수와 같이 메소드 종료 시 소멸되는 객체를 가진다.
	public void mth() {
		
		class LoCla {
			String mthLoData = "local 이너클래스 메시지";
		}
		
		LoCla lc = new LoCla();
		System.out.println(lc.mthLoData);
	}
}
