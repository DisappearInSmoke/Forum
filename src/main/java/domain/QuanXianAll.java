package domain;
/*
* zong he biao
*
* */
public class QuanXianAll {
    private Jurisdiction jurisdiction;
    private Role role;
    private RoleJurisdictionRelationship roleJurisdictionRelationship;
    private Users users;
    private UserRoleRelationship userRoleRelationship;

    public QuanXianAll() {
    }

    public QuanXianAll(Jurisdiction jurisdiction, Role role, RoleJurisdictionRelationship roleJurisdictionRelationship, Users users, UserRoleRelationship userRoleRelationship) {
        this.jurisdiction = jurisdiction;
        this.role = role;
        this.roleJurisdictionRelationship = roleJurisdictionRelationship;
        this.users = users;
        this.userRoleRelationship = userRoleRelationship;
    }

    public Jurisdiction getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(Jurisdiction jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public RoleJurisdictionRelationship getRoleJurisdictionRelationship() {
        return roleJurisdictionRelationship;
    }

    public void setRoleJurisdictionRelationship(RoleJurisdictionRelationship roleJurisdictionRelationship) {
        this.roleJurisdictionRelationship = roleJurisdictionRelationship;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public UserRoleRelationship getUserRoleRelationship() {
        return userRoleRelationship;
    }

    public void setUserRoleRelationship(UserRoleRelationship userRoleRelationship) {
        this.userRoleRelationship = userRoleRelationship;
    }

    @Override
    public String toString() {
        return "QuanXianAll{" +
                "jurisdiction=" + jurisdiction +
                ", role=" + role +
                ", roleJurisdictionRelationship=" + roleJurisdictionRelationship +
                ", users=" + users +
                ", userRoleRelationship=" + userRoleRelationship +
                '}';
    }
}
