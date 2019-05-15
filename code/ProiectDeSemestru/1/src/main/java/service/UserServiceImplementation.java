package service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entity.Password;
import entity.User;
import repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService{

	private static final Logger log = (Logger) LoggerFactory.getLogger(UserServiceImplementation.class);

    @Autowired
    private UserRepository userRepository;


	public Optional<User> findUser(int userId) {
		// TODO Auto-generated method stub
		return this.userRepository.findById(userId);
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return this.userRepository.findAll();
	}

	@Transactional
	public User updateUser(int userId, String username, Password password) {
		// TODO Auto-generated method stub
		Optional<User> user = this.userRepository.findById(userId);
		if(user.isPresent())
		{
			User u = user.get();
			u.setName(username);
		}
		return user.orElse(null);
	}

	@Transactional
	public User createUser(String username, Password password) {
		// TODO Auto-generated method stub
		//User user = User.builder().name(username).password(password).build();
		User user = new User(username,password);
		this.userRepository.save(user);
		return user;
	}

	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		Optional<User> user = this.userRepository.findById(userId);
		if(user.isPresent())
		{
			this.userRepository.deleteById(userId);
		}
		
	}

	public Optional<User> getUser(String username) {
		// TODO Auto-generated method stub
		List<User> userList = this.userRepository.findAll();
		for(User user:userList)
		{
			if(user.getName() == username)
			{
				//return user;
			}
		}
		return null;
	}

}
