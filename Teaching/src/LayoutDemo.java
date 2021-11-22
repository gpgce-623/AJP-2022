import java.awt.*;
import java.awt.event.*;

public class LayoutDemo extends WindowAdapter {

	Frame f;
	Button b1, b2, b3, b4;

	public LayoutDemo() {
		f = new Frame();
		f.setSize(500, 500);
		f.setLayout(new GridLayout(2,1));
		f.setBackground(Color.gray);
		f.addWindowListener(this);

		Panel p = new Panel();
		p.setBackground(Color.red);
		p.setLayout(new BorderLayout());
		
		Panel p11 = new Panel();
		p11.setLayout(new GridLayout(1,2));
		p11.setBackground(Color.green);
		Label l11 = new Label("L1");
		p11.add(l11);
		b1 = new Button("Button 1");
		p11.add(b1);		
		p.add(p11,BorderLayout.SOUTH);
		
		b2 = new Button("Button 2");
		b3 = new Button("Button 3");
		b4 = new Button("Button 4");
		
		p.add(b2,BorderLayout.NORTH);
		p.add(b3,BorderLayout.EAST);
		p.add(b4,BorderLayout.WEST);
		f.add(p);

		f.setVisible(true);

	}

	@Override
	public void windowClosing(WindowEvent e) {
		f.dispose();
	}

	public static void main(String[] args) {
		new LayoutDemo();

	}

}
