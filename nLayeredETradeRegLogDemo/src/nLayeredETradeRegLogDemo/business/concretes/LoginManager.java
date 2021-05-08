package nLayeredETradeRegLogDemo.business.concretes;

import nLayeredETradeRegLogDemo.business.abstracts.LoginService;
import nLayeredETradeRegLogDemo.core.abstracts.WithLoginService;
import nLayeredETradeRegLogDemo.dataAccess.abstracts.UserDao;
import nLayeredETradeRegLogDemo.entities.concretes.User;

public class LoginManager implements LoginService{


	private UserDao userDao;
	private WithLoginService withLoginService;
	
	public LoginManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	
	public LoginManager(UserDao userDao, WithLoginService withLoginService) {
		super();
		this.userDao = userDao;
		this.withLoginService=withLoginService;
				
	}
	
	
	@Override
	public void login(String userEmail, String userPassword) {
		
		User defaultUser = userDao.get(userEmail);  
	
		if (defaultUser==null) {
			
			System.out.println("eMail adresinizi kontrol ediniz:");
		}
		
		else if(userEmail==defaultUser.getEMailAddress()&&userPassword==defaultUser.getPassword()) {
			
			System.out.println("Sisteme Baþarýyla giriþ yaptýnýz. Hoþgeldin " + defaultUser.getFirstName());
		}
		
		else if(userEmail==defaultUser.getEMailAddress()&&userPassword!=defaultUser.getPassword()){
			
			System.out.println("Lütfen þifrenizi kontrol ediniz.");
		}
		
	}

	@Override
	public void withLogin() {

		withLoginService.withLogin();
		
	}

	

	

}
