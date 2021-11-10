/*
 *  ==========================================================================================
 *  MovingEllipse.java : An ellipse shape. This shape is programmed to 'bounce' around the
 *  screen in response to the elements of the GUI being clicked.
 *
 * 	UPI: LJIA937	
 *	Name: Laurence Jiang
 *	==========================================================================================
 */

import java.awt.*;


public class MovingEllipse extends MovingShape{
	double dx;
	double dy;

	public MovingEllipse() {
		super();
	}

	public MovingEllipse(int size){
		super(size);
	}

	public MovingEllipse(int x, int y, int w, int h, int mw, int mh, Color bc, Color fc, int pathType){
		super(x, y, w, h, mw, mh, bc, fc, pathType);
	}

	@Override
	public void draw(Graphics graphic) {
		Graphics2D g2d = (Graphics2D) graphic;
		g2d.setColor(fillColor);
		g2d.fillOval(x, y, width, height);
		g2d.setColor(borderColor);
		g2d.drawOval(x, y, width, height);
		drawHandles(graphic);
	}

	@Override
	public double getArea(){
		return (super.width / 2) * (super.height/2) * Math.PI;
	}

	@Override
	public boolean contains(Point mousePt){
		Point EndPt = new Point(x + width, y + height);
		dx = (2 * mousePt.x - x - EndPt.x) / (double) width;
		dy = (2 * mousePt.y - y - EndPt.y) / (double) height;
		return ((dx * dx + dy * dy) < 1.0);
	}
}