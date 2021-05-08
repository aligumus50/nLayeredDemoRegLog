package nLayeredETradeRegLogDemo.business.abstracts;

import java.util.List;

import nLayeredETradeRegLogDemo.entities.concretes.User;

public interface AuthorizationService {

	void add(User user);
	void addCompletion(User user, boolean result);
	List<User> getAll();
	void getUserinformation();
}
