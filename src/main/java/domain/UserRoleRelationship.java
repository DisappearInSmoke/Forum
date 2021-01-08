package domain;
/*
* 用户和角色关系表  User_Role_Relationship
 编号    id
 用户编号   user_id
 角色编号   role_id
* */
public class UserRoleRelationship {
    private Integer Id;
    private Integer userId;
    private Integer roleId;

    public UserRoleRelationship() {
    }

    public UserRoleRelationship(Integer id, Integer userId, Integer roleId) {
        Id = id;
        this.userId = userId;
        this.roleId = roleId;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "UserRoleRelationship{" +
                "Id=" + Id +
                ", userId=" + userId +
                ", roleId=" + roleId +
                '}';
    }
}
