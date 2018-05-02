

import javax.swing.JOptionPane;

public class SimpleCalculator {




	// 1. Get 2 numbers from the user and convert them to integer.
	static String num1;
	static int Num1; 
	static String num2; 
	static int Num2;
	static String answer;
	static int ANSWER; 
	public static void main(String[] args) {
		for(int a = 0; a<10; a++) {
		num1 = JOptionPane.showInputDialog("Enter your first number");
		num2 = JOptionPane.showInputDialog("Enter your second number");
		Num1 = Integer.parseInt(num1);
		Num2 = Integer.parseInt(num2);
			




		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Select your operation", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "addition", "subtraction", "multiplication", "division" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
		if(operation==3) {
			division ();
		}
		if(operation==0){
			addition ();
		}
		if(operation==1) {
			subtraction ();
		}
		if(operation==2) {
			multiplication ();
		}
		}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	static void division () {
		ANSWER = Num1 / Num2;
		JOptionPane.showMessageDialog(null, ANSWER);
	}
	static void multiplication () {
		ANSWER = Num1 * Num2;
		JOptionPane.showMessageDialog(null, ANSWER);
	}
	static void subtraction () {
		ANSWER = Num1 - Num2;
		JOptionPane.showMessageDialog(null, ANSWER);
	}
	static void addition (){
		ANSWER = Num1 + Num2;
		JOptionPane.showMessageDialog(null, ANSWER);
	}
	// 4. Create similar methods for subtraction, multiplication and division.
}
