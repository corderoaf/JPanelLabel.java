// demo of the JPanel class in a GUI

import javax.swing.*;
import java.awt.*;

public class JPanelLabel
{
	public static void main(String[] args)
	{
		// create and customize a JFrame object
		JFrame myFrame = new JFrame("JPanel Demo");
		myFrame.setBounds(650, 480, 240, 180);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLayout(new FlowLayout());
		myFrame.getContentPane().setBackground(new Color(50, 205, 50));

		// Create two JPanel objects and customize them. JPanels are just containers, they do not create anything but control layout.
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		panel1.setBackground(Color.BLACK); // or rgb constuctor, line 15
		panel2.setBackground(Color.WHITE);

		// Create multiple JButton objects and customize them.
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		button3.setBackground(Color.RED);
		button3.setForeground(Color.YELLOW);// Foreground relates to font

		// add the buttons to the panels.
		// panel1 will have two buttons
		// panel2 will have one button
		panel1.add(button1);
		panel1.add(button2);
		panel2.add(button3);

		// now we're ready to add the panels to the frame
		myFrame.add(panel1);
		myFrame.add(panel2);

		// make the JFrame visible
		myFrame.setVisible(true);
	}
}