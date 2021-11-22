import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowListenerDemo implements WindowListener {

	Frame mainFrame;

	StringBuilder sb = new StringBuilder();
	Label l;

	public WindowListenerDemo() {
		mainFrame = new Frame();
		mainFrame.setSize(500, 500);

		l = new Label("Window");
		mainFrame.add(l);
		mainFrame.addWindowListener(this);
		mainFrame.setVisible(true);
	}

	public static void main(String args[]) {
		WindowListenerDemo f1 = new WindowListenerDemo();
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		System.out.println("windowActivated");

	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		System.out.println("windowClosed");

	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.out.println("windowClosing");
		mainFrame.dispose();

	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		System.out.println("windowDeactivated");

	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		System.out.println("windowDeiconified");

	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		System.out.println("windowIconified");

	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		System.out.println("windowOpened");

	}

}
