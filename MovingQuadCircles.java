/*
 *  ==========================================================================================
 *  MovingQuadCircles.java : A "quad" circle shape consisting of four overlapping circles. 
 *  This shape is programmed to 'bounce' around the screen in response to the elements of the
 *  GUI being clicked.
 *
 * 	UPI: LJIA937	
 *	Name: Laurence Jiang
 *	==========================================================================================
 */

import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;

public class MovingQuadCircles extends MovingCircle { 

	public MovingQuadCircles() {
		super(50);
	}

	public MovingQuadCircles(int size){
		super(size);
	}

	public MovingQuadCircles(int x, int y, int w, int h, int mw, int mh, Color bc, Color fc, int pathType) {
		super(x, y, Math.min(w, h), Math.min(w, h), mw, mh, bc, fc, pathType);
	}

	@Override
	public void draw(Graphics graphic) {
		Graphics2D g2d = (Graphics2D) graphic;
		int hw = width/2;	/* Half of the width */
		int hh = height/2;	/* Half of the height */
		int qw = width/4;	/* Quarter of the width */
		int qh = height/4;	/* Quarter of the height */

		Ellipse2D.Double circle1 = new Ellipse2D.Double(x + qw, y, hw, hh);
		Ellipse2D.Double circle2 = new Ellipse2D.Double(x, y + qh, hw, hh);
		Ellipse2D.Double circle3 = new Ellipse2D.Double(x + hw, y + qh, hw, hh);
		Ellipse2D.Double circle4 = new Ellipse2D.Double(x + qh, y + hh, hw, hh);

		Area area1 = new Area(circle1);
		Area area2 = new Area(circle2);
		Area area3 = new Area(circle3);
		Area area4 = new Area(circle4);
		Area area5 = new Area(circle1); /* Second area for circle1 */
		Area area6 = new Area(circle3); /* Second area for circle3 */

		g2d.setColor(borderColor);
		g2d.draw(circle1);
		g2d.draw(circle2);
		g2d.draw(circle3);
		g2d.draw(circle4);

		g2d.setColor(fillColor);
		area1.intersect(area2);
		area2.intersect(area4);
		area3.intersect(area5);
		area4.intersect(area6);

		g2d.fill(area1);
		g2d.fill(area2);
		g2d.fill(area3);
		g2d.fill(area4);
		drawHandles(graphic);
	}
}
