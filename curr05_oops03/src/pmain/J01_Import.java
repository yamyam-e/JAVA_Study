package pmain;

import entity.J01_ModelCla;

//	수업 내용
//	1. 패키지 소개 && 생성 && 클래스 생성
//	2. import
//	3. public class와 class의 차이점 보여주기

public class J01_Import {
	
//	패키지
//	1. 클래스 묶음 단위
//	2. 같은 목적을 실현하는 클래스 및 인터페이스를 묶는다.
//	3. 패키지는 클래스의 경로로 인식되기 때문에,
//		서로 다른 패키지에는 같은 이름의 클래스가 존재할 수 있다.
//	4. 패키지를 명시하지 않은 클래스는 default 패키지로 설정된다.
//	5. 패키지에 속하는 클래스의 최상단에는 해당 패키지가 선언된다.
//	6. 패키지를 지정한 클래스의 전체 이름은 패키지의 경로가 추가된 이름이 되며 형식은 다음과 같다.
//		(형식 : 패키지명.패키지명......클래스명)
	
	public static void main(String[] args) {
		
//		에러 :
//		J01_ModelCla mc1 = new J01_ModelCla();
//		=> 다른 패키지에 존재하는 클래스에는 이용 불가능
		
		
//		다른 패키지의 클래스 이용 방법 1 : 클래스 전체 이름 명시
		entity.J01_ModelCla mc1 = new entity.J01_ModelCla();
		
		
//		다른 패키지의 클래스 이용 방법 2 : import를 통한 기본 경로 설정
		J01_ModelCla mc2 = new J01_ModelCla();
		
		
//		public class(ModelCla02)와 class(ModelCla03)의 차이점
//		에러 :
//		J01_ModelCla03 mc3 = new J01_ModelCla03();
//		=> public의 의미?
	}
}
