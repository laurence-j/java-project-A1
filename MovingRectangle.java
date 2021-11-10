/*
 *  ==========================================================================================
 *  MovingRectangle.java : A rectangle shape. This shape is programmed to 'bounce' around the
 *  screen in response to the elements of the GUI being clicked.
 *
 * 	UPI: LJIA937	
 *	Name: Laurence Jiang
 *	==========================================================================================
 */

import java.awt.*;

public class MovingRectangle extends MovingShape{

	public MovingRectangle() {
		super();
	}

	public MovingRectangle(int size) {
		super(size);
	}

	public MovingRectangle(int x, int y, int w, int h, int mw, int mh, Color bc, Color fc, int pathType) {
		super(x, y, w, h, mw, mh, bc, fc, pathType);
	}

	@Override
	public void draw(Graphics graphic) {
		graphic.setColor(fillColor);
		graphic.fillRect(x, y, width, height);
		graphic.setColor(borderColor);
		graphic.drawRect(x, y, width, height);
		drawHandles(graphic);
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public boolean contains(Point p) {
		if (p.x >= x && p.x <= (x + width) && p.y >= y && p.y <= (y + height)) {
			return true;
		}

		else {
			return false;
		}
	}
}
