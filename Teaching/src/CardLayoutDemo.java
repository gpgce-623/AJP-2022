import java.awt.*;
import java.awt.event.*;


public class CardLayoutDemo extends WindowAdapter implements ActionListener {

	Frame f;
	Button b1, b2;
	Panel cardPanel = new Panel();
	CardLayout c = new CardLayout();

	public CardLayoutDemo() {
		f = new Frame();
		f.setSize(500, 500);
		f.setLayout(new GridLayout(2, 1));
		f.setBackground(Color.gray);
		f.addWindowListener(this);

		Panel menuPanel = new Panel();
		menuPanel.setBackground(Color.GREEN);
		b1 = new Button("Card 1");
		b1.addActionListener(this);
		b2 = new Button("Card 2");
		b2.addActionListener(this);
		menuPanel.add(b1);
		menuPanel.add(b2);
		f.add(menuPanel);

		cardPanel.setLayout(c);
		cardPanel.setBackground(Color.ORANGE);

		Panel card1 = new Panel();
		card1.setBackground(Color.BLUE);
		TextField t1 = new TextField();
		card1.add(t1);
		cardPanel.add(card1, "card1");

		Panel card2 = new Panel();
		card1.setBackground(Color.MAGENTA);
		TextArea t2 = new TextArea(4, 10);
		card2.add(t2);
		cardPanel.add(card2, "card2");
		
		f.add(cardPanel);
		f.setVisible(true);

	}

	@Override
	public void windowClosing(WindowEvent e) {
		f.dispose();
	}

	public static void main(String[] args) {
		new CardLayoutDemo();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "Card 1":
			c.show(cardPanel, "card1");
			break;
		case "Card 2":
			c.show(cardPanel, "card2");
			break;
		}

	}

}
