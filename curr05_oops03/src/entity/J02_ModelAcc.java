package entity;

public class J02_ModelAcc {
	
	private String primsg = "다른 패키지 private 메시지";
	String defmsg = "다른 패키지 default 메시지";
	protected String protmsg = "다른 패키지 protected 메시지";
	public String pubmsg = "다른 패키지 public 메시지";
	
	private void primth() {
		System.out.println("다른 패키지 private 메소드");
	}
	
	void defmth() {
		System.out.println("다른 패키지 default 메소드");
	}
	
	protected void protmth() {
		System.out.println("다른 패키지 protected 메소드");
	}
	
	public void pubmth() {
		System.out.println("다른 패키지 public 메소드");
	}

}
