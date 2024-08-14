package auth_main.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import auth_main.models.User;

public interface UserRepository extends JpaRepository<User, UUID>{

}
