//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
	public static void main(String[] args) {
	// 1. Make a main method that includes all the steps below
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(4);
		
		System.out.println(randomNumber);
		String quez=	"ask the all knowing 8 ball a queston, or forever be cursed with curiosity";
		String og = JOptionPane.showInputDialog(null,quez); 
	// 2. Get the user to enter a question for the 8 ball to answer
	

	// 3. Make a variable and initialize it to a random number.
	//     ** You will need to make a random object!
	//     Limit the random numbers to be between 0 and 3

	
	// 4. If the random number is 0

	// -- tell the user "Yes"
		if (randomNumber ==(0)) {
			JOptionPane.showMessageDialog(null, og + "\nYes");
			}
	// 5. If the random number is 1

	// -- tell the user "No"
		if (randomNumber ==(1)) {
			JOptionPane.showMessageDialog(null, og + "\nNo");
			}
	// 6. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"
		if (randomNumber ==(2)) {
			JOptionPane.showMessageDialog(null, og + "\ngo ask google you weeb, use google becase this code is pointless. I can just copy paste it and put it in a diffrent format, this needs to be deleted instantly.");
			}
	// 7. If the random number is 3

	// -- write your own answer
	if (randomNumber ==(3)) {
		JOptionPane.showMessageDialog(null, og + "\ni didn't know that someone was so stupid that the question had to be asked. You're the reason that shampoo has instructions");
		}
}
}

