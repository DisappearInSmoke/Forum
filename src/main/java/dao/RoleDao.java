package dao;

import domain.Role;

import java.util.List;

public interface RoleDao {
    List<Role> selectRoleAll();
    Role selectRole(int id);
    int insertRole(Role role);
    int updateRole(int id);
    int deleteRole(int id);
}
