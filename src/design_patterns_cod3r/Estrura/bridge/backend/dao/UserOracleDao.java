package design_patterns_cod3r.Estrura.bridge.backend.dao;

import design_patterns_cod3r.Estrura.bridge.backend.model.User;

public class UserOracleDao implements UserDao{

	@Override
	public void save(User user) {
		System.out.println("Saving the user in the Oracle Database!");
	}
}
