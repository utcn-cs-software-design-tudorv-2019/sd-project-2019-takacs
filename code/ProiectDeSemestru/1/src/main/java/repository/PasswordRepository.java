package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Password;

public interface PasswordRepository extends JpaRepository<Password,Integer>{

}
