package nLayeredETradeRegLogDemo.business.concretes;

import nLayeredETradeRegLogDemo.business.abstracts.VerificationService;
import nLayeredETradeRegLogDemo.entities.concretes.User;

public class VerificationEMailManager implements VerificationService {

	@Override
	public void verify(User user) {

		System.out.println("�yeli�iniz do�rulanm��t�r. ��lemlerinize devam edebilirsiniz.");

	}

	@Override
	public void sendVerification(User user) {

		System.out.println("Ho�geldin: " + user.getUserName() + " kullan�c�s� " + user.getEMailAddress()
				+ " adresine g�nderilen do�rulama linkini t�klayarak �yelik i�lemlerini tamamlayabilirsin.");

	}

	@Override
	public boolean getVerification(User user) {
		// TODO Auto-generated method stub
		return true;
	}

}
