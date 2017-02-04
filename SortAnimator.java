import java.awt.*;
import java.applet.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
public class SortAnimator extends Applet
{
	Button select, bubble, insert;
	int size = 10;
	int a[] = new int[100];
	Button reset;
	public void init ()
	{
		generateArray();
		JPanel s = new JPanel();

		printArray(a);
		select = new Button ("selection sort");
		s.add (select);
		bubble = new Button ("bubble sort");
		s.add (bubble);
		insert = new Button ("insertion sort");
		s.add (insert);
		reset = new Button ("Reset array");
		s.add (reset);
		add(s);
	}
	public boolean action (Event e, Object o)
	{
		if (e.target == select)
		{
			selection (a);
		}
		else if (e.target == bubble)
		{
			bubble(a);
		}
		else if (e.target == insert)
		{
			insertion(a);
		}
		else if (e.target == reset)
		{
			reset();
		}
		return true;
	}
	public void paint (Graphics g)
	{
		g.setColor(Color.WHITE);
		g.fillRect(25, 25, 500, 500);
		g.setColor (Color.red);
		printArray(a);
	}
	public void printArray(int[] a) {
		Graphics g = getGraphics();
		int y = 50;
		for (int i = 0; i < a.length; i++) {
			g.fillRect(50, y, a[i], 10);
			y += 12;
		}
	}
	public void selection ( int [] num )
	{
		int first, temp;  
		for ( int i = num.length - 1; i > 0; i-- )  
		{
			first = 0;   //initialize to subscript of first element
			for(int j = 1; j <= i; j ++)   //locate smallest element between positions 1 and i.
			{
				if( num[ j ] < num[ first ] )         
					first = j;
			}
			temp = num[ first ];   //swap smallest found with element in position i.
			num[ first ] = num[ i ];
			num[ i ] = temp; 
		}
		try {
			Thread.sleep (5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		printArray(a);
		repaint();
	}
	public void insertion( int [ ] num)
	{              
		int key;                // the item to be inserted
		int i;

		for (int j = 1; j < num.length; j++)    // Start with 1 (not 0)
		{
			key = num[ j ];
			for(i = j - 1; (i >= 0) && (num[ i ] < key); i--)   // Smaller values are moving up
			{
				num[ i+1 ] = num[ i ];
			}
			num[ i+1 ] = key;    // Put the key in its proper location
		}
		printArray(a);
		repaint();
	}
	public void bubble( int [ ] num )
	{

		boolean flag = true;   // set flag to true to begin first pass
		int temp;   //holding variable

		while ( flag )
		{
			flag= false;    //set flag to false awaiting a possible swap
			for( int j=0;  j < num.length -1;  j++ )
			{
				if ( num[ j ] < num[j+1] )   // change to > for ascending sort
				{
					temp = num[ j ];                //swap elements
					num[ j ] = num[ j+1 ];
					num[ j+1 ] = temp;
					flag = true;              //shows a swap occurred  
				} 
			} 
		}
		printArray(a);
		repaint();
	} 

	public void reset() {
		generateArray();
		printArray(a);
		repaint();
	}
	public void generateArray() {
		for (int i = 0; i < a.length; i++) {
			int n = (int) ((Math.random() * 100) + 1);
			a[i] = n;
		}
	}
}
