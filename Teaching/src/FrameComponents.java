import java.awt.*;

public class FrameComponents {

	Frame mainFrame;
	Label l1, l2,l3,l4,l5,l6,l7;
	TextField t1;
	Checkbox c1, c2, c3, c4 , r1,r2;
	CheckboxGroup cbg;
	Button b1;
	TextArea ta1;
	List li1;
	Choice co1;

	public FrameComponents() {
		mainFrame = new Frame();
		mainFrame.setSize(500, 500);
		mainFrame.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		mainFrame.setBackground(Color.GRAY);
		
		Panel p1 = new Panel();
		p1.setBackground(Color.BLUE);
		p1.setLayout(new GridLayout(1,2));
		l1 = new Label("Name");
		p1.add(l1);
		t1 = new TextField("Enter your name");
		p1.add(t1);
		mainFrame.add(p1);
		
		Panel p2 = new Panel();
		p2.setBackground(Color.RED);
		p2.setLayout(new GridLayout(1,2));
		l2 = new Label("semester completed");
		p2.add(l2);		
		c1 = new Checkbox("sem1");
		c2 = new Checkbox("sem2");
		c3 = new Checkbox("sem3");
		c4 = new Checkbox("sem4");
		p2.add(c1);
		p2.add(c2);
		p2.add(c3);
		p2.add(c4);
		mainFrame.add(p2);
		
		Panel p3 = new Panel();
		p3.setBackground(Color.GREEN);
		p3.setLayout(new GridLayout(1,2));
		l3 = new Label("Interested in Job");
		p3.add(l3);		
		cbg = new CheckboxGroup();
		r1 = new Checkbox("Yes");
		r1.setCheckboxGroup(cbg);
		r2 = new Checkbox("No");		
		r2.setCheckboxGroup(cbg);		
		p3.add(r1);
		p3.add(r2);
		mainFrame.add(p3);
		
		Panel p4 = new Panel();
		p4.setBackground(Color.cyan);
		l4 = new Label("Introduce your self");
		p4.add(l4);
		ta1 = new TextArea("Details about your self");
		p4.add(ta1);
		mainFrame.add(p4);
		
		Panel p5 = new Panel();	
		p5.setBackground(Color.PINK);
		l5 = new Label("Select your favourate subject");
		p5.add(l5);
		li1 = new List();
		li1.add("Advance Java Programming");
		li1.add("MCAD");
		li1.add("NMA");
		li1.add(".NET");
		li1.add("DBMS");
		p5.add(li1);
		mainFrame.add(p5);
		
		Panel p6 = new Panel();
		p6.setBackground(Color.orange);
		l6 = new Label("Select your difficult subject");
		p6.add(l6);
		co1 = new Choice();
		co1.add("Advance Java Programming");
		co1.add("MCAD");
		co1.add("NMA");
		co1.add(".NET");
		co1.add("DBMS");
		p6.add(co1);
		mainFrame.add(p6);
		
		Panel p7 = new Panel();	
		p7.setBackground(Color.yellow);
		b1 = new Button("Submit");
		p7.add(b1);
		mainFrame.add(p7);
		
		mainFrame.setVisible(true);
	}

	public static void main(String args[]) {
		FrameComponents f1 = new FrameComponents();
	}
}
