package pmain;

import entity.J01_ACla;
import entity.J01_BCla;
import entity.J01_SubCla;
import entity.J01_SuperCla;

//	수업 내용
//	1. 클래스에 대한 레퍼런스 형변환

public class J01_Casting {
	public static void main(String[] args) {
		
//		1. 일반타입 변수 형변환(Cast연산자)
		double d = 12.34;
		System.out.println("1. d = " + d);
		
		float f;
		
//		에러 : f = d;
		f = (float)d;
		System.out.println("1. f = " + f);
		
		
//		2. 객체에 대한 레퍼런스 변수 간 형변환
		J01_ACla ac = new J01_ACla();
		System.out.println("2. ac = " + ac);
		
		J01_BCla bc;
		
//		에러 : bc = ac;
//		에러 : bc = (J01_BCla)ac;
		
		
		
//		3. 상속 관계 클래스의 객체에 대한 레퍼런스 간 형변환
		
//		3-1. 수퍼클래스 객체 생성 : 수퍼클래스 레퍼런스 => 서브클래스 레퍼런스 : 불가능
		
		J01_SuperCla sup31 = new J01_SuperCla();
		J01_SubCla sub31;
		
//		에러 : sub31 = sup31;
//		에러 : sub31 = (J01_SubCla)sup31;
//		=> 실행 시 예외 발생
		
		
//		3-2. 서브클래스 객체 생성 : 서브클래스 레퍼런스 => 수퍼클래스 레퍼런스 : 가능
		J01_SubCla sub32 = new J01_SubCla();
		J01_SuperCla sup32;
		
		sup32 = sub32;
		sup32 = (J01_SuperCla)sub32;
	}
}
