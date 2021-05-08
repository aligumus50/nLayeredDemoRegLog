package nLayeredETradeRegLogDemo;

import nLayeredETradeRegLogDemo.business.abstracts.LoginService;
import nLayeredETradeRegLogDemo.business.abstracts.UserService;
import nLayeredETradeRegLogDemo.business.concretes.BaseAuthorizationManager;
import nLayeredETradeRegLogDemo.business.concretes.LoginManager;
import nLayeredETradeRegLogDemo.business.concretes.UserCheckValidationManager;
import nLayeredETradeRegLogDemo.business.concretes.UserManager;
import nLayeredETradeRegLogDemo.business.concretes.VerificationEMailManager;
import nLayeredETradeRegLogDemo.core.concretes.GoogleAuthorizationManagerAdapter;
import nLayeredETradeRegLogDemo.core.concretes.JGoogleManagerAdapter;
import nLayeredETradeRegLogDemo.dataAccess.concretes.HibernateUserDao;
import nLayeredETradeRegLogDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		// Kullanýcýnýn;
		// Ekleneceði veri tabaný,
		// Hangi validasyon ile çalýþacaðý
		// Hangi doðrulama sistemi kullanýlacaðý
		UserService userService = new UserManager(new HibernateUserDao(), new UserCheckValidationManager(),
				new VerificationEMailManager());

		// Kullanýcý ekleme
		User user = new User(1, "ali", "gms", "ali50", "alig@hotmail.com", "þifre12", "0123456789");

		User user2 = new User(2, "mehmet", "gms", "mehmet51", "mehmet@hotmail.com", "þifre12", "0123456789");

		System.out.println("**********************************");
		userService.add(user);
		userService.add(user2);

		System.out.println("**********************************");

		// Doðrulama linki týklandý.
		boolean verifyResult = true;

		// Doðrulama linki týklanmadý.
		// boolean verifyResult = false;

		userService.addCompletion(user, verifyResult);

		System.out.println("**********************************");

		// Google servisi ile sisteme giriþ;

		BaseAuthorizationManager authorizationManager = new GoogleAuthorizationManagerAdapter(new HibernateUserDao(),
				new UserCheckValidationManager());
		authorizationManager.add(user2);


		System.out.println("**********************************");

		LoginService loginService = new LoginManager(new HibernateUserDao());
		loginService.login("engin@hotmail.com", "þifre123");

		System.out.println("**********************************");
		
		LoginService loginService2 = new LoginManager(new HibernateUserDao(), new JGoogleManagerAdapter());
		loginService2.withLogin();

	}

}
