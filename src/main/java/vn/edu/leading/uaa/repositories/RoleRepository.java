package vn.edu.leading.uaa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.leading.uaa.models.RoleModel;

import java.util.List;

public interface RoleRepository extends JpaRepository<RoleModel, Long> {
    RoleModel findByName(String term);

    List<RoleModel> findAllByNameContaining(String term);
}
