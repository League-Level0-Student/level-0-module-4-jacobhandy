//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickels = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
int Nickels = Integer.parseInt(nickels);
Nickels = Nickels * 5;
		// Ask the user how many dimes they have, and convert their answer
String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		// Ask the user how many quarters they have, and convert their answer
int Dimes = Integer.parseInt(dimes);
Dimes = Dimes * 10;
		String quarters = JOptionPane.showInputDialog("How many quarters do you have?");
Integer.parseUnsignedInt(quarters);
int Quarters = Integer.parseInt(quarters);
Quarters = Quarters * 25;
		// Calculate how much money the user has and save it in a double variable 
int total = Quarters + Dimes + Nickels;
		// Tell the user how much money they have
if(total>=100) {
	total = total/100;
}
JOptionPane.showMessageDialog(null, "Your balance is " + total + "dollars");
	}
}

