package entity;

public class J03_SubCla extends J03_SuperCla {

	public J03_SubCla() {
		// TODO Auto-generated constructor stub
	
		super("수퍼클래스에 보내야 할 값", 10);
	}
	
	
//	참고 : 수퍼클래스에 전달할 값을 main에서 직접 입력하는 경우
	public J03_SubCla(String data1, int data2) {
		super(data1, data2);
	}
	
	public String getSubData() {
		return "Data1 = " + data1 + ", Data2 = " + data2;
	}
}
