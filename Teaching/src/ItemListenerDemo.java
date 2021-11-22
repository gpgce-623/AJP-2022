import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ItemListenerDemo implements ItemListener {

	Frame mainFrame;

	Choice co1;
	Label l, l2;

	public ItemListenerDemo() {
		mainFrame = new Frame();
		mainFrame.setSize(500, 500);
		mainFrame.setLayout(new FlowLayout(FlowLayout.LEFT));

		mainFrame.setBackground(Color.GRAY);

		Panel p = new Panel();
		p.setBackground(Color.orange);
		l = new Label("Select your difficult subject");
		p.add(l);
		co1 = new Choice();
		co1.add("Advance Java Programming");
		co1.add("MCAD");
		co1.add("NMA");
		co1.add(".NET");
		co1.add("DBMS");
		co1.addItemListener(this);
		p.add(co1);
		mainFrame.add(p);

		Panel p2 = new Panel();
		p2.setBackground(Color.yellow);
		l2 = new Label("selection Option");
		p2.add(l2);
		mainFrame.add(p2);

		mainFrame.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String s = (String) e.getItem();		
		l2.setText(s);
	}

	public static void main(String args[]) {
		ItemListenerDemo f1 = new ItemListenerDemo();
	}

}
