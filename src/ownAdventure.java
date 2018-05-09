import javax.swing.JOptionPane;

public class ownAdventure {
public static void main(String[] args) {

	
	int x = JOptionPane.showOptionDialog(null, "You wake up for school this morning. There is a starship that landed at your house. How do you respond to this?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "board the ship", "go to school"}, null);
	if(x == 1) {
		JOptionPane.showMessageDialog(null, "You go to school. Yeah that's all I have. I never expected humans would be so boring. >:(");
	}
	
	if(x == 0) {
		int y = JOptionPane.showOptionDialog(null, "There is an ad saying 'free V bucks! Grab this ad and you will get 9 X 10 billitionth power V bucks!", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Take the ad", "Try to escape"}, null);
		if(y == 0) {
			JOptionPane.showMessageDialog(null, "You take the ad. It explodes and you die. You have achieved the fortnite addict ending.");
		}
	if(y == 1) {
		int z = JOptionPane.showOptionDialog(null, "You try and escape but an alien knocks you unconsious. You wake up in a prison cell", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Team up with prisoners", "Stay put", "Steal a ship and blow up the prison", "Sneak aboard a ship"}, null);	
	if(z == 0) {
		JOptionPane.showMessageDialog(null, "You team up with a few prisoners. One is a prisoner from the Mandolorian Deathwatch, the other is an innocent man, the final one is a a criminal. The criminal keeps watch while you all take out the guards. The criminal starts up the ship as you leave. He leaves the prison and you all get executed." );
	}
	if(z == 1) {
		JOptionPane.showMessageDialog(null, "You stay put and you are fed to the pet dragon of the high commander.");
	}
	if(z == 2) {
		JOptionPane.showMessageDialog(null, "You steal a ship and an epic explosion occurs as you leave the prison. Now you are strandede in deep space. To be continued . . .");
	}
	if(z == 3) {
		JOptionPane.showMessageDialog(null, "You sneak aboard a ship and take an escape pod to Earth. You see the world is destroyed. An old man approaches you and hands you a lightsaber as he falls to the ground. There is also a note saying, 'Head to the jedi temple at Courscaunt.");
	}
	
	}
	
	
	
	}
	
	
	
	
	
	}
	}
	
	


