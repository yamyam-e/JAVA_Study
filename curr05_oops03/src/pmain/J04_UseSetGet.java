package pmain;

import entity.J04_People01;
import entity.J04_People02;

//	수업 내용
//	1. 직접 접근의 위험성
//	2. setter/getter

public class J04_UseSetGet {
	public static void main(String[] args) {
		
		
//		1. public 접근 객체 이용
		J04_People01 acc01 = new J04_People01();
		acc01.name = "도우너";
		acc01.age = -10;
		System.out.println(acc01.getInfo());
		
		
		
//		2. 은닉화(setter/getter) 객체 이용
		J04_People02 acc02 = new J04_People02();
		acc02.setName("둘리");
		acc02.setAge(-10);
		System.out.println(acc02.getInfo());
	}
}
