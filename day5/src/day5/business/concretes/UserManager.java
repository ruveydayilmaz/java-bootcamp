package day5.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import day5.business.abstracts.UserAuthorizationService;
import day5.business.abstracts.UserService;
import day5.dataAccess.absacts.UserDao;
import day5.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private UserAuthorizationService userAuthorizationService;
	
	public UserManager(UserDao userDao, UserAuthorizationService userAuthorizationService) {
		this.userDao = userDao;
		this.userAuthorizationService = userAuthorizationService;
	}

	@Override
	public void add(User user) {
		userDao.add(user);
		
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}
	
	@Override
	public boolean register(User user) {
		if (registerRules(user) && emailControl(user)) {
			if (validationLink(user)) {
				userDao.add(user);
				System.out.println("kayit basarili");
				return true;
				
			}
		
		}
		System.out.println("Bilgilerinizi Kontrol edip tekrar deneyin");
		return false;
	}

	
	@Override
	public void login(String email, String password) {
		for (User usr: userDao.getAll()) {
			if (usr.getMail()== email && usr.getPassword()== password) {
				System.out.println("Giris basarili");
						
			}
		}
		System.out.println("Girilen bilgiler hatali");

	}

	public boolean registerRules(User user) {

		String regex = "^[A-Z0-9._+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		Matcher control = pattern.matcher(user.getMail());

		return user.getFirstName().length() > 2 && control.matches() && user.getLastName().length() > 2
				&& user.getPassword().length() > 6;
	}
	
	public boolean emailControl(User user) {

		for (User user1 : userDao.getAll()) {
			if (user1.getMail() == user.getMail()) {
				System.out.println("Gecersiz bir email girdiniz");
				return false;
			}
		}
		return true;

	}
	
	public boolean validationLink(User user) { 
		

		if (userAuthorizationService.validation(user.getMail()) == true) {
			System.out.println("Mail dogrulama basarili");
			return true;
		}
		return false;
	
		}
	
}
