import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Pra9 extends Applet implements ItemListener {

	Checkbox c1, c2, c3;
	Canvas cv;

	public void init() {
		c1 = new Checkbox("Red");
		add(c1);
		c1.addItemListener(this);

		c2 = new Checkbox("Green");
		add(c2);
		c2.addItemListener(this);

		c3 = new Checkbox("Blue");
		add(c3);
		c3.addItemListener(this);

		cv = new Canvas();
		cv.setSize(40, 40);
		add(cv);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		int r = 0, g = 0, b = 0;
		
		if (c1.getState()) {
			r = 255;
		}
		if (c2.getState()) {
			g = 255;
		}
		if (c3.getState()) {
			b = 255;
		}

		Color c = new Color(r, g, b);
		cv.setBackground(c);

	}

}
