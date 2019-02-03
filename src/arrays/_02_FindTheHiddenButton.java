/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener {
	JFrame frame;
	JPanel panel;

	// 1. create an array of JButtons. Don't initialize it yet.
	JButton[] buttons;

	// 2 create an int variable called hiddenButton
	int hiddenButton;

	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}

	public void start() {
		frame = new JFrame("Find the Button");
		panel = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String wordNum = JOptionPane.showInputDialog("Please enter a positive number.");
		int intNum = Integer.parseInt(wordNum);
		buttons = new JButton[intNum];

		Random rand = new Random();
		int randNum = rand.nextInt(intNum);
		hiddenButton = randNum;
		System.out.println((hiddenButton % 24) + ", " + (hiddenButton / 24));

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			buttons[i].addActionListener(this);
			panel.add(buttons[i]);
		}

		frame.add(panel);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setVisible(true);

		JOptionPane.showMessageDialog(null, "Find the hidden button.");

		buttons[hiddenButton].setText("ME");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		buttons[hiddenButton].setText("");
		// (672 for a perfect fill)

		// 3. Ask the user to enter a positive number and convert it to an int
		// 4. Initialize the array of JButtons to be the size of the int created in step
		// 3
		// 5. Make a for loop to iterate through the JButton array
		// 6. initialize each JButton in the array
		// 7. add the ActionListener to each JButton
		// 8. add each JButton to the panel
		// 9 add the panel to the window
		// 10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		// 11. set the JFrame to visible.
		// 12. Give the user the instructions for the game.
		// 13. initialize the hiddenButton variable to a random number less than the int
		// created int step 3
		// 14. Set the text of the JButton located at hiddenButton the read "ME"
		// 15. Use Thread.sleep(100); to pause the program.
		// Surround it with a try/catch
		// 16. Set the text of the JButton located at hiddenButton to be blank.
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();

		if (buttonClicked.equals(buttons[hiddenButton])) {
			buttonClicked.setText("You win!");
		} else {
			buttonClicked.setText("No.");
		}

		// 17. if the hiddenButton is clicked, tell the user that they win.
		// 18. else tell them to try again
	}
}
