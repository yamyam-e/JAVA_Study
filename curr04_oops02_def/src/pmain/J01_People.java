package pmain;

public class J01_People {

	String name;
	int age;
	
	void setData(String n, int a) {
		name = n;
		age = a;
	}
	
	void showData() {
		System.out.println("[인사 정보 show] 이름 : " + name + ", 나이 : " + age);
	}
	
	String getData() {
		return "[인사 정보 get] 이름 : " + name + ", 나이 : " + age;
	}
}
