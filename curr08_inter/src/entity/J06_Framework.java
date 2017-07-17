package entity;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J06_Framework {

	private String showMenu;
	
	private J06_FrameSource[] player;
	private J06_FrameManeger[] maneger;
	private int pcount;
	private int mcount;
	J06_FrameSource pp;
	J06_FrameManeger mm;
	
	public J06_Framework(J06_FrameSource source, J06_FrameManeger source2) {
		// TODO Auto-generated constructor stub
		player = new J06_FrameSource[5];
		maneger = new J06_FrameManeger[5];
		pcount = 0;
		mcount = 0;
		this.pp = source;
		this.mm = source2;
	}
	
	public void start() {
		
		showMenu = "[선수 정보 관리 프로그램] \n"
				+ "1. 로그인 \n"
				+ "2. 회원가입 \n"
				+ "3. 프로그램종료";

		while(true) {
			
			String sel = JOptionPane.showInputDialog(showMenu);
			
			if(sel.equals("1")) {
				
				if(mcount == 0) {
					showMsg("등록된 직원이 없습니다.");
					continue;
				}
				
				String id = JOptionPane.showInputDialog("아이디입력");
				String pw = JOptionPane.showInputDialog("비밀번호입력");
				
				boolean success = false;
				
				for(int i=0;i<mcount; i++) {
					if(maneger[i].login(id, pw)) {
						playerMenu(maneger[i]);
						success = true;
					}
				}
				
				if(!success) {
					showMsg("정보가 일치하지 않습니다.");
				}
				
				continue;
				
			} else if(sel.equals("2")) {
				
				if(mcount == 5) {
					showMsg("더이상 저장할 공간이 없습니다.");
					continue;
				}
				
				join();
				continue;
				
			} else if(sel.equals("3")) {
				break;
				
			}
			showMsg("잘못입력하셨습니다.");
		}
	}

	public void playerMenu(J06_FrameManeger mg) {
		
		showMsg(mg.getId() + " 님 환영합니다.!!");
		String menu = "[선수 정보 관리 프로그램] \n" + pp.getMenu();
		
		while(true) {
			
			String sel = JOptionPane.showInputDialog(menu);
			
			if(sel.equals("1")) {
				
				if(pcount == 5) {
					showMsg("등록할 공간이 없습니다.");
				} else {
					addPlayer();
				}
				
				continue;
				
			} else if(sel.equals("2")) {
				
				if(pcount == 0) {
					showMsg("등록된 선수가 없습니다.");
					continue;
				} else {
					playerShowMenu();
					continue;
				}
				
			} else if(sel.equals("3")) {
				return;
			}
			showMsg("잘못누르셨습니다.");
		}
	}
	
	public void playerShowMenu() {
		
		String menu = "[선수 정보 출력 프로그램] \n"
				+ "1. 전체 정보 출력 \n"
				+ "2. " + pp.getRankMenu() + "순 출력 \n"
				+ "3. 이름 검색 \n"
				+ "4. 이전 메뉴로";
		
		while(true) {
			
			String sel = JOptionPane.showInputDialog(menu);
			
			if(sel.equals("1")) {
				playerAll();
			} else if(sel.equals("2")) {
				titleInfo();
			} else if(sel.equals("3")) {
				searchName();
			} else if(sel.equals("4")) {
				break;
			}
		}
	}
	
	public void playerAll() {
		
		String info = "[전체 선수 정보] \n"
					+ pp.getTitle();
		
		for(int i=0; i<pcount; i++) {
			info += player[i].getData();
		}
		showMsg(info);
	}
	
	public void titleInfo() {
		
		String info = "";
		
		int i = getMax();
		
		for(; i>0; i--) {
			for(int j=0; j<pcount; j++) {
				if(i==player[j].getRank()) {
					info += player[j].getData();
				}
			}
		}
		
		info = "[" + pp.getRankMenu() + "순 선수정보] \n"
				+ pp.getTitle() + info;
		
		showMsg(info);
	}
	
	public void searchName() {
		
		String name = JOptionPane.showInputDialog("검색하실 이름을 입력하세요.");
		String result = "[검색결과] \n" 
					  + pp.getTitle();
		
		boolean empty = true;
		
		for(int i=0; i<pcount; i++) {
			if(name.equals(player[i].getName())) {
				result += player[i].getData();
				empty = false;
			}
		}
		
		if(!empty) {
			showMsg(result);
		} else {
			showMsg("검색결과가 없습니다.");
		}
	}
	
	public int getMax() {
		int max = 0;
		for(int i=0; i<pcount; i++) {
			if(max<player[i].getRank()) {
				max = player[i].getRank();
			}
		}
		
		return max;
	}
	
	public void addPlayer() {
		player[pcount] = pp.getInstance();
		player[pcount].setData();
		pcount++;
		showMsg("등록완료");
	}
	
	public void join() {
		maneger[mcount] = mm.getInstance();
		maneger[mcount].setData();
		mcount++;
		showMsg("가입되었습니다.");
	}
	
	public void showMsg(String msg) {
		JOptionPane.showMessageDialog(null, new JTextArea(msg));
	}
}
