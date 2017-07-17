package pmain;

import entity.J07_Coffee;
import entity.J07_DrinkInfo;
import entity.J07_Milk;

public class J07_ParaPoly {
	public static void main(String[] args) {
		
//		다형성과 표준화의 편리성
		
		J07_Milk mm = new J07_Milk();
		J07_Coffee tt = new J07_Coffee();
		
//		1. 각각의 방법 이용하는 경우
		System.out.println("mm : " + mm.getName() + ", " + mm.getPrice());
		System.out.println("tt : " + tt.getName() + ", " + tt.getPrice());
		
//		2. 표준화 방법 이용하는 경우
		showAnything(mm);
		showAnything(tt);
	}

	private static void showAnything(J07_DrinkInfo para) {
		System.out.println("정보 : 이름 = " + para.getName() + ", 가격 = " + para.getPrice());
	}
}
