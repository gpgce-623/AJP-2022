package swing;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import jdbc.JDBCMain;

public class MainForm extends WindowAdapter implements ActionListener {
	private JFrame mainFrame;
	private CardLayout cardLayout;
	private Panel JButtonsPanel = new Panel();
	private Panel cardsPanel = new Panel();
	private static final String ADD_STUDENT = "Add Student";
	private static final String SHOW_STUDENT = "Show All Student";
	private static final String UPDATE_STUDENT = "Update Mobile";
	private static final String DELETE_STUDENT = "Remove Student";
	private static final String GET_STUDENT = "Get Student";

	ShowAllStudentDetailForm f2 = null;
	
	public MainForm() {
		mainFrame = new JFrame("Student Information System");
		mainFrame.setSize(800, 600);
		mainFrame.setLayout(new FlowLayout());
		JDBCMain.getConnection();
		Panel mainPanel = new Panel();
		mainPanel.setLayout(new BorderLayout());

		JButtonsPanel.setLayout(new FlowLayout(FlowLayout.CENTER));		
		cardLayout = new CardLayout();
		cardsPanel.setLayout(cardLayout);

		JButton b1 = new JButton(ADD_STUDENT);
		b1.addActionListener(this);
		JButtonsPanel.add(b1);
		AddStudentDetailForm f1 = new AddStudentDetailForm();
		cardsPanel.add(f1, ADD_STUDENT);

		JButton b2 = new JButton(SHOW_STUDENT);
		b2.addActionListener(this);
		JButtonsPanel.add(b2);
		f2 = new ShowAllStudentDetailForm();
		cardsPanel.add(f2, SHOW_STUDENT);

		JButton b3 = new JButton(UPDATE_STUDENT);
		b3.addActionListener(this);
		JButtonsPanel.add(b3);
		UpdateStudentDetailForm f3 = new UpdateStudentDetailForm();
		cardsPanel.add(f3, UPDATE_STUDENT);

		JButton b4 = new JButton(DELETE_STUDENT);
		b4.addActionListener(this);
		JButtonsPanel.add(b4);
		DeleteStudentDetailForm f4 = new DeleteStudentDetailForm();
		cardsPanel.add(f4, DELETE_STUDENT);

		JButton b5 = new JButton(GET_STUDENT);
		b5.addActionListener(this);
		JButtonsPanel.add(b5);
		ShowStudentDetailForm f5 = new ShowStudentDetailForm();
		cardsPanel.add(f5, GET_STUDENT);

		mainPanel.add(JButtonsPanel,BorderLayout.NORTH);
		mainPanel.add(cardsPanel,BorderLayout.CENTER);
		mainFrame.addWindowListener(this);
		mainFrame.add(mainPanel);
		
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case ADD_STUDENT:
			cardLayout.show(cardsPanel, ADD_STUDENT);
			break;
		case SHOW_STUDENT:
			 f2.fetchData();
			cardLayout.show(cardsPanel, SHOW_STUDENT);
			break;
		case UPDATE_STUDENT:
			cardLayout.show(cardsPanel, UPDATE_STUDENT);
			break;
		case DELETE_STUDENT:
			cardLayout.show(cardsPanel, DELETE_STUDENT);
			break;
		case GET_STUDENT:
			cardLayout.show(cardsPanel, GET_STUDENT);
			break;

		}

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Closeing");
		JDBCMain.closeConnection();
		mainFrame.dispose();		
		System.exit(0);
	}

	public JFrame getMainFrame() {
		return mainFrame;
	}

}
