import java.util.Random;
import javax.swing.JOptionPane;

public class TBA{
	public static void main(String[] args) {
		//random setup

		Random ran = new Random();
		Random gen =new Random (); 
		//copy me to randomly generate numbers		
		//int num = gen.nextInt(22);
		//System.out.println(num);

		//Variables	
		int playerHealth = 10;
		int playerAttack = 5;
		int hitChance = 10;
		int dogeChance = 0;
		//Game
		String name = JOptionPane.showInputDialog("please enter a name for your character");
		System.out.println(name);
		if (name.equals("Isahiah Easter")) {
			String  [] freshJays = {"Yes", "No",};
			int daFreshJays = JOptionPane.showOptionDialog(null, "Do you want to equip Isahiah's fresh Jays?(max doge, max hit chance)", null, 0, 1, null, freshJays, null);
		if (daFreshJays == 0) {
		hitChance = 1000;
		dogeChance = 1000;
		}
		
		}
		String type = JOptionPane.showInputDialog("what class would you like to chose?\nLight (less attack, less health, more hit chance, more doge chance)\nMedium (What did you expect, its normal) \nHeavy (more attack, more health, less hit chance, less doge chance)");	
		if (type.equals("Light")){		
			System.out.println("Light");
			playerHealth /= 2;
			playerAttack /= 2;
			dogeChance += 40;
			hitChance += 85;
		}
		if (type.equals("Medium")){		
			System.out.println("Medium");
			dogeChance += 15;
			hitChance += 70;
		}		
		if (type.equals("Heavy")){		
			System.out.println("Heavy");
			playerHealth *= 2;
			playerAttack *= 3;
			dogeChance += 0;
			hitChance += 40;
		}
		//string for show Option Dialog
		String  [] adventures = {"low lv Doge", "low lv Hit", "Low lv Health", "Low lv Damage", "Medium lv Doge", "Medium lv Hit", "Medium lv Health", "Medium lv Damage", "High lv Doge", "High lv Hit", "High lv Health", "High lv Damage"};
		String  [] adventuresLvOne = {"low lv Doge", "low lv Hit", "Low lv Health", "Low lv Damage"};
		String  [] leftOrRight = {"Left", "Right"};
		String  [] roughOrSoft = {"Rough(lot of loot, DoT, and harder enemys)", "Smoth path(less loot, no DoT, easyer enemys)"};

		int Adventures = JOptionPane.showOptionDialog(null, "Chose an adventure to go on", null, 0, 3, null, adventuresLvOne, null);		
		System.out.println(Adventures);

		if (Adventures==0) {
			int leftorright01= JOptionPane.showOptionDialog(null, "Left or Right", null, 0, 1, null, leftOrRight, null);
			if (leftorright01==0){
				int roughOrSoft1 = JOptionPane.showOptionDialog(null, "Which path?", null, 0, 1, null, roughOrSoft, null);
				if(roughOrSoft1 == 0) {

				}
			}	

			if (leftorright01==1){

			}
		}

		if (Adventures==1) {
			int leftorright11= JOptionPane.showOptionDialog(null, "Left or Right", null, 0, 1, null, leftOrRight, null);
			if (leftorright11==0){

			}
			if (leftorright11==1){

			}
		}		
		if (Adventures==2) {
			int leftorright21= JOptionPane.showOptionDialog(null, "Left or Right", null, 0, 1, null, leftOrRight, null);
			if (leftorright21==0){

			}
			if (leftorright21==1){

			}
		}		
		if (Adventures==3) {
			int leftorright31= JOptionPane.showOptionDialog(null, "Left or Right", null, 0, 1, null, leftOrRight, null);
			if (leftorright31==0){

			}
			if (leftorright31==1){

			}
		}		













		//moster lv1 selection
		int Lv1M = gen.nextInt(10);
		System.out.println(Lv1M);
		if (Lv1M == 1){

		}

























	}
}