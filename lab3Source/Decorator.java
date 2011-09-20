package lab3Source;

import java.util.AbstractList;
import java.util.Iterator;
import java.awt.Rectangle;

// YOUR CODE HERE
// extends? implements?
class Decorator {
    private Renderer decorated;

    public Decorator(Renderer r) {
	decorated = r;
    }

    private void decorateRectangle(Rectangle r) {
	java.awt.Graphics g = GamePanel.getBuffer();
	g.drawLine(r.x + 2, r.y - 2, r.x + r.width + 2, r.y - 2);
	g.drawLine(r.x + r.width + 2, r.y - 2,
		   r.x + r.width + 2, r.y - 2 + r.height);
    }

    // YOUR CODE HERE
    // overwrite some of the inherited/implemented methods
}
