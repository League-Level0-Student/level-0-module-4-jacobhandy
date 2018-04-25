import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet = JOptionPane.showInputDialog("What pet do you want to buy?");
JOptionPane.showMessageDialog(null, "Your pet is a " + pet);
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.

		for( int i = 0; i < 6; i++) {		
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your organism happy?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Consumption", "Exercise", "Play","Statistics" }, null);
			if(task == 3) {
				Stats();
				
			}

			if(task == 2) {
			Play();
		
			}

if(task == 0) {
	Consumption();
}
		
		if(task == 1) {
			Exercise();
		}
		
		if(happinessLevel == 4) {
			JOptionPane.showMessageDialog(null, "You have successfully made your pet happy! You live a happy life until death. However, when reincarnation happens, you find yourself with your " + pet);
		}
		if(i > 6) {
			JOptionPane.showMessageDialog(null, "You failed to keep your pet happy. Your pet eats you and runs into the wild");
		}
		}
	
			// 5. Use user input to call the appropriate method created in step 4.
	
	}
	
	static void Play() {
		JOptionPane.showMessageDialog(null, "Your pet responds by breathing fire and almost burning down your house. However, this indicates signs of happiness.");
	String answer = JOptionPane.showInputDialog("How do you respond to this?");
	if(answer.equals("Put the animal in a training facility")) {
		JOptionPane.showMessageDialog(null, "Your pet now hates you and injects venom into your body.");
		happinessLevel = happinessLevel - 1;
	}
		if(answer.equals("continue playing")) {
			JOptionPane.showMessageDialog(null, "You and your pet have a great time. This is becomes one of your greatest memories.");
		happinessLevel = happinessLevel + 1;
		}
		}
	
	static void Consumption() {
		String answer1 = JOptionPane.showInputDialog("What do you want to feed your pet?");
		if(answer1.equals("Water and standard pet food")){
			JOptionPane.showMessageDialog(null, "Your pet is satisfied and not dead.");
			happinessLevel = happinessLevel + 1;
		}
			
		if(answer1.equals("I don't know")){
				JOptionPane.showMessageDialog(null, "Your pet gets so hungry that he eats your neighbors.");
			   happinessLevel = happinessLevel -1;
			}
		}
		
		static void Exercise() {
			String answer2 = JOptionPane.showInputDialog("You are walking your pet when you see someone with a rabid dog. How do you respond to this?");
		if(answer2.equals("challenge the person to a battle")) {
			JOptionPane.showMessageDialog(null, "You battle the other person and fail miserably. Learn to realize that this is reality, not Pokemon.");
		happinessLevel = happinessLevel -1;
		}
		if(answer2.equals("Calmly pass the person and their pet")) {
			JOptionPane.showMessageDialog(null, "You successfully go past them and your pet gets exerciesed.");
		happinessLevel = happinessLevel +1;
		}
		}
		
		

	
	
	
	// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	static void Stats() {
		JOptionPane.showMessageDialog(null, happinessLevel);
	}
	}
	//    and INCREMENT the pet's happiness Level.
