import java.applet.*;
import java.awt.*;

public class MyApplet2 extends Applet{	
	
	String msg="";
	
	@Override
	public void init() {
		msg += "initialized==>";
	}

	@Override
	public void start() {
		msg += "Started==>";
	}

	@Override
	public void paint(Graphics g){
		msg += "painted==>";
		g.drawString(msg, 100, 200);		
	}
	
	@Override
	public void stop() {
		msg += "stopped==>";
	}
	
	@Override
	public void destroy() {
		msg += "Destroyed==>";
	}	

}
