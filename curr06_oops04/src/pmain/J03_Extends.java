package pmain;

import entity.J03_SubCla;

//	수업 내용
//	1. 생성자 초기화를 요구하는 SuperCla의 경우

public class J03_Extends {
	public static void main(String[] args) {
		
		J03_SubCla sub1 = new J03_SubCla();
		System.out.println(sub1.getSubData());
		
		J03_SubCla sub2 = new J03_SubCla("초기화", 20);
		System.out.println(sub2.getSubData());
	}
}	
