import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Pra6b implements ActionListener  {
	private Frame f1;
	
	public Pra6b() {
		f1 = new Frame();
		f1.setLayout(new FlowLayout());
				
		Button b1 = new Button("Background");		
		b1.addActionListener(this);
		f1.add(b1);
		
		f1.setSize(500,500);
		f1.setVisible(true);
	}	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(f1.getBackground().equals(Color.RED)) {
			f1.setBackground(Color.GREEN);			
		}else if(f1.getBackground().equals(Color.GREEN)) {
			f1.setBackground(Color.BLUE);			
		}else {
			f1.setBackground(Color.RED);
		}		
	}
	
	public static void main(String[] args) {
		Pra6b myFrame = new Pra6b();

	}
}

