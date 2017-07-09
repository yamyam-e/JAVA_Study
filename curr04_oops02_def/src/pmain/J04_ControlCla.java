package pmain;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class J04_ControlCla {

	J04_People[] info;
	int peoNum = 5;
	
	String showMenu =
			"1. 인사 정보 입력 \n"
			+ "2. 인사 정보 출력(입력순서) \n"
			+ "3. 인사 정보 출력(나이 많은 순서) \n"
			+ "4. 프로그램 종료";
	
	String title1 = "이름\t 나이";
	String title2 = "이름\t 나이\t 나이순위";
	
	
	
	void works() {
			
		info = new J04_People[peoNum];
		
		while(true) {
			
			String sel = JOptionPane.showInputDialog(showMenu);
			
			String msg = null;
			
			if(sel.equals("1")) {
				boolean noMemory = true;
				
				for(int i=0; i<info.length; i++) {
					
					if(info[i] == null) {
						info[i] = new J04_People();
						msg = info[i].setData();
						noMemory = false;
						break;
					}
				}
				
				if(noMemory) {
					msg = "저장 공간이 없습니다.";
				}
				
			} else if(sel.equals("2")) {
				msg = "";
				
				for(int i=0; i<info.length; i++) {
					
					if(info[i] != null) {
						
						if(msg.equals("")) {
							msg = title1 + "\n ================================ \n";
						}
						msg += info[i].getData() + "\n";
					}
				}
				
				if(msg.equals("")) {
					msg = "저장된 데이터가 없습니다.";
				}
			} else if(sel.equals("3")) {
				
				for(int i=0; i<info.length; i++) {
					
					if(info[i] == null) {
						break;
					}
					
					for(int j=0; j<info.length; j++) {
						
						if(info[j] == null) {
							break;
						}
						
						if(info[i].age < info[j].age) {
							info[i].rank++;
						}
					}
				}
				
				msg = "";
				
				for(int i=0; i<info.length; i++) {
					
					for(int j=0; j<info.length; j++) {
						
						if(info[j] == null) {
							break;
						}
						
						if(info[j].rank == i) {
							
							if(msg.equals("")) {
								msg = title2 + "\n ================================ \n";
							}
							msg += info[i].getAgeRank() + "\n";
						}
					}
				}
				
				if(msg.equals("")) {
					msg = "저장된 데이터가 없습니다.";
				}
				
			} else if(sel.equals("4")) {
				break;
				
			} else {
				msg = "잘못된 입력입니다.";
			}
			JOptionPane.showMessageDialog(null, new JTextArea(msg));
		}
	}
}
