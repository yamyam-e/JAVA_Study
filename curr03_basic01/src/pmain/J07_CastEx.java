package pmain;

//	수업 내용
//	1. 평균구하기
//	2. Math.random()


public class J07_CastEx {
	public static void main(String[] args) {
		
		
//		1. 평균구하기
		int kor = 99;
		int eng = 89;
		int math = 78;
		int sum = kor + eng + math;
		System.out.println("sum = " + sum);
		
		double avg = sum / 3;
		System.out.println("avg = " + avg);
		
		avg = sum / (double)3;
		System.out.println("avg = " + avg);
		
		
//		2. 난수(랜덤값-임의의 수) 추출하기
//		- 형식 : Math.random()
//		- 0.0이상 ~ 1.0 미만의 값
//		- 제공 형태 : double형
		
		
		double mr = Math.random();
		System.out.println("mr : " + mr);
		
		
//		정수 랜덤값이 필요한 경우
		int mr2 = (int)Math.random();
		
		
		
//		10보다 작은 정수가 필요한 경우 : 0 ~ 9
		int mr3 = (int)(Math.random()*10);
		
		
//		1 ~ 10의 정수가 필요한 경우
		int mr4 = (int)(Math.random()*10 + 1);
	}
}
