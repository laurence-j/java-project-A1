/*
 *  ==========================================================================================
 *  MovingCircle.java : A circle shape. This shape is programmed to 'bounce' around the
 *  screen in response to the elements of the GUI being clicked.
 *
 * 	UPI: LJIA937	
 *	Name: Laurence Jiang
 *	==========================================================================================
 */

import java.awt.*;

public class MovingCircle extends MovingEllipse{
	public MovingCircle(){
		super(50);
	}

	public MovingCircle(int size){
		super(size);
	}

	public MovingCircle(int x, int y, int w, int h, int mw, int mh, Color bc, Color fc, int pathType) {
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