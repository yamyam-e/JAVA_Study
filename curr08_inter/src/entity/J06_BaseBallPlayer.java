package entity;

import javax.swing.JOptionPane;

public class J06_BaseBallPlayer implements J06_FrameSource {
	private String name;
	private String team;
	private int age;
	private int pay;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	@Override
	public J06_FrameSource getInstance() {
		// TODO Auto-generated method stub
		return new J06_BaseBallPlayer();
	}
	@Override
	public String getMenu() {
		// TODO Auto-generated method stub
		return "1. 야구 선수 정보 입력 \n"
				+ "2. 야구 선수 정보 출력 \n"
				+ "3. 로그아웃";
	}
	@Override
	public String getRankMenu() {
		// TODO Auto-generated method stub
		return "연봉";
	}
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "이름\t팀이름\t나이\t연봉\n";
	}
	@Override
	public void setData() {
		// TODO Auto-generated method stub
		setName(JOptionPane.showInputDialog("선수이름입력"));
		setTeam(JOptionPane.showInputDialog("팀 이름입력"));
		setPay(Integer.parseInt(JOptionPane.showInputDialog("연봉입력")));
		setAge(Integer.parseInt(JOptionPane.showInputDialog("나이입력")));
	}
	@Override
	public String getData() {
		// TODO Auto-generated method stub
		return getName() + "\t" + getTeam() + "\t" + getAge() + "세\t" + getPay() + "원\t";
	}
	@Override
	public int getRank() {
		// TODO Auto-generated method stub
		return getPay();
	}
	
}
