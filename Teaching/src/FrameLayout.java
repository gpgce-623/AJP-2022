import java.awt.*;

public class FrameLayout {

	private Frame f1;
	private Frame f2;
	private Frame f3;
	private Frame f4;

	
	public FrameLayout() {

		FlowLayout fl = new FlowLayout(0);
		GridLayout gl = new GridLayout(2, 2);
				
	
		initialize(f1, fl);
		initialize(f2, gl);

	}

	public void initialize(Frame f, LayoutManager l) {
		f = new Frame();
		f.setLayout(l);
		Panel p = new Panel();
		p.setBackground(Color.red);
		Button b1 = new Button("b1");
		p.add(b1);
		Button b2 = new Button("b2");
		Button b3 = new Button("b3");
		Button b4 = new Button("b4");
		f.add(p);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.setSize(500, 500);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		FrameLayout myFrame = new FrameLayout();

	}
}
