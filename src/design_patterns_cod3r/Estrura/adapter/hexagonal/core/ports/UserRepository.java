package design_patterns_cod3r.Estrura.adapter.hexagonal.core.ports;

import design_patterns_cod3r.Estrura.adapter.hexagonal.core.model.User;

import java.util.List;

public interface UserRepository {
	void save(User user);
	List<User> getAll();
}
