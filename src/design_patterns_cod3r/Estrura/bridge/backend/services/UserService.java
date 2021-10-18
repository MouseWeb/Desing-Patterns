package design_patterns_cod3r.Estrura.bridge.backend.services;

import design_patterns_cod3r.Estrura.bridge.backend.dao.UserDao;
import design_patterns_cod3r.Estrura.bridge.backend.model.User;

public abstract class UserService {
	protected UserDao dao;

	public UserService(UserDao dao) {
		this.dao = dao;
	}
	
	public abstract void save(User user);
}
