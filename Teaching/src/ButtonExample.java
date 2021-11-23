import java.awt.*;

public class ButtonExample {
	Frame f1;	
	Button b1;

	public ButtonExample() {

		f1 = new Frame();
		f1.setSize(400, 400);

		f1.setLayout(new FlowLayout());

		b1 = new Button("Submit");
		f1.add(b1);

		f1.setVisible(true);
	}

	public static void main(String args[]) {
		ButtonExample o1 = new ButtonExample();
	}
}
