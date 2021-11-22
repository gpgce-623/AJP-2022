import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Pra4 extends Applet implements ActionListener{
	TextField t1, t2, t3;
	Button b1;
	Label l1;

	public void init() {
		t1 = new TextField(5);
		t2 = new TextField(5);
		t3 = new TextField(5);
		b1 = new Button("Sum");
		l1 = new Label("Answer is :       ");
		
		b1.addActionListener(this);
		
		this.add(t1);
		this.add(t2);
		this.add(t3);
		this.add(b1);
		this.add(l1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s1 = t1.getText();
		Integer i1 = Integer.parseInt(s1);
		Integer i2 = Integer.parseInt( t2.getText());
		Integer i3 = Integer.parseInt( t3.getText());
		Integer sum = i1 + i2 + i3;
		l1.setText("sum is " + sum);
		
	}

}
