import java.awt.*;
import java.awt.event.*;

class FrameForm implements ActionListener {
	private Frame f1;
	private Label l1, l2;
	private TextField t1, t2;

	public FrameForm() {
		f1 = new Frame();
		GridLayout gl = new GridLayout(2, 1);
		f1.setLayout(gl);

		Panel MainPanel = new Panel();
		MainPanel.setLayout(new FlowLayout());

		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(1, 2));
		l1 = new Label("No");
		t1 = new TextField("Enter your No");
		p1.add(l1);
		p1.add(t1);
		MainPanel.add(p1);

		Panel p2 = new Panel();
		p2.setLayout(new GridLayout(1, 2));
		l2 = new Label("Name");
		t2 = new TextField("Enter your name");
		p2.add(l2);
		p2.add(t2);
		MainPanel.add(p2);

		f1.add(MainPanel);

		f1.setSize(500, 500);
		f1.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

	public static void main(String[] args) {
		FrameForm myFrame = new FrameForm();

	}
}
