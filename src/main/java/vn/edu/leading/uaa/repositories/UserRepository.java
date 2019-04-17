package vn.edu.leading.uaa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.leading.uaa.models.UserModel;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserModel, Long> {

    Optional<UserModel> findByUsername(String username);

    List<UserModel> findAllByUsernameContaining(String term);
}
