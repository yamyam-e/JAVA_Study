package entity;

public class J06_Pizza01 {
	
	String name;
	int time;
	
	public J06_Pizza01() {
		// TODO Auto-generated constructor stub
		
		System.out.println("클래스에 숨겨진 기본생성자 작동");
	}
//	=> 생성자 :
//		1. 작성된 클래스 내부에 숨겨진 특별한 형식의 메소드
//		2. 위와 같이 매개변수를 가지지 않는 형태가 기본형이며,
//			이를 "기본생성자", "디폴트생성자"라고 한다.
//		3. 객체가 생성되는 시점에 무조건 호출되어 작동한다.
//		4. 객체 생성 시점 이후로 호출하는 것은 불가능하다.
//		5. private이 선언되면 외부에서 호출이 불가능하므로, 객체를 생성할 수 없는 클래스로 정의된다.
//		6. 매개변수를 추가하는 작업으로 재정의 되면 기본생성자가 소멸되는 것으로 간주되며
//			객체 생성을 위해서는 생성자가 요구하는 매개변수 인자를 반드시 입력해야 한다.
//		7. 오버로딩을 통해서 객체 생성 방법을 다양화할 수 있다.
//		8. 생성자는 this() 형식을 통해 서로를 호출할 수 있으며, 이 때 객체 생성 작업은 1회만 진행된다.
	
	public void setPizza(String name, int time) {
		this.name = name;
		this.time = time;
	}
	
	public String getPizza() {
		return "이름 = " + name + ", 배달시간 : " + time;
	}

}
