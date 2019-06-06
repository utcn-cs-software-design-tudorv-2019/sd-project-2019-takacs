package service;

import java.util.List;

import model.User;
import repo.UserRepository;

public class UserServiceImpl implements UserService{

	private UserRepository userRepository;
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	public User findUser(int userId) {
		// TODO Auto-generated method stub
		return userRepository.findOne(userId);
	}

	public User create(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	public void delete(User user) {
		// TODO Auto-generated method stub
		userRepository.delete(user);
		
	}

}
