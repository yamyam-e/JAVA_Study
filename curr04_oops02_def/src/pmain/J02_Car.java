package pmain;

public class J02_Car {
	
	String name;
	int price;
	
	void setCar01(String n, int p) {
		name = n;
		price = p;
	}
	
	void setCar02(String name, int price) {
		name = name;
		price = price;
	}
	
	void setCar03(String name, int price) {
		this.name = name;
		this.price = price;
		System.out.println(">> setCar03 메소드 : this = " + this);
	}
//	=> 클래스 내부의 메소드 및 생성자에서 숨겨진 상태로 동일하게 존재
	
	
	String getCar() {
		return "이름 = " + name + ", 가격 = " + price;
	}
}
