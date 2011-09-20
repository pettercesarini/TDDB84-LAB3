package lab3Source;

import java.util.AbstractList;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.util.Iterator;

// YOUR CODE HERE
// extends? implements?
class Graphics3DAdapter extends AbstractGraphics implements Renderer {

	// YOUR CODE HERE
	// overwrite some of the inherited/implemented methods

	private Graphics3D S_graphics3d;
	private Color S_backgroundC;
	private Color S_bonusC;

	public Graphics3DAdapter(Color c, Color S_bonusC) {
		this.S_graphics3d = new Graphics3D();
		this.S_backgroundC = c;
		this.S_bonusC = S_bonusC;
	}

	@Override
	public void putBackground() {

		S_graphics3d.printBase(this.S_backgroundC);
	}

	@Override
	public void putBonus(AbstractList bonuses) {
		Rectangle r;
		java.awt.Graphics g = GamePanel.getBuffer();
		Iterator iterator = bonuses.iterator();
		g.setColor(bonusColor);
		while (iterator.hasNext()) {
			r = (Rectangle) iterator.next();

			S_graphics3d.printBonus(new Box(r.x, r.y, r.x + r.width, r.y
					+ r.height), S_bonusC);

		}
	}

	@Override
	public void putBody(AbstractList body) {
		// TODO Auto-generated method stub
		// super.putBody(body);
		Rectangle r;
		java.awt.Graphics g = GamePanel.getBuffer();
		g.setColor(snakeColor);
		Iterator iterator = body.iterator();
		while (iterator.hasNext()) {
			r = (Rectangle) iterator.next();

			S_graphics3d.printBox(new Box(r.x, r.y, r.x + r.width, r.y
					+ r.height), snakeColor);

		}

	}
}
