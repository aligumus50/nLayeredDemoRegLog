package nLayeredETradeRegLogDemo.business.concretes;


import java.util.List;


import nLayeredETradeRegLogDemo.business.abstracts.UserCheckValidationService;
import nLayeredETradeRegLogDemo.business.abstracts.UserService;
import nLayeredETradeRegLogDemo.business.abstracts.VerificationService;
import nLayeredETradeRegLogDemo.dataAccess.abstracts.UserDao;
import nLayeredETradeRegLogDemo.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private UserCheckValidationService checkValidationService;
	private VerificationService verificationService;


	public UserManager(UserDao userDao, UserCheckValidationService checkValidationService,
			VerificationService verificationService) {
		super();
		this.userDao = userDao;
		this.checkValidationService = checkValidationService;
		this.verificationService = verificationService;
	}


	@Override
	public void add(User user) {

		if (checkValidationService.CheckIfValidation(user)) {

			if (userDao.get(user.getEMailAddress()) != null) {

				System.out.println("Bu mail adresi daha �nce kullan�lm��t�r: " + user.getFirstName());
				return;
			}

			System.out.println("Ba�ar�l� bir �ekilde kayd�n�z al�nm��t�r.");
			this.userDao.add(user);
			this.verificationService.sendVerification(user);

		}

		else {
			System.out.println("L�tfen bilgilerinizi kontrol ediniz...");
		}
	}

	@Override
	public void addCompletion(User user, boolean result) {

		if (result==true) {

			System.out.println("�yelik ��lemleriniz Ba�ar�yla Tamamlanm��t�r: " + user.getFirstName());
		}

		else {
			System.out.println("�yelik i�lemlerini tamamlamak i�in " + user.getEMailAddress()
					+ " mail adresine g�nderilen do�rulama linkini t�klay�n.");
		}

	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
