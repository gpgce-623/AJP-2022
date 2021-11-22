import java.awt.*;
import java.awt.event.*;

public class Pra10 implements ActionListener {
	Frame mainFrame;
	TextArea ta;

	public Pra10() {
		mainFrame = new Frame();
		mainFrame.setSize(500, 500);
		mainFrame.setLayout(new FlowLayout());
		
		MenuBar mb = new MenuBar();

		Menu file = new Menu("File");
		MenuItem open = new MenuItem("Open");
		open.addActionListener(this);
		MenuItem save = new MenuItem("Save");
		save.addActionListener(this);
		file.add(open);
		file.add(save);		
		mb.add(file);

		Menu edit = new Menu("Edit");
		MenuItem copy = new MenuItem("Copy");
		copy.addActionListener(this);
		MenuItem cut = new MenuItem("Cut");
		cut.addActionListener(this);
		edit.add(copy);
		edit.add(cut);
		mb.add(edit);

		mainFrame.setMenuBar(mb);
		
		Panel p = new Panel();
		p.setLayout(new BorderLayout());
		ta = new TextArea(5, 50);
		p.add(ta,BorderLayout.CENTER);
		
		mainFrame.add(p);
		mainFrame.setVisible(true);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//ta.append();
		ta.setText(e.getActionCommand() + " clicked. ");
	}

	public static void main(String args[]) {
		new Pra10();
	}
}
