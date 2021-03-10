package design_patterns.Criacao.singleton;

public class SecurityManager {

	/* Compartilhado por todas as instâncias da class e é um atributo de class que pertence
	   a class SecurityManager e não a um obj SecurityManager */
	private static SecurityManager instance;

	/* Construtor privado para que a propria classe tenha acesso e não possa criar instâncias de
	   securityManager de códigos externos */
	private SecurityManager() {
	}

	// retorna uma instâncias de securityManager
	public static SecurityManager getInstance() {
		if (instance == null) {
			instance = new SecurityManager();
		}
		return instance;
	}

	public void login() {
		
	}
}
