package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import entity.Password;
import entity.User;
import repository.PasswordRepository;

public class PasswordServiceImplementation implements PasswordService {

    @Autowired
    private PasswordRepository passwordRepository;

	public List<Password> findAll() {
		// TODO Auto-generated method stub
		return this.passwordRepository.findAll();
	}


	public void deletePassword(int passwordId) {
		// TODO Auto-generated method stub
		Optional<Password> password = this.passwordRepository.findById(passwordId);
		if(password.isPresent())
		{
			this.passwordRepository.deleteById(passwordId);
		}
	}

	public Optional<Password> findPassword(int passwordId) {
		// TODO Auto-generated method stub
		Optional<Password> password = this.passwordRepository.findById(passwordId);
		if(password.isPresent())
		{
			return password;
		}
		return null;
	}


	public Password createPassword(String text, String complexity) {
		// TODO Auto-generated method stub
		Password password = new Password(text,complexity);
		this.passwordRepository.save(password);
		return password;
	}


	public Password updatePassword(int passwordId, String text, String complexity) {
		// TODO Auto-generated method stub
		Optional<Password> password = this.passwordRepository.findById(passwordId);
		if(password.isPresent())
		{
			Password p = password.get();
			p.setPasswordText(text);
			p.setPasswordComplexity(complexity);
		}
		return password.orElse(null);
	}


}
