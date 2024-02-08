package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class Voting_Booth_Thing_YouNeedToMakeAClassNextTimeIdit {
	public static void main (String[] args) {
		String age = JOptionPane.showInputDialog("what is your age");	
		int ageInt = Integer.parseInt(age);	
		if(ageInt < 18 ){ 
			JOptionPane.showMessageDialog(null, "no one cares about u, you exsit to give teachers a job");	
			
			}
		if(ageInt >= 18 && ageInt <= 100) {	
			JOptionPane.showMessageDialog(null, "you voted for galdof, he is now president");
		}
		if(ageInt > 100 ){ 
			JOptionPane.showMessageDialog(null, "go back to cheating on TF2 LOZER");	
			
			}
				
	}
	
}
