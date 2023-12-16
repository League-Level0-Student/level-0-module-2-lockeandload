//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = 1+randomMaker.nextInt(10);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment .
		if (randomNumber ==(1)) {
			JOptionPane.showMessageDialog(null,"your baincels are negative");
			}
		if (randomNumber ==(2)) {
			JOptionPane.showMessageDialog(null,"your uglyer than a Uroplatus phantasticus");
			}
		if (randomNumber ==(3)) {
			JOptionPane.showMessageDialog(null,"your bloody meantal");
			}
		if (randomNumber ==(4)) {
			JOptionPane.showMessageDialog(null,"when you take a walk in measures on the richter scale");
			}
		if (randomNumber ==(5)) {
			JOptionPane.showMessageDialog(null,"you are the human equivalent of a participation trophy.");
			}
		if (randomNumber ==(6)) {
			JOptionPane.showMessageDialog(null,"your insane");
			}
		if (randomNumber ==(7)) {
			JOptionPane.showMessageDialog(null,"whatever kind of look you were aming for you missed");
			}
		if (randomNumber ==(8)) {
			JOptionPane.showMessageDialog(null,"your phyco");
			}
		if (randomNumber ==(9)) {
			JOptionPane.showMessageDialog(null,"you make me want to smash my head into a wall");
			}
		if (randomNumber ==(10)) {
			JOptionPane.showMessageDialog(null,"your meantal");
			}
			
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
