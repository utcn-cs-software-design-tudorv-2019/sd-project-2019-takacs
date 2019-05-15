package service;

import java.util.List;
import java.util.Optional;

import entity.Password;
import entity.User;

public interface UserService {

	 Optional<User> findUser(int userId);

	    List<User> findAll();

	    User updateUser(int userId, String username,Password password);

	    User createUser(String username, Password password);

	    void deleteUser(int userId);

	    Optional<User> getUser(String username);

	    
}
