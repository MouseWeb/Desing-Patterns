package design_patterns_cod3r.Estrura.adapter.hexagonal;

import design_patterns_cod3r.Estrura.adapter.hexagonal.application.UserRest;

import java.util.HashMap;
import java.util.Map;

public class Client {

	/* Converter a interface de uma classe em outra interface esperada pelos clientes.
	 * Adapter permite a comunicação entre classes que não poderiam trabalhar juntas
	 * devido à incompatibilidade de suas interfaces. */

	public static void main(String[] args) {
		UserRest userRestApi = new UserRest();
		Map<String, String> body = new HashMap<String, String>();
		body.put("email", "user1@email.com");
		body.put("name", "User 1");
		body.put("password", "passwd");
		Integer statusCode = userRestApi.post(body);
		System.out.println(statusCode);
		
		statusCode = userRestApi.get();
		System.out.println(statusCode);
		
		body.put("email", "user2@email.com");
		body.put("name", "User 2");
		statusCode = userRestApi.post(body);
		System.out.println(statusCode);
		
		statusCode = userRestApi.get();
		System.out.println(statusCode);
		
		body.put("email", "user2@email.com");
		body.put("name", "User 2");
		statusCode = userRestApi.post(body);
		System.out.println(statusCode);
		
		statusCode = userRestApi.get();
		System.out.println(statusCode);
	}
}
