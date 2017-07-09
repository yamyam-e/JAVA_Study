package pmain;

import entity.J01_MyClass;
import entity.J01_OldClass;

//	수업 내용
//	1. extends Class

public class J01_Extends_intro {
	public static void main(String[] args) {
		
//		#.1
//		요청 항목 : 이름, 나이, 키, 취미
//		존재하는 클래스의 항목 : 이름, 나이, 키
		
		
//		#.2 OldClass
		J01_OldClass old = new J01_OldClass();
		
		
//		#.3 MyClass
		J01_MyClass mycla = new J01_MyClass();
		mycla.setOld("둘리", 12, 12.34);
		mycla.setMyCla("둘리", 12, 12.34, "놀리");
		
		
		System.out.println(mycla.getOld());
		System.out.println(mycla.getMyCla());
		
	}
}
