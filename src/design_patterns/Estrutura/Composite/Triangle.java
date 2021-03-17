package design_patterns.Estrutura.Composite;

// Cena Triângulo. Triângulo é um objeto que faz parte da cena.
// Class concreta que cria o Triângulo
public class Triangle implements SceneObject {

	@Override
	public void draw() {
		System.out.println("Desenhando triângulo");
	}

}
