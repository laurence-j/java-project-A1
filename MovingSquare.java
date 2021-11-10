/*
 *  ==========================================================================================
 *  MovingSquare.java : A square shape. This shape is programmed to 'bounce' around the
 *  screen in response to the elements of the GUI being clicked.
 *
 * 	UPI: LJIA937	
 *	Name: Laurence Jiang
 *	==========================================================================================
 */

import java.awt.*;

public class MovingSquare extends MovingRectangle {

	public MovingSquare() {
		super(50);
	}

	public MovingSquare(int size) {
		super(size);
	}

	public MovingSquare(int x, int y, int w, int h, int mw, int mh, Color bc, Color fc, int pathType) {
		super(x, y, Math.min(w, h), Math.min(w, h), mw, mh, bc, fc, pathType);
	}

	public void setWidth(int w) {
		super.setWidth(w);
		super.setHeight(w);
	}

	public void setHeight(int h) {
		super.setWidth(h);
		super.setHeight(h);
	}
}