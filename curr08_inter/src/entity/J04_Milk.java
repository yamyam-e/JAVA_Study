package entity;

public class J04_Milk implements J04_FameSource {

	String name;
	int price;
	
	@Override
	public String retInfoName() {
		return "우유";
	}
	
	@Override
	public void setInfo() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String getInfo() {
		return "[이름 : " + name + ", 가격 : " + price + "]";
	}
}
