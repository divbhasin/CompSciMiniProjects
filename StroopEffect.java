import java.awt.*;

import javax.swing.*;

import java.applet.Applet;
import java.awt.event.*;

public class StroopEffect extends Applet implements ActionListener {
	
	JLabel colour;
	String[] names = {"Black", "Blue", "Cyan", "Green", "Red", "Pink", "Magenta"};
	Color[] colors = { Color.black, Color.blue, Color.cyan, Color.green, Color.red, Color.pink, Color.magenta };
	int number1 = 5;
	int number2 = 2;
	

	public void init() {
		JPanel panel = new JPanel();
		BoxLayout bs = new BoxLayout(panel, 1);
		panel.setLayout(bs);
		JLabel title = new JLabel ("Call out the colour, not the word.");
		title.setFont(new Font("Calibri", Font.BOLD, 15));
		panel.add(title);
		
		colour = new JLabel();
		colour.setFont(new Font("Courier New", Font.BOLD, 40));
		panel.add(colour);
		
		JButton clue = new JButton ("New clue");
		clue.addActionListener(this);
        panel.add(clue, 2);
		
		add(panel);
	}
	
	public void actionPerformed(ActionEvent e) {
		generateRandomNumber();
		colour.setText(names[number1]);
		colour.setForeground(colors[number2]);
	}
	
	public void generateRandomNumber() {
		number1 = (int) (Math.random() * names.length);
		number2 = (int) (Math.random() * colors.length);
		
		while(number1 == number2)
			number2 = (int) (Math.random() * colors.length);
	}

}
