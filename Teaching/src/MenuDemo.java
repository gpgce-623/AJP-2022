import java.awt.*;
import java.awt.event.*;

public class MenuDemo extends WindowAdapter implements ActionListener {

	private Frame f;
	private Label l;
	private MenuBar mb;
	private Menu fileMenu, editMenu;
	private MenuItem fomi, fsmi, ecmi, epmi;

	public MenuDemo() {
		f = new Frame();
		f.setLayout(new FlowLayout());
		f.setSize(500, 500);

		mb = new MenuBar();
		
		fileMenu = new Menu("File");		
		fomi = new MenuItem("Open");
		fomi.addActionListener(this);
		fsmi = new MenuItem("Save");
		fsmi.addActionListener(this);
		fileMenu.add(fomi);
		fileMenu.add(fsmi);

		editMenu = new Menu("Edit");		
		ecmi = new MenuItem("Copy");
		ecmi.addActionListener(this);
		epmi = new MenuItem("Paste");
		epmi.addActionListener(this);
		editMenu.add(ecmi);
		editMenu.add(epmi);

		mb.add(fileMenu);
		mb.add(editMenu);
		f.setMenuBar(mb);

		l = new Label("    test                   ");
		f.add(l);
		f.addWindowListener(this);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new MenuDemo();
	}

	@Override
	public void windowClosing(WindowEvent e) {
		f.dispose();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		l.setText(e.getActionCommand() + " clicked");		
	}

}
