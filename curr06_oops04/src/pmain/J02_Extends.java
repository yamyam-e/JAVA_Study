package pmain;

import entity.J02_SubCla;

//	수업 내용
//	1. 상속 개념
//	2. 상속 키워드
//	3. 상속 관계의 생성자 호출 관계

public class J02_Extends {

//	상속 처리 적용대상 관계 조건 :
//	- "새로 만들려는 클래스 대상은 일종의 기존에 있던 클래스의 한 종류이다." 관계에 대하여 적용
//	- 예 : 사람-학생 / 자동차-트럭 / 운동선수-야구선수
	
//	상속 관계의 명칭
//	기본에 존재한는 클래스	-	새로 만든 클래스
//	수퍼클래스				-	서브클래스
//	상위클래스				-	하위클래스
//	부모클래스				-	자식클래스
	
	
	public static void main(String[] args) {
		
		J02_SubCla sub = new J02_SubCla();
		System.out.println("main메소드 : sub = " + sub);
	}
}
