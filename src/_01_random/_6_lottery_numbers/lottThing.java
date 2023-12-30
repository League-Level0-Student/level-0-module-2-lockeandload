package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lottThing {
	public static void main(String[] args) {
		String thing = "";	
		Random randomMaker = new Random();
		for (int RN=0;RN<10 ; RN += 1) {
			int randomNumber = randomMaker.nextInt(100);
			thing += randomNumber + " ";
			
			//System.out.println(randomNumber);
		}
		
		JOptionPane.showMessageDialog(null, "Lotto number\n" + thing);

	
	}
}