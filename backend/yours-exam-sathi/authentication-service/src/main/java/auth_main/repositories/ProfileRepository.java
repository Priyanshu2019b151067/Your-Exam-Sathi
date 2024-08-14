package auth_main.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import auth_main.models.Profile;

public interface ProfileRepository extends JpaRepository<Profile, UUID> {

}
