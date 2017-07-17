package entity;

public interface J04_FameSource {

//	1. 이용 정보 대상명을 리턴하세요.(예: 음식정보 => 음식 / 국가정보 => 국가)
	public String retInfoName();
	
//	2. 정보 저장 메소드를 작성하세요.
	public void setInfo();
	
//	3. 정보 제공 메소드를 작성하세요.
	public String getInfo();
}
