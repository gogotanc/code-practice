import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Button2 extends JFrame
{
	private JButton b1 = new JButton("Button 1");
	private JButton	b2 = new JButton("Button 2");
	private JTextField text = new JTextField(10);
	private ButtonListener listener = new ButtonListener();
	public Button2()
	{
		setLayout(new FlowLayout());
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		add(b1);
		add(b2);
		add(text);
	}
	
	class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String str = ((JButton)e.getSource()).getText();
			text.setText(str);
		}
	}
	
	public static void main(String[] args)
	{
		SwingConsole.run(new Button2(), 200, 100);
	}
}