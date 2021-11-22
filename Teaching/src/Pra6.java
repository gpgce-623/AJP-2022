import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pra6 {	
	
	public static void main(String[] args) {
		MyFrame2 myFrame = new MyFrame2();

	}

}

class MyFrame {
	private Frame f1;
	
	public MyFrame() {
		f1 = new Frame();
		f1.setLayout(new FlowLayout());
				
		Button b1 = new Button("Background");
		MyButtonActionListener actionListener = new MyButtonActionListener(f1);
		b1.addActionListener(actionListener);
		f1.add(b1);
		
		f1.setSize(500,500);
		f1.setVisible(true);
	}	
}

class MyButtonActionListener implements ActionListener {
	Frame f1;
	
	public MyButtonActionListener(Frame f1) {
		this.f1 = f1;
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
	
}