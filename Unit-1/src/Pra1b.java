import java.applet.*;
import java.awt.*;

public class Pra1b extends Applet {
	@Override
	public void init() {		
		System.out.println("init");
	}

	@Override
	public void start() {
		System.out.println("start");
	}

	@Override
	public void paint(Graphics g){
		System.out.println("Paint");
	}
	
	@Override
	public void stop() {
		System.out.println("stop");
	}

	@Override
	public void destroy() {
		System.out.println("destroy");
	}
}
