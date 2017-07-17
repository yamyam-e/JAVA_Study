package pmain;

import entity.J04_SubClaAAA;
import entity.J04_SubClaBBB;
import entity.J04_SubClaCCC;
import entity.J04_SuperCla;

//	수업 내용
//	1. 서로 다른 클래스 타입으 배열화

public class J04_Polymorphism02 {
	public static void main(String[] args) {
		
		
		J04_SuperCla[] sup = new J04_SuperCla[3];
		
		sup[0] = new J04_SubClaAAA();
		sup[1] = new J04_SubClaBBB();
		sup[2] = new J04_SubClaCCC();
		
		sup[0].overMth();
		sup[1].overMth();
		sup[2].overMth();
		
		System.out.println("===================================");
		
		for(int i=0; i<sup.length; i++) {
			sup[i].overMth();
		}
	}
}
