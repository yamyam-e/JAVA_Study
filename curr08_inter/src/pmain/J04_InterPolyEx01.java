package pmain;

import entity.J04_FrameWork;
import entity.J04_Milk;

public class J04_InterPolyEx01 {
	public static void main(String[] args) {
		
//		1. 프레임워크 프로그램
//			1. 3가지 메뉴(입력/출력/종료) 기능을 가지는 프레임워크를 생성
//			2. 프레임워크 사용자는 제공된 인터페이스를 구현한 후, 추상메소드를 작성하는 작업만 수행
		
//		2. 인사 정보 프로그램 및 우유 정보 프로그램으로 테스트
		
		new J04_FrameWork(new J04_Milk()).start();
	}
}
