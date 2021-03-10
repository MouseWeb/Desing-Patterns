package design_patterns.Criacao.singleton;

public class App {

	// Garantir que o securityManager não tem mais de uma instância - singleton
	//

	public static void main(String[] args) {

		SecurityManager sm1 = SecurityManager.getInstance();
		sm1.login();
		
		SecurityManager sm2 = SecurityManager.getInstance();
		sm2.login();

		SecurityManager sm3 = SecurityManager.getInstance();
		sm3.login();

		SecurityManager sm4 = SecurityManager.getInstance();
		sm4.login();
		
	}
}
