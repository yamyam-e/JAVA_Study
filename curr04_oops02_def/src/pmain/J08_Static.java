package pmain;

//	수업 내용
//	1. static 멤버와 instance 멤버
//	2. static 멤버의 생성 시기
//	3. static 멤버와 instance 멤버 간 호출 가능 여부

public class J08_Static {

//	static의 이용
	
	public static void main(String[] args) {
		
//		1. 객체 없이 클래스로 이용
		
//		1-1. 클래스(static) 멤버 : 이용 가능
		System.out.println("1-1");
		System.out.println(J08_StCla.smsg);
		J08_StCla.smth();
		
//		1-2. 인스턴스(instance) 멤버 : 이용 불가능
//		System.out.println(J08_StCla.imsg);
//		J08_StCla.imth();
		
		
//		2. 객체로 이용
		J08_StCla stc = new J08_StCla();
		
//		2-1. 클래스 멤버 : 이용 가능
		System.out.println("2-1");
		System.out.println(stc.smsg);
		stc.smth();
		
//		2-2. 인스턴스 멤버 : 이용 가능
		System.out.println("2-2");
		System.out.println(stc.imsg);
		stc.imth();
		
		
		
//		3. 값 공유 특성
		
//		3-1. 객체1 생성 및 확인
		J08_StCla stc1 = new J08_StCla();
		System.out.println("3-1. stc1 : " + stc1.smsg);
		
//		3-2. 객체1 값 변경 후 확인
		stc1.smsg = "객체1이 변경한 멤버 변수";
		System.out.println("3-2. stc1 : " + stc1.smsg);
		
//		3-3. 객체2 생성 및 확인
		J08_StCla stc2 = new J08_StCla();
		System.out.println("3-3. stc2 : " + stc2.smsg);
		
//		3-4. 객체2 값 변경 후 확인
		stc2.smsg = "객체2가 변경한 멤버 변수";
		System.out.println("3-4. stc2 : " + stc2.smsg);
	}
}
