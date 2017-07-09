package pmain;

import javax.swing.JOptionPane;

public class J04_People {

	String name;
	int age;
	int rank = 1;
	
	String setData() {
		name = JOptionPane.showInputDialog("이름 입력");
		age = Integer.parseInt(JOptionPane.showInputDialog("나이 입력"));
		
		return "정상적으로 저장되었습니다.";
	}
	
	String getData() {
		return name + "\t" + age;
	}
	
	String getAgeRank() {
		return name + "\t" + age + "\t" + rank;
	}
}
