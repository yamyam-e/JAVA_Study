package pmain;

public class J12_ArrayCla_Rank {
	public static void main(String[] args) {
		
		
//		인사 정보 관리 프로그램
//		- 객체 배열
		
		J12_People[] peo = new J12_People[3];
		
		System.out.println("1. peo = " + peo);
		
		System.out.println("1. peo[0] = " + peo[0]);
//		=> 객체 안에 배열 구조를 형성하고 있는 레퍼런스의 값이 null인 상태
//		=> 원하는 정보를 저장할 수 있는 객체의 생성 필요
		
		
//		주의 :
//		peo[0].name = "둘리";
//		peo[0].age = 10;
//		System.out.println(peo[0].name + ", " + peo[0].age);
		
		
		peo[0] = new J12_People();
		peo[1] = new J12_People();
		peo[2] = new J12_People();
		
		System.out.println("2. peo[0] = " + peo[0]);
//		=> 배열 구조를 형성하고 있는 레퍼런스
		
		
		peo[0].name = "이순신";
		peo[0].age = 10;
		
		peo[1].name = "둘리";
		peo[1].age = 20;
		
		peo[2].name = "곽가";
		peo[2].age = 30;
		
		
		for(int i=0; i<peo.length; i++) {
			System.out.println("3. 이름 : " + peo[i].name + ", 나이 : " + peo[i].age);
		}
		
		
		
//		랭크 설정 : 나이에 대한 rank 저장하기
		for(int i=0; i<peo.length; i++) {
			peo[i].ageRank = 1;
		}
		
		for(int i=0; i<peo.length; i++) {
			for(int j=0; j<peo.length; j++) {
				
				if(peo[i].age < peo[j].age) {
					peo[i].ageRank++;
				}
			}
		}
		
		for(int i=0; i<peo.length; i++) {
			for(int j=0; j<peo.length; j++) {
				
				if(peo[j].ageRank == (i+1)) {
					System.out.println(
							(i+1) + "등 - 이름 : " + peo[j].name + ", 나이 : " + peo[j].age);
				}
			}
		}
	}
}
