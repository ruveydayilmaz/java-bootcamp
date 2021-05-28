package day5.core.concretes;

import day5.core.abstracts.ExternalAuthService;

public class AuthManager implements ExternalAuthService{

	@Override
	public void Authorization() {
		System.out.println("Google dogrulama basarili");
		
	}

}
