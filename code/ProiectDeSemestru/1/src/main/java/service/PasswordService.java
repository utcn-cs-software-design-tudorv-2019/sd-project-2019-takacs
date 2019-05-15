package service;
import java.util.List;
import java.util.Optional;

import entity.Password;
public interface PasswordService {
	List<Password> findAll();

    Optional<Password> findCenter(int passwordId);

    Password createCenter(String name, String address, String phone, String city, String email);

    Password updateCenter(int passwordId, String name, String address, String phone, String city, String email);

    void deletePassword(int passwordId);

}
