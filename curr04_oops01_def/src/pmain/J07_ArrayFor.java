package pmain;

//	수업 내용
//	1. 기본 타입 배열에 대한 for문 활용
//	2. 확장 for문

//	문제
//	1. 배열에 대한 for문의 이용

public class J07_ArrayFor {
	public static void main(String[] args) {
		
		String[] s = {"1. 가나", "2. 나다", "3. 다라", "4. 마바"};
		
		int i;
		
		i = 0;
			System.out.println("1. s[0] = " + s[i]);
		i = 1;
			System.out.println("1. s[1] = " + s[i]);
		i = 2;
			System.out.println("1. s[2] = " + s[i]);
		i = 3;
			System.out.println("1. s[3] = " + s[i]);
			
			
		for(int k=0; k<=3; k++) {
			System.out.println("2. for : " + s[k]);
		}
		
		
//		.length : 배열의 저장 공간 갯수 제공
		int n = s.length;
		System.out.println("2. s 배열의 갯수 : n = " + n);
		
		for(int k=0; k<s.length; k++) {
			System.out.println("3. for : " + s[k]);
		}
		
		
		
//		4. 확장 for (for-each) :
//			- 갯수 지정이 필요 없음
//			- 같은 자료형에 대한 값을 순차적으로 하나씩 꺼내어 제공
		for(String each : s) {
			System.out.println("4. for-each : " + each);
		}
		
		
		
//		문제 : 다음 형태에 대한 배열을 Jop과 for문을 이용하여 입력하세요.
//		1. int - 2개	
//		2. double - 4개
//		3. String - 3개
		
//		문제 : 다음 배열의 값을 Jop과 for문을 이용하여 출력하세요.
//		1. int - 2개	
//		2. double - 4개
//		3. String - 3개
	}
}
