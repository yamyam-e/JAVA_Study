package entity;

import entity.other.J07_OtherSuperCla;

public class J07_OtherSubCla extends J07_OtherSuperCla {

	public void access() {
		
//		에러 : System.out.println("priMsg = " + privMsg);
//		에러 : System.out.println("defMsg = " + defMsg);
		System.out.println("protMsg = " + protMsg);
		System.out.println("pubMsg = " + pubMsg);
//		=> 같은 패키지에 위치한 클래스를 상속하므로, protected, public 만 접근 가능
	}
}
