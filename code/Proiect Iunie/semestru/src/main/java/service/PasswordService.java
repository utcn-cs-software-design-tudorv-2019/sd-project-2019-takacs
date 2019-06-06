package service;

import java.util.List;

import model.Password;


public interface PasswordService {

	List<Password> findAll();

    Password findPassword(int id);

    Password createPassword(Password password);

void delete(Password password);
}
