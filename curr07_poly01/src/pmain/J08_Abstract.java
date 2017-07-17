package pmain;

import entity.J08_SubCla;
import entity.J08_SuperCla;

//	수업 내용
//	1. abstract 메소드와 클래스

public class J08_Abstract {

//	abstract
//	1. 추상화 처리 키워드
//	2. 구체화 작업을 강요함
	
//	참고 :
//		- 추상화 : 클래스 간 공통점에 대하여 공통성을 가진 윤곽을 만드는 작업
//		- 구체화 : 상속과 오버라이드를 통해 추ㅏㅇ화된 윤곽을 직접 구현하는 작업
	
	public static void main(String[] args) {
		
		
//		다형성 기능을 목적으로 하는 abstract 클래스의 이용
		
//		1. 상속받아 abstract 기능을 구체화한 클래스 객체 이용
		
		J08_SuperCla sup01 = new J08_SubCla();
		sup01.absOverMth();
		
		System.out.println("==========================================");
		
		
//		2. abstract 내용을 즉석에서 구체화하는 이름 없는 클래스 객체 이용 => "익명클래스"
		
		J08_SuperCla sup02 = new J08_SuperCla() {
			
			@Override
			public void absOverMth() {
				System.out.println("즉석에서 구체화하기");
			}
		};
		
		sup02.absOverMth();
	}
}
