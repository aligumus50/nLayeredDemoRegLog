package nLayeredETradeRegLogDemo.JGoogle;

import nLayeredETradeRegLogDemo.entities.concretes.User;

public class JGoogleManager {


	public void loginGoogle(User user) {
		System.out.println("Google ile giriþ yapýldý. Hoþgeldin:  " + user.getFirstName());
	}
}
