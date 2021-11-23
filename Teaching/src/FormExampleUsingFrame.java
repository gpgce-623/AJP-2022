import java.awt.*;

public class FormExampleUsingFrame {
	Frame f1;
	Label l1, l2;
	TextField t1, t2;
	Button b1;

	public FormExampleUsingFrame() {
		f1 = new Frame();
		f1.setSize(400, 400);

		f1.setLayout(new FlowLayout());

		l1 = new Label("Enrollment No");
		f1.add(l1);

		t1 = new TextField("Enter the Enrollment No");
		f1.add(t1);

		l2 = new Label("Name");
		f1.add(l2);

		t2 = new TextField("Enter the Name");
		f1.add(t2);

		b1 = new Button("Submit");
		f1.add(b1);

		f1.setVisible(true);

	}

	public static void main(String args[]) {
		FormExampleUsingFrame o1 = new FormExampleUsingFrame();
	}
}
