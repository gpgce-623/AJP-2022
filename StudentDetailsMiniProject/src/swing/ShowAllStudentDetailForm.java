package swing;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import jdbc.JDBCMain;
import model.Student;

public class ShowAllStudentDetailForm extends JPanel {
	private static JTable jt = null;
	private static JScrollPane sp = null;

	public ShowAllStudentDetailForm() {
		setSize(500, 500);
		setLayout(new FlowLayout());

		fetchData();
		add(sp);
	}

	void fetchData() {

		String student_columns[] = { "enrollment_no", "name", "password", "gender", "semester", "cpi", "email",
				"mobile", "address", "city", "pincode" };
		ArrayList<Student> students_list = JDBCMain.readAllStudent();
		int size = students_list.size();
		String student_data[][] = new String[size][11];
		for (int i = 0; i < size; i++) {
			Student s = students_list.get(i);
			student_data[i][0] = s.getEnrollmentNo();
			student_data[i][1] = s.getName();
			student_data[i][2] = s.getPassword();
			student_data[i][3] = s.getGender();
			student_data[i][4] = s.getSemester().toString();
			student_data[i][5] = s.getCpi().toString();
			student_data[i][6] = s.getEmail();
			student_data[i][7] = s.getMobile();
			student_data[i][8] = s.getAddress();
			student_data[i][9] = s.getCity();
			student_data[i][10] = s.getPincode();
		}
		jt = new JTable(student_data, student_columns);
		jt.setBounds(50, 50, 1200, 400);
		sp = new JScrollPane(jt);

	}

}
