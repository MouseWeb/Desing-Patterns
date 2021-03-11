package design_patterns.Criacao.factoryMethod;

import design_patterns.Criacao.factoryMethod.gui.Window;
import design_patterns.Criacao.factoryMethod.shape.Shape;
import design_patterns.Criacao.factoryMethod.shape.ShapeFactory;

public class App {

	public static void main(String[] args) {

		Window w = new Window("Shapes", 300, 300);
		w.show();
		
		Shape shape = ShapeFactory.newShape();
		
		w.drawShape(shape);
	}
	
}
