package ui;

import javax.swing.JFrame;

public class UIMainForm {
	private JFrame mainFrame;

	public UIMainForm() {
		mainFrame = new JFrame();
		mainFrame.setSize(1300, 500);		
	
		ViewStudentPanel viewStudentPanel = new ViewStudentPanel();
		mainFrame.add(viewStudentPanel);
		
		mainFrame.setVisible(true);

	}

	public static void main(String args[]) {
		new UIMainForm();
	}

}
