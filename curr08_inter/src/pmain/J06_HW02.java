package pmain;

import entity.J06_FootBallEmpl;
import entity.J06_FootBallPlayer;
import entity.J06_Framework;

public class J06_HW02 {
	public static void main(String[] args) {
		
		new J06_Framework(new J06_FootBallPlayer(), new J06_FootBallEmpl()).start();
	}
}
