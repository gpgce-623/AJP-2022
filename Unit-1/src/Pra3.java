import java.applet.Applet;
import java.awt.Graphics;

public class Pra3 extends Applet{
	
	public void init(){
		setSize(600,400);
	}
	
	@Override
	public void paint(Graphics g){
		int r = 150;		
		g.drawOval(300-r,200-r,2*r,2*r);
		g.drawString("java",300,200);
	}

}
