import java.awt.*;

public class MyFrameInherit extends Frame{
	
	Label l1;
	
	public MyFrameInherit(){		
		setSize(400,400);
		setLayout(new FlowLayout());
		
		l1 = new Label("This is My First Frame using inheritance");		
		add(l1);
				 
		setVisible(true);
		
	}

	public static void main(String[] args) {		
		MyFrameInherit o1 = new MyFrameInherit();
	}

}
