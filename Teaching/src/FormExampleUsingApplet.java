import java.applet.Applet;
import java.awt.*;

public class FormExampleUsingApplet extends Applet {

	Label l1, l2;
	TextField t1, t2;
	Button b1;

	@Override
	public void init() {

		this.setSize(400, 400);
		this.setLayout(new FlowLayout());

		l1 = new Label("Enrollment No");
		this.add(l1);

		t1 = new TextField("Enter the Enrollment No");
		this.add(t1);

		l2 = new Label("Name");
		add(l2);

		t2 = new TextField("Enter the Name");
		add(t2);

		b1 = new Button("Submit");
		add(b1);

		setVisible(true);

	}
}
