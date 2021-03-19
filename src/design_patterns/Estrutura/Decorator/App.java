package design_patterns.Estrutura.Decorator;

import design_patterns.Estrutura.Decorator.gui.Window;
import design_patterns.Estrutura.Decorator.shape.ColorShape;
import design_patterns.Estrutura.Decorator.shape.DashLineShape;
import design_patterns.Estrutura.Decorator.shape.Shape;
import design_patterns.Estrutura.Decorator.shape.Square;

import java.awt.Color;

public class App {

	/* Atribui responsabilidades adicionais a um objeto dinamicamente. Os decorators
	 * fornecem uma alternativa flexível a subclasses para  extensão da funcionalidade. */

	/* O padrão (Decorator) tem a função de adicionar comportamentos ou estados em
	 * objetos existentes.
	 * As vezes esse padrão Decorator é chamado de wrapper.
	 * Basicamente o que faz o Decorator = é decorar um objeto, pega um objeto que tem uma
	 * determinada funcionalidade e encapsula esse objeto adicionando uma nova funcionalidade.
	 * Vantagem do decoretor que ele pode fazer isso por instância. Trabalhar individualmente
	 * com a decoração de objetos.
	 * Situações utilizando o Decoretor = um objeto (A) que não tem nenhum comportamento adicionado,
	 * o objeto (B) que tem dois comportamento adicionado, o objeto (C) que tem outros comportamentos.
	 * Enfim podemos trabalhar individualmente com cada objeto. */

	public static void main(String[] args) {

		Window w = new Window("Shapes", 300, 300);
		w.show();
		
		Shape shape = new DashLineShape(new ColorShape(new Square(), Color.YELLOW));
		
		w.drawShape(shape);
	}
}
