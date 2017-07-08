package pmain;

//	수업 내용
//	1. 가변 배열

public class J10_ArrayExp {
	public static void main(String[] args) {
		
//		가변 배열
//			- 각 행에 대한 열의 갯수가 이후에 결정되는 배열
//			- 각 행에 대한 열 갯수가 다를 수 있다.
		
		
		
		int[][] in = new int[4][];
		
		in[0] = new int[3];
		in[1] = new int[2];
		in[2] = new int[4];
		in[3] = new int[1];
		
//				in[][0]	in[][1]	in[][2]	in[][2]
//		in[0]	{	*,		*,	   *  }
//		in[1]	{	*,		* }
//		in[2]	{	*,		*,	   *,      *  }
//		in[3]	{	*  }
		
		
		
		int[][] in2 = new int[][]
				{
					{10, 11, 12},
					{20, 21},
					{30, 31, 32, 33},
					{40}
				};
				
				
		for(int i=0; i<in2.length; i++) {
			System.out.println("i = " + i);
			
			for(int j=0; j<in2[i].length; j++) {
				System.out.println("\t j = " + j);
				
				System.out.println("\t\t " + in2[i][j]);
			}
		}
	}
}
