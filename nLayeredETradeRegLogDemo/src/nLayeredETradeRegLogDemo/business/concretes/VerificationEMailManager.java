package nLayeredETradeRegLogDemo.business.concretes;

import nLayeredETradeRegLogDemo.business.abstracts.VerificationService;
import nLayeredETradeRegLogDemo.entities.concretes.User;

public class VerificationEMailManager implements VerificationService {

	@Override
	public void verify(User user) {

		System.out.println("Üyeliðiniz doðrulanmýþtýr. Ýþlemlerinize devam edebilirsiniz.");

	}

	@Override
	public void sendVerification(User user) {

		System.out.println("Hoþgeldin: " + user.getUserName() + " kullanýcýsý " + user.getEMailAddress()
				+ " adresine gönderilen doðrulama linkini týklayarak üyelik iþlemlerini tamamlayabilirsin.");

	}

	@Override
	public boolean getVerification(User user) {
		// TODO Auto-generated method stub
		return true;
	}

}
