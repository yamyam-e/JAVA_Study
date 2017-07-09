package pmain;

import entity.J03_ModelCla;

//	수업 내용
//	1. private 멤버변수와 setter/getter

public class J03_SetGet {
	
//	setter/getter 메소드
//	- 접근이 제한된 멤버 변수에 대해서는 public 상태 setter/getter 메소드를 통해 접근한다.
//	- setter/getter 메소드는 추가기능을 실현할 수 있다는 데 의미가 있음
	
//	setter 메소드
//	- 멤버 변수에 값을 저장 또는 수정할 때 사용되는 메소드
//	- 기본형식 :
//		public void set멤버변수이름(자료형 매개변수이름) {
//			멤버변수 = 매개변수;
//		}
	
//	getter 메소드
//	- 멤버 변수의 값을 제공(return)할 때 사용되는 메소드
//	- 기본형식 :
//		public 리턴자료형 get멤버변수이름() {
//			return 멤버변수;	
//		}
	
	
	public static void main(String[] args) {
		
		J03_ModelCla mc = new J03_ModelCla();
		
//		에러 : mc.msg = "가나다";
		mc.setMsg("가나다");
		
		
//		에러 : System.out.println(ms.msg);
		System.out.println(mc.getMsg());
		
	}
}
