import javax.swing.*;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class magicSquare extends Applet implements ActionListener
{
  int row = 3;
  JButton a[] = new JButton [row * row];
  JLabel sums[] = new JLabel [row + row + 1];
  int sumNum[] = {6, 15, 24, 12, 15, 18, 45};
  public void init ()
  {
    for (int i = 0 ; i < a.length ; i++)
    {
      a [i] = new JButton ("" + (i + 1));
      a [i].addActionListener (this);
      a [i].setActionCommand ("" + i);
      a [i].setBackground (pickClr (i + 1));
      a [i].setFont (new Font ("Arial", Font.PLAIN, 26));
      a [i].setPreferredSize (new Dimension (50, 50));
      add(a[i]);
    }
    
    for (int i = 0 ; i < sums.length ; i++)
    {
      sums [i] = new JLabel (" " + sumNum [i]);
      sums [i].setFont (new Font ("Arial", Font.PLAIN, 16));
      sums [i].setPreferredSize (new Dimension (50, 50));
      add(sums[i]);
    }
    Panel g = new Panel (new GridLayout (row + 1, row + 1));
    //add the buttons here, one by one
    
    
    add (g);
    resize (250, 200);
  }
  public void actionPerformed (ActionEvent e)
  {
    if (e.getActionCommand ().equals ("reset"))
    { //reset code here
    }
    else
    {
      int n = Integer.parseInt (e.getActionCommand ());
      int x = n / row;
      int y = n % row;
      int num = Integer.parseInt (a [n].getText ());
      num++;
      a[n].setText("" + num);
      a[n].setBackground(pickClr(num));
      updateSums();
      if (num >= 10)
        num = 1;
      //process a click code here
      a[n].setText("" + num);
      a[n].setBackground(pickClr(num));
      updateSums();
      
      showStatus ("Have you won? " + winner ()); 
    }
  }
  public void updateSums ()
  {
    int n[] = new int [9];
    for (int i = 0 ; i < a.length ; i++)
    { 
      n [i] = Integer.parseInt (a [i].getText ());
    }
    //add in manual sums here
    sumNum [0] = n [0] + n [1] + n [2];
    sumNum [1] = n [3] + n[4] + n[5];
    sumNum [2] = n [6] + n [7] + n[8];
    sumNum [3] = n[0] + n[3] + n[6];
    sumNum [4] = n[1] + n[4] + n[7];
    sumNum [5] = n[2] + n[5] + n[8];
    sumNum [6] = n[0] + n[4] + n[8]; 
    
    for (int i = 0 ; i < sums.length ; i++)
    { 
      sums [i].setText ("" + sumNum [i]);
    }
  }
  
  public boolean winner ()
  {
    boolean win = true;
    //all sums the same
    //- search to see if all are equal to first spot
    int check = sumNum [0];
    for (int i = 1 ; i < sumNum.length ; i++)
    {
      if (sumNum [i] != check)
        win = false;
    }
    //all numbers different
    //- bin sort approach for each label, if equal, set to 0 '
    
    int nums[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int n[] = new int [9];
    for (int i = 0 ; i < a.length ; i++)
    {
      n [i] = Integer.parseInt (a [i].getText ());
    }
    
    for (int i = 0 ; i < n.length ; i++)
    {
      nums [n [i]]++;
    }
    //- if all 0, then all are different
    for (int i = 1 ; i < nums.length ; i++)
    {
      if (nums [i] != 9)
        win = false;
      else {
    	  win = true;
    	  break;
      }
    }
    return win;
  } 
  public Color pickClr (int n)
  {
    Color clr[] = {Color.red, Color.orange, Color.yellow, Color.cyan,
      Color.green, Color.magenta, Color.pink, Color.white, Color.lightGray, new Color(255, 125, 10)};
    return (clr [n - 1]);
  }
} 