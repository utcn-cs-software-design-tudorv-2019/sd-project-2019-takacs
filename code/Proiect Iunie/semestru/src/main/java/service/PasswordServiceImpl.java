package service;

import java.util.List;

import model.Password;
import repo.PasswordRepository;

public class PasswordServiceImpl implements PasswordService {

	private PasswordRepository passwordRepository;
	public List<Password> findAll() {
		// TODO Auto-generated method stub
		return passwordRepository.findAll();
	}

	public Password findPassword(int id) {
		// TODO Auto-generated method stub
		return passwordRepository.findOne(id);
	}

	public Password createPassword(Password password) {
		// TODO Auto-generated method stub
		return passwordRepository.save(password);
		
	}

	public void delete(Password password) {
		// TODO Auto-generated method stub
		passwordRepository.delete(password);
		
	}

}
