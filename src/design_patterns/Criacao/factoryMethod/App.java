package design_patterns.Criacao.factoryMethod;

import design_patterns.Criacao.factoryMethod.gui.Window;
import design_patterns.Criacao.factoryMethod.shape.Shape;
import design_patterns.Criacao.factoryMethod.shape.ShapeFactory;

public class App {

	/* Quando se usa uma Factory Method para instância os objetos da aplicação
	   podemos mudar o comportamento de instânciação sem precisar mexer no código
	   que faz a chamada que solicita uma nova instância.*/

	/* Externalizado a instânciação para fora do código é muito utilizado em frameworks
	   que permite mudar completamente o comportamento do framework apenas definindo uma class
	   diferente no arquivo de configuração.*/

	public static void main(String[] args) {

		Window w = new Window("Shapes", 300, 300);
		w.show();
		
		Shape shape = ShapeFactory.newShape();
		
		w.drawShape(shape);
	}
	
}
