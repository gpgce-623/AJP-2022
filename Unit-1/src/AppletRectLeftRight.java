import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class AppletRectLeftRight extends Applet {
	private static final Integer width = 300;
	private static final Integer height = 150;

	public void init() {
		setSize(500, 500);
	}

	public void paint(Graphics g) {
		int x = getWidth() / 2 - width / 2;
		int y = getHeight() / 2 - height / 2;
		
		//g.drawRect(x,y , width, height);
	
		int rectWidth = 30;
		Color c;
		int r=0,gr=0,b=0;
		int cr = 50;
		for(int i=x;i<(x+width);i=i+rectWidth){
			r=0;
			gr=(int)(Math.random()*255);
			b=0;
			//b=(int)(b+cr)%255;
			System.out.println(r + " : " + gr + " : " + b);
			c = new Color(r,gr,b);
			g.setColor(c);
			g.fillRect(i, y, rectWidth, height);
		}
		
	}
}
