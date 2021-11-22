import java.awt.*;

import javax.swing.*;

public class JFrameComponents {

	JFrame mainFrame;
	JLabel l1, l2, l3, l4, l5, l6, l7;
	JTextField t1;
	JCheckBox c1, c2, c3, c4, r1, r2;	
	JButton b1;
	JTextArea ta1;
	JList li1;

	public JFrameComponents() {
		mainFrame = new JFrame();
		mainFrame.setSize(500, 500);
		mainFrame.setBackground(Color.GRAY);
		Container contentPane = mainFrame.getContentPane();
		contentPane.setLayout(new GridLayout(4,1));
		
		
		Panel p1 = new Panel();
		p1.setBackground(Color.BLUE);
		p1.setLayout(new GridLayout(1, 2));
		l1 = new JLabel("Name");
		p1.add(l1);
		t1 = new JTextField("Enter your name");
		p1.add(t1);
		contentPane.add(p1);

		Panel p2 = new Panel();
		p2.setBackground(Color.RED);
		p2.setLayout(new GridLayout(1, 2));
		l2 = new JLabel("semester completed");
		p2.add(l2);
		c1 = new JCheckBox("sem1");
		c2 = new JCheckBox("sem2");
		c3 = new JCheckBox("sem3");
		c4 = new JCheckBox("sem4");
		p2.add(c1);
		p2.add(c2);
		p2.add(c3);
		p2.add(c4);
		contentPane.add(p2);

/*		Panel p3 = new Panel();
		p3.setBackground(Color.GREEN);
		p3.setLayout(new GridLayout(1, 2));
		l3 = new JLabel("Interested in Job");
		p3.add(l3);
		cbg = new CheckboxGroup();
		r1 = new Checkbox("Yes");
		r1.setCheckboxGroup(cbg);
		r2 = new Checkbox("No");
		r2.setCheckboxGroup(cbg);
		p3.add(r1);
		p3.add(r2);
		contentPane.add(p3);*/

		Panel p4 = new Panel();
		p4.setBackground(Color.cyan);
		l4 = new JLabel("Introduce your self");
		p4.add(l4);
		ta1 = new JTextArea("Details about your self");
		p4.add(ta1);
		contentPane.add(p4);

/*		Panel p5 = new Panel();
		p5.setBackground(Color.PINK);
		l5 = new JLabel("Select your favourate subject");
		p5.add(l5);
		li1 = new JList();
		
		li1.add("Advance Java Programming");
		li1.add("MCAD");
		li1.add("NMA");
		li1.add(".NET");
		li1.add("DBMS");
		p5.add(li1);
		contentPane.add(p5);*/


		Panel p7 = new Panel();
		p7.setBackground(Color.yellow);
		b1 = new JButton("Submit");
		p7.add(b1);
		contentPane.add(p7);

		mainFrame.setVisible(true);
	}

	public static void main(String args[]) {
		JFrameComponents f1 = new JFrameComponents();
	}
}
