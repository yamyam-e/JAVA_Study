package pmain;

//	수업 내용
//	1. 기본 타입 2차원 배열
//	2. for문 이용

public class J09_Array2D {
	public static void main(String[] args) {
		
		
//		2차원 배열
//		- 여러개의 값을 행과 열의 논리적 역할로 구분한 구조
//		- 행과 열의 인덱스는 0부터 시작
		
		
		int[][] in = new int[2][3];
		
//				in[][0]	in[][1]	in[][2]
//		in[0][]	{	*,		*,	  *	  }
//		in[1][]	{	*,		*,	  *	  }
		
		in[0][0] = 10; 
		in[0][1] = 11;
		in[0][2] = 12;
		
		in[1][0] = 20;
		in[1][1] = 21;
		in[1][2] = 22;
		
		
//				in[][0]	in[][1]	in[][2]
//		in[0][]	{	10,		11,	  12  }
//		in[1][]	{	20,		21,	  22  }
		
		
		
		
		int m;
		int n;
		
		m = 0;
			n = 0;
				System.out.println(in[m][n]);
			n = 1;
				System.out.println(in[m][n]);
			n = 2;
				System.out.println(in[m][n]);
				
		m = 1;
			n = 0;
				System.out.println(in[m][n]);
			n = 1;
				System.out.println(in[m][n]);
			n = 2;
				System.out.println(in[m][n]);
				
				
		
//		행의 갯수 : 배열.length
		int q = in.length;
		System.out.println("in배열 행의 갯수 : q = " + q);
		
//		열의 갯수 : 배열[행].length
		int w = in[0].length;
		System.out.println("in배열 열의 갯수 : w = " + w);
		
		
		for(int p=0; p<in.length; p++) {
			System.out.println("p = " + p);
			
			for(int k=0; k<in[p].length; k++) {
				
				System.out.println("\t k = " + k);
				
				System.out.println("\t\t " + in[p][k]);
			}
		}
		
		
//		배열 선언과 초기화를 동시에 하는 경우
		int[][] in2 = new int[][] {
			{10, 20, 30},
			{100, 200, 300}
		};
		
		
		int[][] in3 = 
			{
				{10, 20, 30},
				{100, 200, 300}	
			};
	}
}
