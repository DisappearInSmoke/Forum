package domain;
/*
* 用户表    Ordinary_Users
  用户编号   user_id
  用户名    user_name
* */
public class Users {
    private Integer userId;
    private String userName;

    public Users() {
    }

    public Users(Integer userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }
}
