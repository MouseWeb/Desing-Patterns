package design_patterns_softblue.Criacao.singleton;

public class SecurityManager3 {

	/* As threads não pode acessar regiões criticas ao mesmo tempo.
	 * Região critica é um código que deve ser acessado por apenas uma threads para
	 * que não cause inconsistências na aplicação. */

	/* Métodos synchronized é lento no java por que a jvm executa uma serie de verificações
	 * para evitar q outras threads execute aquele código simultaneamente*/

	private static SecurityManager3 instance;
	
	private SecurityManager3() {
	}
	
	public static SecurityManager3 getInstance() {
		if (instance == null) {
			synchronized (SecurityManager3.class) {
				// Se duas threads entrar no bloco verifica e não cria uma nova instância.
				if (instance == null) {
					instance = new SecurityManager3();
				}
			}
		}
		return instance;
	}

	public void login() {
		
	}
}