package design_patterns_cod3r.Estrura.bridge.backend.services;

import design_patterns_cod3r.Estrura.bridge.backend.dao.UserDao;
import design_patterns_cod3r.Estrura.bridge.backend.model.User;

public class UserEJB extends UserService {

	public UserEJB(UserDao dao) {
		super(dao);
	}

	@Override
	public void save(User user) {
		System.out.println("Starting a save operation through EJB Protocol!");
		dao.save(user);
	}
}
