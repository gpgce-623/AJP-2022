import java.awt.Frame;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyListenerDemo implements KeyListener {

	Frame mainFrame;
	Label l;

	public keyListenerDemo() {
		mainFrame = new Frame();
		mainFrame.setSize(500, 500);
		mainFrame.addKeyListener(this);
		l = new Label("                                     ");
		mainFrame.add(l);
		mainFrame.setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent e) {		
		l.setText(e.getKeyChar() + " pressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		l.setText(e.getKeyChar() + " released");
	}

	@Override
	public void keyTyped(KeyEvent e) {
		l.setText(e.getKeyChar() + " typed");
	}

	public static void main(String args[]) {
		keyListenerDemo f1 = new keyListenerDemo();
	}

}
