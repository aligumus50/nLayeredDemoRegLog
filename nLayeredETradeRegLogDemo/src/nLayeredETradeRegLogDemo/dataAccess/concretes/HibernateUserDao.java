package nLayeredETradeRegLogDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import nLayeredETradeRegLogDemo.dataAccess.abstracts.UserDao;
import nLayeredETradeRegLogDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	List<User> users = new ArrayList<User>();
	
	
	
	public HibernateUserDao() {
		super();
		
		User user1 = new User(1, "engin", "dmr", "engind", "engin@hotmail.com", "þifre123", "0123456789");
		User user2 = new User(1, "engin2", "dmr", "engind2", "engin2@hotmail.com", "þifre321", "0987654321");
		
		users.add(user1);
		users.add(user2);
	}

	@Override
	public void add(User user) {

		users.add(user);
		System.out.println("Sisteme Baþarýlý Bir Þekilde Hibernate ile Kaydýnýz Alýnmýþtýr: " + user.getUserName());
		

	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {

		return null;
	}

	@Override
	public User get(String email) {

		for (User user : users) {

			if (user.getEMailAddress() == email) {

				return user;

			}

		}

		return null;

	}

}
