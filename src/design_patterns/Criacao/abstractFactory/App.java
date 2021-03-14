package design_patterns.Criacao.abstractFactory;

import design_patterns.Criacao.abstractFactory.gui.Window;
import design_patterns.Criacao.abstractFactory.shape.Shape;
import design_patterns.Criacao.abstractFactory.shape.ShapeAbstractFactory;
import design_patterns.Criacao.abstractFactory.shape.ShapeFactoryProducer;

public class App {

	/* Abstract Factory =  fornece uma interface para criação de famílias de obj
	   relacionados ou dependentes sem especificar suas classes.*/

	/* A classe App.java não referência os shape específicos.
	 * A class App.java enxerga somente a class ShapeAbstractFactory que é abstrata.
	 * A class App.java não enxerga qual é a factory na memória que está criando os objetos.
	 * A class App.java não tem nem ideia de qual é a instância de (Shape) que está sendo retornada
	 * por uma Factory que ela também não conhece.*/

	/* Esse desconhecimento total da class App com relação a essa criação de objetos proporciona o
	   desacoplamento e facilita muito a manutenção futura e também a extensão de código.
	   Exemplo:
	     Se precisar criar uma nova família de produtos, basta criar uma nova Factory que criar
	     outros produtos ou se precisar criar outros produtos de uma mesma família basta criar
	     as class e alterar a Factory que instância.*/

	public static void main(String[] args) {

		Window w = new Window("Shapes", 300, 300);
		w.show();
		
		ShapeAbstractFactory factory = ShapeFactoryProducer.getFactory(false);
		Shape shape = factory.newShape("circle");
		
		w.drawShape(shape);
	}
}
