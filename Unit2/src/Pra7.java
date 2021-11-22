import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Pra7 extends Applet implements MouseMotionListener {

	Label l = new Label("                ");
	int x, y;

	public void init() {		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(l);		
		addMouseMotionListener(this);
	}

	public void paint(Graphics g) {
		g.fillRect(x, y, 15, 15);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		mouseMoved(e);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		l.setText("x: " + x + " , Y: " + y);
		//repaint();
	}

}
