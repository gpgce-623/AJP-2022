import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Pra4b extends Applet  implements ActionListener{
	Label l1,l2,l3,ans;
	TextField t1,t2,t3;
	Button b1;	
	
	public void init(){

		l1 = new Label("Number 1");		
		l2 = new Label("Number 2");		
		l3 = new Label("Number 3");
		
		t1 = new TextField("Enter number 1");
		t2 = new TextField("Enter number 2");
		t3 = new TextField("Enter number 3");
		
		b1 = new Button("Average");		
		b1.addActionListener(this);
		
		ans = new Label("Average is   ");
		
		add(l1);
		add(t1);
		
		add(l2);
		add(t2);
		
		add(l3);
		add(t3);
		
		add(b1);
		add(ans);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String n1 = t1.getText();
		String n2 = t2.getText();
		String n3 = t3.getText();
		Double d1 = Double.parseDouble(n1);
		Double d2 = Double.parseDouble(n2);
		Double d3 = Double.parseDouble(n3);
		Double avg = d1+d2+d3 ;
		ans.setText("Sum is " + avg);
		
	}

}

