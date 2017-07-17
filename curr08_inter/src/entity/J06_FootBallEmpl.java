package entity;

import javax.swing.JOptionPane;

public class J06_FootBallEmpl implements J06_FrameManeger {

	private String id;
	private String pw;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public J06_FrameManeger getInstance() {
		return new J06_FootBallEmpl();
	}
	@Override
	public boolean login(String id, String pw) {
		
		if(id.equals(getId()) && pw.equals(getPw())) {
			System.out.println("성공");
			return true;
		} else {
			return false;
		}
	}
	@Override
	public void setData() {
		setId(JOptionPane.showInputDialog("아이디를 입력하세요."));
		setPw(JOptionPane.showInputDialog("비밀번호를 입력하세요."));
	}
	
	
}
