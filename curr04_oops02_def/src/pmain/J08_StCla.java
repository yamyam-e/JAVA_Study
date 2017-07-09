package pmain;

public class J08_StCla {

	String imsg = "인스턴스 멤버 변수";
	
	static String smsg = "클래스(static) 멤버 변수";
	
	
	void imth() {
		System.out.println("인스턴스 멤버 메소드");
		System.out.println("imth()에서 출력 : smsg = " + smsg);
	}
	
	static void smth() {
		System.out.println("클래스(static) 멤버 메소드");
		
//		에러 :
//		System.out.println("imsg = " + imsg);
//		=> 사용 불가능
	}
}
