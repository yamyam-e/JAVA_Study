package pmain;

public class J01_MemberMethod {
	public static void main(String[] args) {
		
		J01_People peo1 = new J01_People();
		peo1.setData("길동이", 12);
		peo1.showData();
		System.out.println(peo1.getData());
		
		
		J01_People peo2 = new J01_People();
		peo2.setData("둘리", 23);
		peo2.showData();
		System.out.println(peo2.getData());
	}
}
