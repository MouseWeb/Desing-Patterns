package design_patterns_softblue.Estrutura.Composite;

import java.util.ArrayList;
import java.util.List;

// Agrupa várias cenas de objetos pra montar o resultado final.
/* Por ser um grupo, esse grupo tem filhos nessa árvore. O grupo vai agrupar vários outras cenas de grupo.
 * Ou seja vai agrupar Triângulo ou retângulo ou outros grupos*/
public class SceneGroup implements SceneObject {

	private List<SceneObject> children = new ArrayList<>();
	
	public void add(SceneObject object) {
		children.add(object);
	}
	
	public void remove(SceneObject object) {
		children.remove(object);
	}
	
	@Override
	public void draw() {
		for (SceneObject sceneObject : children) {
			sceneObject.draw();
		}
	}
}
