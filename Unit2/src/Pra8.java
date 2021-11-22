import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Pra8 extends Applet implements MouseListener {
	Label l = new Label("                ");	

	public void init() {			
		add(l);
		addMouseListener(this);
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		l.setText("Clicked");
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		l.setText("Released");
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {	}
	@Override
	public void mouseEntered(MouseEvent arg0) { }
	@Override
	public void mouseExited(MouseEvent arg0) {	}

}
