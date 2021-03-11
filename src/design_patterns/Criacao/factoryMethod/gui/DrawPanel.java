package design_patterns.Criacao.factoryMethod.gui;

import design_patterns.Criacao.factoryMethod.shape.Shape;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanel extends JPanel {
	
	private Shape shape;
	
	public void drawShape(Shape shape) {
		this.shape = shape;
		repaint();
	}

	@Override
	public void paint(Graphics g) {
		if (shape != null) {
			shape.draw(g);
		}
	}
}
