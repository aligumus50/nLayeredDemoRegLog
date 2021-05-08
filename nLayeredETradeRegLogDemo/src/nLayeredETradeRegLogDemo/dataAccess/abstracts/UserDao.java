package nLayeredETradeRegLogDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredETradeRegLogDemo.entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	void delete(User user);
	void update(User user);
	User get(int id);
	User get(String email);
	List<User> getAll();

}
