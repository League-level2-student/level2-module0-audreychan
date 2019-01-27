package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	
	public static void main(String [] args) {
	Robot[] race = new Robot[5];
	for(int i = 0; i < race.length; i++) {
		race[i] = new Robot();
		race[i].setX(i * 100);
		race[i].setY(500);
	}
	
	for(int i = 0; i < 5; i++) {
		for(int a = 0; a < race.length; a++) {
			Random rand = new Random();
			int num = rand.nextInt(50);
			int y = race[i].getY() - num;
			race[i].setY(y);
		}
	}
	
	}
	//1. make a main method
	//2. create an array of 5 robots.
	//3. use a for loop to initialize the robots.
		//4. make each robot start at the bottom of the screen, side by side, facing up
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
	//7. declare that robot the winner and throw it a party!
	//8. try different races with different amounts of robots.
	//9. make the robots race around a circular track.
}
