package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Password;

public interface PasswordRepository extends JpaRepository<Password,Integer> {

}
