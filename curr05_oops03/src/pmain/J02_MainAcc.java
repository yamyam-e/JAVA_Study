package pmain;

public class J02_MainAcc {
	
	private String primsg = "같은 패키지 private 메시지";
	String defmsg = "같은 패키지 default 메시지";
	protected String protmsg = "같은 패키지 protected 메시지";
	public String pubmsg = "같은 패키지 public 메시지";
	
	private void primth() {
		System.out.println("같은 패키지 private 메소드");
	}
	
	void defmth() {
		System.out.println("같은 패키지 default 메소드");
	}
	
	protected void protmth() {
		System.out.println("같은 패키지 protected 메소드");
	}
	
	public void pubmth() {
		System.out.println("같은 패키지 public 메소드");
	}

}
