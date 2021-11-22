import java.applet.*;
import java.awt.*;

public class Pra1a extends Applet{
	
	@Override
	public void paint(Graphics g){
		
		setBackground(Color.red);
		g.drawString("Advance Java",100,100);
		showStatus("ok");
	}
}