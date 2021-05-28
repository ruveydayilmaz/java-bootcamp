package day5.dataAccess.absacts;

import java.util.List;

import day5.entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	void delete(User user);
	void update(User user);
	List<User> getAll();
	
}
