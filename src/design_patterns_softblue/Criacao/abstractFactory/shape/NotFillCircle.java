package design_patterns_softblue.Criacao.abstractFactory.shape;

import java.awt.Graphics;

public class NotFillCircle extends Shape {

	@Override
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.drawOval(0, 0, 50, 50);
	}
}
