package day5;

import day5.business.abstracts.UserService;
import day5.business.concretes.UserAuthorizationManager;
import day5.business.concretes.UserManager;
import day5.dataAccess.concretes.HibernateUserDao;
import day5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		User user1 = new User(1,"Ruveyda","Yilmaz","ruv@gmail.com","12345678");
		UserService manager1=new UserManager(new HibernateUserDao(),new UserAuthorizationManager()); 
		manager1.register(user1);
		
	}

}
