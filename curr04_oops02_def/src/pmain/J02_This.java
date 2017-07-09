package pmain;

//	수업 내용
//	1. 클래스의 This

public class J02_This {
	public static void main(String[] args) {
		
		
//		1.
		J02_Car car1 = new J02_Car();
		car1.setCar01("슈퍼카", 100);
		System.out.println("1. : " + car1.getCar());
		
		
//		2.
		J02_Car car2 = new J02_Car();
		car2.setCar02("그냥차", 200);
		System.out.println("2. : " + car2.getCar());
		
		
//		3.
		J02_Car car3 = new J02_Car();
		car3.setCar03("고물차", 300);
		System.out.println("3. : " + car3.getCar());
		
		System.out.println("3. car3 = " + car3);
	}
}
