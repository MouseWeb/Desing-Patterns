package design_patterns_softblue.Estrutura.Decorator.shape;

import java.awt.Graphics;

public class Circle implements Shape {

	@Override
	public void draw(Graphics g) {
		g.drawOval(0, 0, 50, 50);
	}
}
