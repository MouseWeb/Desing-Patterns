package design_patterns_softblue.Estrutura.Decorator.shape;

import java.awt.Graphics;

public class Square implements Shape {

	@Override
	public void draw(Graphics g) {
		g.drawRect(0, 0, 100, 100);
	}
}
