package domain;
/*
* 角色和权限关系表  Role_Jurisdiction_Relationship
 编号    id
 角色编号   role_id
 权限编号   jurisdiction_id
* */
public class RoleJurisdictionRelationship {
    private Integer Id;
    private Integer roleId;
    private Integer jurisdictionId;

    public RoleJurisdictionRelationship() {
    }

    public RoleJurisdictionRelationship(Integer id, Integer roleId, Integer jurisdictionId) {
        Id = id;
        this.roleId = roleId;
        this.jurisdictionId = jurisdictionId;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getJurisdictionId() {
        return jurisdictionId;
    }

    public void setJurisdictionId(Integer jurisdictionId) {
        this.jurisdictionId = jurisdictionId;
    }

    @Override
    public String toString() {
        return "RoleJurisdictionRelationship{" +
                "Id=" + Id +
                ", roleId=" + roleId +
                ", jurisdictionId=" + jurisdictionId +
                '}';
    }
}
