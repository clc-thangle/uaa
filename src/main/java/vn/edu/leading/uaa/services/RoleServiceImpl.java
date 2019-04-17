package vn.edu.leading.uaa.services;

import vn.edu.leading.uaa.models.RoleModel;
import vn.edu.leading.uaa.repositories.RoleRepository;

import java.util.List;

public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<RoleModel> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public List<RoleModel> search(String term) {
        return roleRepository.findAllByNameContaining(term);
    }

    @Override
    public RoleModel findById(Long id) {
        return roleRepository.findById(id).get();
    }

    @Override
    public boolean update(RoleModel roleModel) {
        RoleModel roleModel1 = roleRepository.findById(roleModel.getId()).orElse(null);
        if (roleModel1 == null)
            return false;
        roleRepository.save(roleModel);
        return true;
    }

    @Override
    public void save(RoleModel roleModel) {
        roleRepository.save(roleModel);
    }

    @Override
    public boolean delete(Long id) {
        RoleModel roleModel = roleRepository.findById(id).orElse(null);
        if (roleModel == null)
            return false;
        roleRepository.save(roleModel);
        return true;
    }
}
