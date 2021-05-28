package day5.business.concretes;

import day5.business.abstracts.UserAuthorizationService;

public class UserAuthorizationManager implements UserAuthorizationService {

	@Override
	public boolean validation(String email) {
		if (email != null) {
			System.out.println("link");
		}
		return false;
	}

}
