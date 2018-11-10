package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		Robot[] rob = new Robot[7];
		int x;
		int y = 410;

		for (int i = 0; i < rob.length; i++) {
			x = 50;
			rob[i] = new Robot("batman");
			rob[i].setX(x);
			rob[i].setY(y);
			rob[i].setSpeed(50);

		}
		boolean isRacing = true;
		Random a = new Random();

		while (isRacing) {
			for (int i = 0; i < rob.length; i++) {
				int rand = a.nextInt(50);
				if (rand > 25) {
					rob[i].move(100);
					rob[i].turn(30);
				}
				// rob[i].move(rand);
				int e = i + 1;
				if (rob[i].getY() > 410 && rob[i].getX() < 125) {
					JOptionPane.showMessageDialog(null, "robot" + e + " wins!!");
					isRacing = false;
				}
			

			}

		}

	}

	// 7. declare that robot the winner and throw it a party!

	// 8. try different races with different amounts of robots.

	// 9. make the robots race around a circular track.
}
