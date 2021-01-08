package dao;

import domain.RoleJurisdictionRelationship;

import java.util.List;

public interface RoleJurisdictionRelationshipDao {
    List<RoleJurisdictionRelationship> selectRoleJurisdictionRelationshipAll();
    RoleJurisdictionRelationship selectRoleJurisdictionRelationship(int id);
    int insertRoleJurisdictionRelationship(RoleJurisdictionRelationship roleJurisdictionRelationship);
    int updateRoleJurisdictionRelationship(int id);
    int deleteRoleJurisdictionRelationship(int id);


}
