import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Pra11 {

	JFrame frame;
	JTextField tf;

	public Pra11() {
		frame = new JFrame();
		frame.setSize(500, 500);
		Container c = frame.getContentPane();
		tf = new JTextField("      AJP       ");		
		frame.setLayout(new FlowLayout());
		
		frame.add(tf);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Pra11();

	}

}
