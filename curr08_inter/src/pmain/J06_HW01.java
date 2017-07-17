package pmain;

import entity.J06_BaseBallEmpl;
import entity.J06_BaseBallPlayer;
import entity.J06_Framework;

public class J06_HW01 {
	public static void main(String[] args) {
		
		new J06_Framework(new J06_BaseBallPlayer(), new J06_BaseBallEmpl()).start();
	}
}
