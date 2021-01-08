package dao;

import domain.*;

import java.util.List;

public interface QuanXianAllDao {
    List<QuanXianAll> selectQuanXianAll(Jurisdiction jurisdiction, Role role, RoleJurisdictionRelationship roleJurisdictionRelationship, UserRoleRelationship userRoleRelationship,Users users);
    QuanXianAll selectQuanXian(int id);

}
