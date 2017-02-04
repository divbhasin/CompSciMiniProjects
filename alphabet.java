import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class alphabet extends Applet implements ActionListener
{
	JTextField text;
	public void init ()
	{
		text = new JTextField (40);
		JButton a[] = new JButton [26];
		Panel g = new Panel (new GridLayout (2, 13));
		for (int i = 0 ; i < a.length ; i++)
		{
			a [i] = new JButton ("" + (char) (i + 97));
			a [i].addActionListener (this);
			a [i].setActionCommand ("" + (char) (i + 97));
			a [i].setBackground(Color.yellow);
			g.add (a [i]);
		}
		JButton space = new JButton("             ");
		space.addActionListener(this);
		space.setActionCommand(" ");
		space.setBackground(Color.GRAY);
		g.add(space);
		
		JButton num[] = new JButton[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = new JButton("" + i);
			num[i].addActionListener(this);
			num[i].setActionCommand("" + i);
			num[i].setBackground(Color.CYAN);
			g.add(num[i]);
		}
		
		add (text);
		add (g);
		resize (700, 100);
	}
	
	public void actionPerformed (ActionEvent e)
	{
		text.setText (text.getText () + e.getActionCommand ());
	}
}

