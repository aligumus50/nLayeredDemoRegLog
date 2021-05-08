package nLayeredETradeRegLogDemo.business.concretes;

import java.util.List;

import nLayeredETradeRegLogDemo.business.abstracts.AuthorizationService;
import nLayeredETradeRegLogDemo.entities.concretes.User;

public abstract class BaseAuthorizationManager implements AuthorizationService{

	@Override
	public void add(User user) {
		
		System.out.println("Authorization: " + user.getFirstName());
		
	}

	@Override
	public void addCompletion(User user, boolean result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
