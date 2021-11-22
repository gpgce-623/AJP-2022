import java.awt.*;
import java.awt.event.*;

public class Pra8_Adapter extends MouseAdapter{
	Label l = new Label("                ");	
	Frame  f;
	
	Pra8_Adapter(){
		f = new Frame();		
		f.setSize(600,600);
		f.setLayout(new FlowLayout());
		f.add(l);
		f.addMouseListener(this);
		f.setVisible(true);
		
	}
	
	public static void main(String args[]){
		new Pra8_Adapter();
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		l.setText("Clicked");
	}



}
