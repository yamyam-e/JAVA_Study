package pmain;

import entity.J06_Pizza01;
import entity.J06_Pizza02;
import entity.J06_Pizza03;
import entity.J06_Pizza04;

//	수업 내용
//	1. 생성자의 활용
//	2. 기본생성자
//	3. 생성자 재정의와 객체 생성
//	4. 생성자 오버로딩

public class J06_Constructor {
	public static void main(String[] args) {
		
		
//		1. 객체 선언 및 초기화
		J06_Pizza01 pz01 = new J06_Pizza01();
		pz01.setPizza("피자헛", 20);
		
		
//		2. 일반 변수 선언 및 초기화
		int a = 10;
		
		
//		3. 객체 선언과 초기화 동시 진행
		J06_Pizza02 pz02 = new J06_Pizza02("미스터피자", 15);
		
		
//		4. 생성자가 재정의된 클래스의 객체 생성 방법
//		에러 :
//		J06_Pizza02 pz022 = new J06_Pizza02();
//		=> 기본생성자가 없으므로 불가능
		
		
//		5. 생성자 오보로딩 이용
		J06_Pizza03 pz03 = new J06_Pizza03();
		J06_Pizza03 pz033 = new J06_Pizza03("도미노피자", 25);
		
		
//		6. 생성자 간 호출
		System.out.println("6. -------");
		J06_Pizza04 pz04 = new J06_Pizza04(10);
		
		System.out.println("6. -------");
		J06_Pizza04 pz044 = new J06_Pizza04(1.1);
		
	}
}
