/*
 *  ==========================================================================================
 *  MovingPixelArt.java : A pixelated artwork in the shape of a square. This shape is
 *  programmed to 'bounce' around the screen in response to the elements of the GUI being
 *  clicked.
 *
 * 	UPI: LJIA937	
 *	Name: Laurence Jiang
 *	==========================================================================================
 */

import java.awt.*;

public class MovingPixelArt extends MovingRectangle {

	private String[] values = {"1111111111", "1111551111", "1111551111", "1115555111", "1115555111",
			"1155555511", "1555555551", "1111881111", "1111881111", "1111111111"};

	private Color[] colours = {Color.black, Color.white, Color.red, Color.orange, Color.yellow,
			Color.green, Color.cyan, Color.blue, Color.gray, Color.DARK_GRAY}; 

	public MovingPixelArt() {
		super(50);
	}

	public MovingPixelArt(int size) {
		super(size);
	}

	public MovingPixelArt(int x, int y, int w, int h, int mw, int mh, Color bc, Color fc, int pathType) {
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

	@Override
	public void draw(Graphics graphic) {
		int altx = x;	/* Creating an alternative x value so alterations do not affect x speed */
		int alty = y;	/* Creating an alternative y value so alterations do not affect y speed */
		for (String s:values) {
			for(int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				int value = Character.getNumericValue(c);
				graphic.setColor(colours[value]);
				graphic.drawRect(altx, alty,  width/10,  height/10);
				graphic.fillRect(altx, alty,  width/10,  height/10);
				altx += width/10;
			}
			altx -= width;
			alty += height/10;
			drawHandles(graphic);
		}
	}
}