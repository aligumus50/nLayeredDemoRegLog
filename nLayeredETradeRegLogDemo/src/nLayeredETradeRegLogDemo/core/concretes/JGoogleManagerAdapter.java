package nLayeredETradeRegLogDemo.core.concretes;

import nLayeredETradeRegLogDemo.JGoogle.JGoogleManager;
import nLayeredETradeRegLogDemo.core.abstracts.WithLoginService;
import nLayeredETradeRegLogDemo.entities.concretes.User;

public class JGoogleManagerAdapter implements WithLoginService{

	@Override
	public void withLogin() {
		User user = new User(5, "�a�r�", "�", "�agric", "�a�@hotmail.com", "�ifre456", "1234567");
		JGoogleManager googleManager = new JGoogleManager();
		googleManager.loginGoogle(user);
		
	}

	

	

	
}
