package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	Robot[] rob = new Robot[5];
	int x = 20;
	int y = 500;
	
	for (int i = 0; i < rob.length; i++) {
		x+=100;
		rob[i]=new Robot("sparkle");
		rob[i].setX(x);
		rob[i].setY(y);
rob[i].setSpeed(10);	
	}
	boolean isRacing=true; 
	Random a = new Random();

	while (isRacing) {	
	for (int i = 0; i < rob.length; i++) {
		int rand = a.nextInt(50);
		rob[i].move(rand);
		if(rob[i].getY()<0) {
			isRacing=false;
		}
	
	}

	}
}
	
	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
