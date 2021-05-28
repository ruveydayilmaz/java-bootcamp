package day5.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import day5.dataAccess.absacts.UserDao;
import day5.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		System.out.println( user.getFirstName() + " eklendi");
		this.add(user);
		
	}

	@Override
	public void delete(User user) {
		for (User deleteUser : users ) {
			if (user.getId() == deleteUser.getId()) {
				users.remove(user.getId());
				System.out.println(user.getFirstName() + " silindi");
			}		
		}
		
	}

	@Override
	public void update(User user) {
		for (User updateUser : users ) {
			if (user.getId() == updateUser.getId()) {
				User updatedUser = updateUser;
				updatedUser.setFirstName(user.getFirstName());
				updatedUser.setLastName(user.getLastName());
				updatedUser.setMail(user.getMail());
				updatedUser.setPassword(user.getPassword());
			}
		}
		
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}

}
