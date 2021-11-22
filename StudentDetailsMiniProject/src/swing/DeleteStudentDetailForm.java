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

public class DeleteStudentDetailForm extends JPanel implements ActionListener {

	private Label l1;
	private TextField t1;
	private JButton b1;

	public DeleteStudentDetailForm() {
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

		Panel p3 = new Panel();
		b1 = new JButton("Remove Student");
		b1.addActionListener(this);
		p3.add(b1);
		mainPanel.add(p3);

		add(mainPanel);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Student s1 = new Student();
		JDBCMain.deleteStudent(t1.getText());		
	}

}
