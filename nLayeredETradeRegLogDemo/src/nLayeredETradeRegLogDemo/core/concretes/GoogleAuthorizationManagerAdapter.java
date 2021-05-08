package nLayeredETradeRegLogDemo.core.concretes;

import java.util.List;

import nLayeredETradeRegLogDemo.business.abstracts.UserCheckValidationService;
import nLayeredETradeRegLogDemo.business.concretes.BaseAuthorizationManager;
import nLayeredETradeRegLogDemo.dataAccess.abstracts.UserDao;
import nLayeredETradeRegLogDemo.entities.concretes.User;

public class GoogleAuthorizationManagerAdapter extends BaseAuthorizationManager {

	private UserDao userDao;
	private UserCheckValidationService checkValidationService;
	
	public GoogleAuthorizationManagerAdapter(UserDao userDao, UserCheckValidationService checkValidationService) {
		super();
		this.userDao = userDao;
		this.checkValidationService = checkValidationService;
	}

	@Override
	public void add(User user) {
		
		if (checkValidationService.CheckIfValidation(user)) {

			if (userDao.get(user.getEMailAddress()) != null) {

				System.out.println("Bu mail adresi daha önce kullanýlmýþtýr: " + user.getFirstName());
				return;
			}

			System.out.println("Google Servisi Authorization ile Kaydýnýz Alýnmýþtýr: " + user.getFirstName());
			this.userDao.add(user);

		}

		else {
			System.out.println("Lütfen bilgilerinizi kontrol ediniz...");
		}
		
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

	@Override
	public void getUserinformation() {
		
		System.out.println("Google Servisi ile kullanýcý bilgileri alýndý:");
		
	}

	
}
