import java.applet.Applet;
import java.awt.*;


public class Pra2 extends Applet {
	int appletWidth = 600;
	int appletHeight = 600;
	int circleDiameter = 50;
	int count = 10;
	
	@Override
	public void init() {
		super.setSize(appletWidth, appletHeight);
	}

	public void paint(Graphics g) {		
		g.setColor(Color.RED);
		for (int i = 0; i < count; i++){
			g.drawOval(getWidth() / 2 - circleDiameter/2 ,i*circleDiameter
					, circleDiameter
					, circleDiameter);
		}

	}

}
