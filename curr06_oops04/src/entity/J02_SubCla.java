package entity;

public class J02_SubCla extends J02_SuperCla {

	public J02_SubCla() {
		// TODO Auto-generated constructor stub
	
		super();
		System.out.println("서브클래스 생성자 호출 : this = " + this);
	}
	
	public String subMsg = "서브클래스 메시지";
	
	public void subMth() {
		System.out.println("서브클래스 메소드");
	}
}
