package entity;

public class J01_OldClass {
	
//	public 적용 후 private 변환
	private String name;
	private int age;
	private double height;
	
	public void setOld(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public String getOld() {
		return "이름 : " + name + ", 나이 : " + age + ", 키 : " + height;
	}
}
