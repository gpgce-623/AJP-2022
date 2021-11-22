import java.awt.*;
import java.awt.event.*;

public class Pra6 implements ActionListener{
	Frame f1 = null;
	public Pra6(){
		f1 = new Frame();
		f1.setLayout(new FlowLayout());
		
		Button b1 = new Button("click me");
		b1.addActionListener(this);
		f1.add(b1);
		
		
		f1.setSize(500,500);
		f1.setVisible(true);
	}
	
	public static void main(String[] args) {
		Pra6 p6 = new Pra6();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(f1.getBackground().equals(Color.RED))
			f1.setBackground(Color.GREEN);
		else if(f1.getBackground().equals(Color.GREEN))
			f1.setBackground(Color.BLUE);
		else
			f1.setBackground(Color.RED);
	}

}
