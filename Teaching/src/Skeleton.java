import java.awt.*;
import java.awt.event.*;

class Skeleton implements ActionListener  {
	private Frame f1;
	
	public Skeleton() {
		f1 = new Frame();
		f1.setLayout(new FlowLayout());
				
		//add components logic here
		
		f1.setSize(500,500);
		f1.setVisible(true);
	}	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//add event handling code here	
	}
	
	public static void main(String[] args) {
		Skeleton myFrame = new Skeleton();

	}
}

