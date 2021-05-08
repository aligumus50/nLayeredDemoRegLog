package nLayeredETradeRegLogDemo.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import nLayeredETradeRegLogDemo.business.abstracts.UserCheckValidationService;
import nLayeredETradeRegLogDemo.entities.concretes.User;

public class UserCheckValidationManager implements UserCheckValidationService {

	@Override
	public boolean CheckIfValidation(User user) {
		
		boolean result = true;
		try {
			
			if (!(user.getFirstName().length() >= 2 && user.getLastName().length() >= 2)) {

				System.out.println("Ad ve Soyad en az 2 karakterden oluþmalýdýr.");
				result=false;

			
			}
			
			if (!(user.getPassword().length()>=6)) {
				
				System.out.println("Þifre en az 6 karakterli olmalýdýr.");
				result=false;
			}
			
			String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
				 
			Pattern pattern = Pattern.compile(regex);
				
		    Matcher matcher = pattern.matcher(user.getEMailAddress());

			if (!matcher.matches()) {
				
				System.out.println("Mail adresinizi kontrol ediniz: *******@hotmail.com þeklinde olmalýdýr.");
				
				
				
			}
			
			return result;
			
		} catch (Exception e) {
			result=true;
		}
		
		return result;
			
			
			
		
	}

	
}
