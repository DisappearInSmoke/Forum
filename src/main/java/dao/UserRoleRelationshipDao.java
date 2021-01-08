package dao;

import domain.UserRoleRelationship;

import java.util.List;

public interface UserRoleRelationshipDao {
    List<UserRoleRelationship> selectUserRoleRelationshipAll();
    UserRoleRelationship selectUserRoleRelationship(int id);
    int insertUserRoleRelationship(UserRoleRelationship userRoleRelationship);
    int deleteUserRoleRelationship(int id);
    int updateUserRoleRelationship(int id);
}
