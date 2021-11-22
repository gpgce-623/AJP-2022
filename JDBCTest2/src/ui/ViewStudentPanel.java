package ui;

import java.awt.Panel;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import jdbc.JDBCMain;
import model.Student;

public class ViewStudentPanel extends Panel {

	public ViewStudentPanel() {

		

		String student_columns[] = { "enrollment_no", "name", "password", "gender", "semester", "cpi", "email",
				"mobile", "address", "city", "pincode" };
		JDBCMain.getConnection();
		ArrayList<Student> students_list = JDBCMain.readStudent();

		int size = students_list.size();
		String student_data[][] = new String[size][11];
		for (int i = 0; i < size; i++) {
			Student s = students_list.get(i);
			student_data[i][0] = s.getEnrollment_no();
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
		   
		JTable jt = new JTable(student_data, student_columns);
		jt.setBounds(50,50,1200, 400);		
		JScrollPane sp=new JScrollPane(jt); 		
		this.add(sp);
		JDBCMain.closeConnection();
	}

}
