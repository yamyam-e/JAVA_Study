package pmain;

import entity.J01_ImpCla;
import entity.J01_Inter;

//	수업 내용
//	1. 인터페이스 생성
//	2. .java 확인
//	3. 멤버 특성

public class J01_Interface {
	
//	인터페이스
//	- 다형성 설계에 특성화 된 처리 단위
//	- 추상화된 내용에 대해서 구체화 작업이 이루어진 클래스를 이용하게 됨
	
	public static void main(String[] args) {
		
//		다형성을 위한 인터페이스의 이용
		
		
//		1. 구현(implements) 클래스의 이용
		
		J01_Inter inter01 = null;
		J01_ImpCla iCla01 = new J01_ImpCla();
		
		inter01 = iCla01;
		inter01.overMth01();
		inter01.overMth02();
//		iCla01.overMth01();
//		iCla01.overMth01();
		
		System.out.println("==================================");
		
		
//		2. 즉석에서 생성해서 구현하는 이름없는 클래스(익명클래스)의 이용
		
		J01_Inter inter02 = new J01_Inter() {
			
			@Override
			public void overMth02() {
				System.out.println("익명클래스의 구현메소드01");
			}
			
			@Override
			public void overMth01() {
				System.out.println("익명클래스의 구현메소드02");
			}
		};
		
		inter02.overMth01();
		inter02.overMth02();
		
	}
}
