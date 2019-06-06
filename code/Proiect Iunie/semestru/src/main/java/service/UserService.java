package service;

import java.util.List;

import model.User;

public interface UserService {

	List<User> findAll();
	User findUser(int userId);
	User create(User user);
	void delete(User user);
}
