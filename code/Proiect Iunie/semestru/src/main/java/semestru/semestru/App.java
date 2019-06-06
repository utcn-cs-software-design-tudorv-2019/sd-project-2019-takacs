package semestru.semestru;

import java.awt.Dimension;

import javax.swing.JFrame;

import controller.ViewUser;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	JFrame frame = new ViewUser();
		frame.setTitle("PasswordGenerator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(640,480));
		frame.pack();
		frame.setVisible(true);
	
    }
}
