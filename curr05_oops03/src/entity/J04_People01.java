package entity;

public class J04_People01 {
	
	public String name;
	public int age;
	
	public String getInfo() {
		
		if(name != null) {
			return name + "(나이: " + age + ")의 통장 개설 완료";
		} else {
			return "통장이 개설되지 않았습니다.";
		}
	}
}
