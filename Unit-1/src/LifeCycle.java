import java.applet.Applet;
import java.awt.Graphics;

public class LifeCycle extends Applet{	
	
	@Override
	public void init() {
		System.out.println("Applet initialized");		
	}

	@Override
	public void start() {
		System.out.println("Applet Started");
	}

	@Override
	public void paint(Graphics g){
		System.out.println("Applet painted");
		g.drawString("Advance java", 100, 200);		
	}
	
	@Override
	public void stop() {
		System.out.println("Applet stopped");
	}
	
	@Override
	public void destroy() {
		System.out.println("Applet Destroyed");
	}	

}
