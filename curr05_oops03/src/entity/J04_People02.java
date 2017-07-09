package entity;

public class J04_People02 {

	private String name;
	private int age;
	
	public String getInfo() {
		
		if(name != null) {
			return name + "(나이: " + age + ")의 통장 개설 완료";
		} else {
			return "통장이 개설되지 않았습니다.";
		}
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		
		if(age < 0) {
			System.out.println("부적절한 나이입니다.");
			name = null;
			return;
		}
		
		this.age = age;
	}
	
}
