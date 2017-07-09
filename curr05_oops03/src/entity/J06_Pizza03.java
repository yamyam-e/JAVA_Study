package entity;

public class J06_Pizza03 {

	String name;
	int time;
	
	public J06_Pizza03() {
		// TODO Auto-generated constructor stub
	}
	
	public J06_Pizza03(String name, int time) {
		// TODO Auto-generated constructor stub
		
		this.name = name;
		this.time = time;
	}

	public String getPizza() {
		return "이름 = " + name + ", 배달시간 : " + time;
	}
}
