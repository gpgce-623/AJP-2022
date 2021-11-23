import java.awt.*;

public class MyFrameByInstance {
	Frame f1;
	Label l1;

	public MyFrameByInstance() {
		f1 = new Frame();
		f1.setSize(400, 400);

		f1.setLayout(new FlowLayout());

		l1 = new Label("This is frame by instance");
		f1.add(l1);
		
		
		
		f1.setVisible(true);

	}

	public static void main(String args[]) {
		MyFrameByInstance o1 = new MyFrameByInstance();
	}
}
