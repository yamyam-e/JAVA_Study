package pmain;

public class J12_forDual {
	public static void main(String[] args) {
		
		for(int i=0; i<4; i++) {
			System.out.println("i = " + i);
			
			for(int j=0; j<3; j++) {
				System.out.println("\t j = " + j);
			}
			System.out.println("---------------------");
		}
		System.out.println("====================================\n\n\n");
		
		
		
		for(int i=0; i<4; i++) {
			System.out.println("i = " + i);
			
			for(int j=0; j<3; j++) {
				System.out.println("\t j = " + j);
			}
			System.out.println();
			System.out.println("---------------------");
		}
		System.out.println("====================================\n\n\n");
		
		
		
		for(int i=1; i<13; i++) {
			System.out.println(i);
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			
			for(int j=1; j<31; j++) {
				System.out.print(j + "\t");
				
				if(j%7==0) {
					System.out.println();
				}
			}
			System.out.println();
			System.out.println("---------------------");
		}
		System.out.println("====================================\n\n\n");
		
	}
}
