package pmain;

public class J01_InnerCla {
	
//	이너클래스
//	1. 클래스 안에 존재하는 클래스
//	2. 정의되는 위치에 따라 다음과 같이 구분
//		1. 멤버 이너 클래스 : 멤버필드 위치에 정의된 클래스
//		2. static 이너 클래스 : 맴버 필드 위치에 정의된 static 키워드 클래스
//		3. local 이너 클래스 : 메소드 내부에 정의된 클래스
//		4. 익명(Anonymous) 클래스 : 이름이 없는 클래스
	
	public static void main(String[] args) {
		
//		1. 멤버 이너 클래스
		J01_Class.mCla mc = new J01_Class().new mCla();
		System.out.println("1. mc : " + mc.mData);
		mc.mMth();
		
		
//		2. static 멤버 이너클래스
		
//		2-1. 클래스 호출
		System.out.println("2-1. " + J01_Class.stCla.stClaStDat);
		J01_Class.stCla.stClaStMth();
		
//		2-2. 객체 호출
		J01_Class.stCla stc = new J01_Class.stCla();
		System.out.println("2-2. stc02 : " + stc.stClaInData);
		stc.stClaInMth();
		
		
//		3. local 이너클래스
		
		
//		4. 1회성 클래스
		J01_Inter ab = new J01_Inter() {
			
			@Override
			public void works() {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
