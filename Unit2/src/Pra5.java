import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Pra5 extends Applet implements ActionListener{
		
	Button b1 = new Button("Start");
	
	public void init(){
		b1.addActionListener(this);
		add(b1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
		if(e.getActionCommand().equals("Start")){
			b1.setLabel("Stop");		
		}else{
			b1.setLabel("Start");			
		}
		
	}

}
