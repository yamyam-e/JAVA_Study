package entity;

public class J01_MyClass extends J01_OldClass {

	private String hobby;
	
	public void setMyCla(String name, int age, double height, String hobby) {
		setOld(name, age, height);
		this.hobby = hobby;
	}
	
	public String getMyCla() {
		return getOld() + ", 취미 : " + hobby;
	}
}
