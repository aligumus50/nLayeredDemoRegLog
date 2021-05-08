package nLayeredETradeRegLogDemo.business.abstracts;

import nLayeredETradeRegLogDemo.entities.concretes.User;

public interface VerificationService {

	void verify(User user);
	void sendVerification(User user);
	boolean getVerification(User user);
}
