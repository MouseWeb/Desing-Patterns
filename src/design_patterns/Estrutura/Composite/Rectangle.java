package design_patterns.Estrutura.Composite;

// Cena retângulo. Retângulo é um objeto que faz parte da cena.
// Class concreta que cria o Retângulo
public class Rectangle implements SceneObject {

	@Override
	public void draw() {
		System.out.println("Retângulo de desenho");
	}

}
