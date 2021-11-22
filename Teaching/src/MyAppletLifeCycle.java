import java.applet.Applet;
import java.awt.Graphics;

public class MyAppletLifeCycle extends Applet {
	
	@Override
	public void init(){
		System.out.println("Init");
	}
	
	@Override
	public void start(){
		System.out.println("start");
	}
	
	@Override
	public void paint(Graphics g){
		g.drawString("AJP", 10, 10);
		System.out.println("paint");
	}
	
	@Override
	public void stop(){	
		System.out.println("stop");
	}
	
	@Override
	public void destroy(){	
		System.out.println("destroy");
	}
	
}
