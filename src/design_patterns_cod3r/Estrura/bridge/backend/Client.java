package design_patterns_cod3r.Estrura.bridge.backend;

import design_patterns_cod3r.Estrura.bridge.backend.dao.UserMongoDao;
import design_patterns_cod3r.Estrura.bridge.backend.dao.UserMysqlDao;
import design_patterns_cod3r.Estrura.bridge.backend.dao.UserOracleDao;
import design_patterns_cod3r.Estrura.bridge.backend.dao.UserPostgresDao;
import design_patterns_cod3r.Estrura.bridge.backend.model.User;
import design_patterns_cod3r.Estrura.bridge.backend.services.UserEJB;
import design_patterns_cod3r.Estrura.bridge.backend.services.UserRest;
import design_patterns_cod3r.Estrura.bridge.backend.services.UserService;
import design_patterns_cod3r.Estrura.bridge.backend.services.UserSoap;

/* O padrão é um brinde e como o nome diz é ponte.
   O objetivo dele é conectar dois lados: eu tenho um lado e um outro lado e a ponte exatamente facilitar.
   comunição de dois aspectos são muito importantes (comunição entre classes concretas) - ponte baseada em interface!
   A partir de interfaces você consegue criar essa ponte fazendo com que você consiga variar as implementações.
   Desacopla uma abstração de sua implementação para que os dois possam variar independentemente - GOF.
 */
public class Client {

	public static void main(String[] args) {
		User user = new User("user", "user@email.com", "passwd");
		
		UserService userRestOracleService = new UserRest(new UserOracleDao());
		userRestOracleService.save(user);
		
		UserService userEJBMongoService = new UserEJB(new UserMongoDao());
		userEJBMongoService.save(user);
		
		UserService userSoapPostgresService = new UserSoap(new UserPostgresDao());
		userSoapPostgresService.save(user);
		
		//.......
		
		UserService userRestMysqlService = new UserRest(new UserMysqlDao());
		userRestMysqlService.save(user);
		
	}
}
