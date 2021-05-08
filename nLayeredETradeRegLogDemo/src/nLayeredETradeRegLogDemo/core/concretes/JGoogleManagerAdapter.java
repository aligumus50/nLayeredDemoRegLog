package nLayeredETradeRegLogDemo.core.concretes;

import nLayeredETradeRegLogDemo.JGoogle.JGoogleManager;
import nLayeredETradeRegLogDemo.core.abstracts.WithLoginService;
import nLayeredETradeRegLogDemo.entities.concretes.User;

public class JGoogleManagerAdapter implements WithLoginService{

	@Override
	public void withLogin() {
		User user = new User(5, "çaðrý", "ç", "çagric", "çað@hotmail.com", "þifre456", "1234567");
		JGoogleManager googleManager = new JGoogleManager();
		googleManager.loginGoogle(user);
		
	}

	

	

	
}
