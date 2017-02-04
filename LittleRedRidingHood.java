import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;

public class LittleRedRidingHood extends Applet implements ActionListener {
	
	JLabel picture, text;
	int counter = 0;
	String[] pictures = {"red1.jpg", "red2.jpg", "red3.jpg", "red4.jpg", "red5.jpg", "red6.jpg", "red7.jpg", "red8.jpg", "red9.jpg",
			             "red10.jpg", "red11.jpg"};
	
	String[] texts = { "Once upon a time, a little girl named Little Red Riding Hood went to visit her sick grandmother", 
			          "She walked through the woods and over bridges", "After a while, she met a wolf who tricked her into buying flowers for her grandmother", 
			          "The wold ran ahead and ate her grandmother, then he disguised himself", 
			          "When Red arrived, she was puzzled. She said \" Grandmother, what big ears you have! \" ", 
			          "Then, Red said \"Grandmother, what sharp teeth you have!\" and the wolf ate her", 
			          "Full, the wolf went to sleep and snored loudly. A nearby woodcutter heard him. ", 
			          "When the woodcutter came to investigate, he noticed a scarf coming out of the wolf's mouth", 
			          "The scarf was from the grandmother's knitting in the wolf's stomach.", 
			          "The woodcutter pulled Little Red Riding Hood and her grandmother free!", 
			          "The wolf was put in prison and everyone else lived happily ever after! The End."};
	
	public void init() {
		picture = new JLabel (createImageIcon(pictures[counter]));
		
		JButton forward = new JButton(">>");
		forward.addActionListener(this);
		
	    text = new JLabel(texts[counter]);
	    add(picture);
	    add(forward);
	    add(text);
	}
	
	public void actionPerformed(ActionEvent e) {
		counter++;
		if (counter == 11) 
			counter = 0;
		picture.setIcon(createImageIcon(pictures[counter]));
		text.setText(texts[counter]);
	}
	
	protected static ImageIcon createImageIcon(String path) {
		java.net.URL imgURL = LittleRedRidingHood.class.getResource(path);
		if (imgURL != null)
			return new ImageIcon(imgURL);
		else {
			System.err.println("The picture " + path + " not found!");
			return null;
		}
	}
}
