package day5.adapters;

import day5.business.abstracts.UserAuthorizationService;
import day5.core.abstracts.ExternalUser;
import day5.core.concretes.AuthManager;
import day5.entities.concretes.User;

public class GoogleAuthorizationAdapter implements UserAuthorizationService{

	private String password;
	private int id;
	
	public GoogleAuthorizationAdapter(int id,String password) {
		
		this.password=password;
		this.id=id;
	}
	
	public User mappingUser() {
		User user = new User();
		ExternalUser googleUser = new ExternalUser();
		
		user.setId(id);
		user.setFirstName(googleUser.getFirstName());
		user.setLastName(googleUser.getLastName());
		user.setMail(googleUser.getMail());
		user.setPassword(password);
		
		return user;
	}
	
	@Override
	public boolean validation(String email) {
		if (email!=null) {
			AuthManager authManager = new AuthManager();
			authManager.Authorization();
			return true;
		}
		
		return false;
	}

	
}
