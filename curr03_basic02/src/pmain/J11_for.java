package pmain;

//	수업 내용
//	1. for : 초기식, 조건식, 증감식
//	2. 참고 : 중괄호 의미 및 생략 가능 상황

public class J11_for {
	public static void main(String[] args) {
		
//		for
//		- 초기식, 조건식, 증감식을 통해 반복 및 정지를 설정
		
//		예제 1 : 1 ~ 10의 범위에 있는 모든 정수 출력
		for(int s1=1; s1<10; s1++) {
			System.out.println("s1 : 현재 s1 변수의 값 = " + s1);
		}
		
		
//		예제 2 : "안녕"을 5번 출력
		for(int s2=1; s2<5; s2++) {
			System.out.println("s2 : 안녕 (현재 s2 = " + s2 + ")");
		}
		
		
//		예제 3 : 1 ~ 20 범위에 존재하는 모든 정수들의 합
		int sum = 0;
		
		for(int s3=1; s3<=20; s3++) {
			sum += s3;
		}
		System.out.println("s3 : 1 ~ 20 범위 정수 총 합 sum = " + sum);
		
//		참고 : 중괄호 의미 및 생략 가능 상황
	}
}
