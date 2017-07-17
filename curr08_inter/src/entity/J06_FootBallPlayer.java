package entity;

import javax.swing.JOptionPane;

public class J06_FootBallPlayer implements J06_FrameSource {

	private String name;
	private String team;
	private int goal;
	private int record;
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
	public int getGoal() {
		return goal;
	}
	public void setGoal(int goal) {
		this.goal = goal;
	}
	public int getRecord() {
		return record;
	}
	public void setRecord(int record) {
		this.record = record;
	}
	@Override
	public J06_FrameSource getInstance() {
		// TODO Auto-generated method stub
		return new J06_FootBallPlayer();
	}
	@Override
	public String getMenu() {
		// TODO Auto-generated method stub
		return "1. 축구 선수 정보 입력 \n"
				+ "2. 축구 선수 정보 출력 \n"
				+ "3. 로그아웃";
	}
	@Override
	public String getRankMenu() {
		// TODO Auto-generated method stub
		return "골득점";
	}
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "이름\t팀이름\t골득점\t육상기록\n";
	}
	@Override
	public void setData() {
		// TODO Auto-generated method stub
		setName(JOptionPane.showInputDialog("선수이름입력"));
		setTeam(JOptionPane.showInputDialog("팀 이름입력"));
		setGoal(Integer.parseInt(JOptionPane.showInputDialog("골득점입력")));
		setRecord(Integer.parseInt(JOptionPane.showInputDialog("100m달리기 기록입력")));
	}
	@Override
	public String getData() {
		// TODO Auto-generated method stub
		return getName() + "\t" + getTeam() + "\t" + getGoal() + "점\t" + getRecord() + "초\n";
	}
	@Override
	public int getRank() {
		// TODO Auto-generated method stub
		return getGoal();
	}
	
}
