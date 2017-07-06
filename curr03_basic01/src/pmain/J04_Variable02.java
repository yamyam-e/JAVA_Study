package pmain;

//	수업 내용
//	1. 영역(body and Scope)
//	2. 지역변수
//	3. Stack과 main()메소드 (그림 설명)

public class J04_Variable02 {	// 1번 시작 - J04_Variable 영역 시작
	
	String insMember = "하나둘셋";
	
	public static void main(String[] args) {		// 2번 시작 - main 영역 시작
		
		int a = 10;
		System.out.println("2번 영역 : a = " + a);
		
		{	// 3번 시작 - 이름 없는 영역 시작
			System.out.println("3번 이름없는 영역 : a = " + a);
			
			int b = 100;
			System.out.println("3번 이름없는 영역 : b = " + b);
		}	// 3번 끝 - 이름 없는 영역 끝
		
		System.out.println("2번 영역 : a = " + a);
		
//		에러 :
//		System.out.println("2번 영역 : b = " + b);
		
	}	// 2번 끝 - main 영역 끝

}	// 3번 끝 - J04_Variable02 영역 끝
