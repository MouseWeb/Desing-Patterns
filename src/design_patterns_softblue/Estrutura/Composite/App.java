package design_patterns_softblue.Estrutura.Composite;

public class App {

	/* Compõe objetos em estrutura de árvore para representar hierarquias do tipo partes-todo.
	 * O composite permite que os clientes tratem objetos individuais e composições de objetos
	 * de maneira uniforme. */

	/* O padrão composite permite criar hierarquias de objetos e permite tratar objetos individuais
	 * e objetos agrupados da mesma forma de uma forma uniforme e homogênea.*/

	public static void main(String[] args) {
		SceneGroup group1 = new SceneGroup();

		Triangle t1 = new Triangle();
		SceneGroup group2 = new SceneGroup();

		group1.add(t1);
		group1.add(group2);

		Triangle t2 = new Triangle();
		Rectangle r1 = new Rectangle();

		group2.add(t2);
		group2.add(r1);

		SceneGroup group3 = new SceneGroup();

		Rectangle r2 = new Rectangle();
		Rectangle r3 = new Rectangle();
		group3.add(r2);
		group3.add(r3);

		group2.add(group3);

		group1.draw();
	}
}
