import javax.swing.*;
import java.awt.*;

public class LayoutDemo extends JFrame{

/* 	
	//BorderLayout
	public LayoutDemo(){
		add(BorderLayout.NORTH, new JButton("North"));
		add(BorderLayout.SOUTH, new JButton("South"));
		add(BorderLayout.EAST, new JButton("East"));
		add(BorderLayout.WEST, new JButton("West"));
		add(BorderLayout.CENTER, new JButton("Center"));
	} 
*/

/* 	
	//FlowLayout
	public LayoutDemo(){
		setLayout(new FlowLayout());
		for(int i=0; i<20; i++)
			add(new JButton("Button" + i));
	}  
*/

/* 	
	//GridLayout
	public LayoutDemo(){
		setLayout(new GridLayout(7,3));	//七行三列
		for(int i=0; i<20; i++)
			add(new JButton("Button" + i));
	}  
 */

	
	public static void main(String[] args){
		SwingConsole.run(new LayoutDemo(), 300, 300);
	}
}