package swing;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import jdbc.JDBCMain;
import model.Student;

public class UpdateStudentDetailForm extends JPanel implements ActionListener {

	private Label l1, l3;
	private TextField t1, t3;
	private JButton b2, b4;

	public UpdateStudentDetailForm() {
		setSize(500, 500);
		setLayout(new FlowLayout());

		Panel mainPanel = new Panel();
		mainPanel.setLayout(new GridLayout(3, 1));

		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(1, 2));
		l1 = new Label("Enrollment No");
		t1 = new TextField("Enter your enrollment No");
		p1.add(l1);
		p1.add(t1);
		mainPanel.add(p1);

		Panel p2 = new Panel();
		b2 = new JButton("Fetch Student");
		b2.addActionListener(this);
		p2.add(b2);
		mainPanel.add(p2);

		Panel p3 = new Panel();
		p3.setLayout(new GridLayout(1, 2));
		l3 = new Label("Mobile");
		t3 = new TextField("Enter your name");
		p3.add(l3);
		p3.add(t3);
		mainPanel.add(p3);

		Panel p4 = new Panel();
		b4 = new JButton("Update Student");
		b4.addActionListener(this);
		p4.add(b4);
		mainPanel.add(p4);

		add(mainPanel);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("Update Student")) {
			JDBCMain.updateStudent(t1.getText(), t3.getText());
		} else {
			Student s = JDBCMain.readStudent(t1.getText());
			t3.setText(s.getMobile());
		}

	}

}
