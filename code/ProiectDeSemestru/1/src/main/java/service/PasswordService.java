package service;
import java.util.List;
import java.util.Optional;

import entity.Password;
public interface PasswordService {
	List<Password> findAll();

    Optional<Password> findPassword(int passwordId);

    Password createPassword(String text,String complexity);

    Password updatePassword(int passwordId, String text,String complexity);

    void deletePassword(int passwordId);

}
