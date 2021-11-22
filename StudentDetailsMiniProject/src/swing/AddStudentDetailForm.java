package swing;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import jdbc.JDBCMain;
import model.Student;

public class AddStudentDetailForm extends JPanel implements ActionListener {

	private JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11;
	private JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11;
	private JButton b12;
	JRadioButton r41 = null;
	JRadioButton r42 = null;

	public AddStudentDetailForm() {
		setSize(500, 500);
		setLayout(new FlowLayout());

		JPanel mainJPanel = new JPanel();
		mainJPanel.setLayout(new GridLayout(12, 1));

		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(1, 2));
		l1 = new JLabel("Enrollment No");
		t1 = new JTextField("", 20);
		p1.add(l1);
		p1.add(t1);
		mainJPanel.add(p1);

		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(1, 2));
		l2 = new JLabel("Password");
		t2 = new JTextField();
		p2.add(l2);
		p2.add(t2);
		mainJPanel.add(p2);

		JPanel p3 = new JPanel();
		p3.setLayout(new GridLayout(1, 2));
		l3 = new JLabel("Name");
		t3 = new JTextField();
		p3.add(l3);
		p3.add(t3);
		mainJPanel.add(p3);

		JPanel p4 = new JPanel();
		p4.setLayout(new GridLayout(1, 2));
		l4 = new JLabel("Gender");		
		p4.add(l4);		
		r41 = new JRadioButton("Male");
		r42 = new JRadioButton("Female");
		ButtonGroup bg = new ButtonGroup();
		bg.add(r41);
		bg.add(r42);
		p4.add(r41);
		p4.add(r42);
		mainJPanel.add(p4);

		JPanel p5 = new JPanel();
		p5.setLayout(new GridLayout(1, 2));
		l5 = new JLabel("Semester");
		t5 = new JTextField();
		p5.add(l5);
		p5.add(t5);
		mainJPanel.add(p5);

		JPanel p6 = new JPanel();
		p6.setLayout(new GridLayout(1, 2));
		l6 = new JLabel("CPI");
		t6 = new JTextField();
		p6.add(l6);
		p6.add(t6);
		mainJPanel.add(p6);

		JPanel p7 = new JPanel();
		p7.setLayout(new GridLayout(1, 2));
		l7 = new JLabel("Email");
		t7 = new JTextField();
		p7.add(l7);
		p7.add(t7);
		mainJPanel.add(p7);

		JPanel p8 = new JPanel();
		p8.setLayout(new GridLayout(1, 2));
		l8 = new JLabel("Mobile");
		t8 = new JTextField();
		p8.add(l8);
		p8.add(t8);
		mainJPanel.add(p8);

		JPanel p9 = new JPanel();
		p9.setLayout(new GridLayout(1, 2));
		l9 = new JLabel("Address");
		t9 = new JTextField();
		p9.add(l9);
		p9.add(t9);
		mainJPanel.add(p9);

		JPanel p10 = new JPanel();
		p10.setLayout(new GridLayout(1, 2));
		l10 = new JLabel("City");
		t10 = new JTextField();
		p10.add(l10);
		p10.add(t10);
		mainJPanel.add(p10);

		JPanel p11 = new JPanel();
		p11.setLayout(new GridLayout(1, 2));
		l11 = new JLabel("Pincode");
		t11 = new JTextField();
		p11.add(l11);
		p11.add(t11);
		mainJPanel.add(p11);

		JPanel p12 = new JPanel();
		b12 = new JButton("Save");
		b12.addActionListener(this);
		p12.add(b12);
		mainJPanel.add(p12);

		add(mainJPanel);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		Student s1 = new Student();
		s1.setEnrollmentNo(t1.getText());
		s1.setName(t2.getText());
		s1.setPassword(t3.getText());
		if (r41.isSelected())
			s1.setGender("Male");
		else
			s1.setGender("Female");
		s1.setSemester(Integer.parseInt(t5.getText()));
		s1.setCpi(Double.parseDouble(t6.getText()));
		s1.setEmail(t7.getText());
		s1.setMobile(t8.getText());
		s1.setAddress(t9.getText());
		s1.setCity(t10.getText());
		s1.setPincode(t11.getText());
		JDBCMain.createStudent(s1);
		System.out.println(s1);		

	}

}
