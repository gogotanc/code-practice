import javax.swing.*;

public class HelloLabel{
	public static void main(String[] args) throws Exception{
		JFrame frame = new JFrame("Hello Label");
		JLabel label = new JLabel("a label");
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setVisible(true);
		Thread.sleep(3000);
		label.setText("change");
	}
}