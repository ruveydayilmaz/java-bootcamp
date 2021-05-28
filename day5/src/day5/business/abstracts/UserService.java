package day5.business.abstracts;

import day5.entities.concretes.User;

public interface UserService {

	void add(User user);
	void update(User user);
	void delete(User user);
    boolean register(User user);
    void login(String email, String password);
	
}
