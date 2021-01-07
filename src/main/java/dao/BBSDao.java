package dao;


import domain.BBS;

public interface BBSDao {
    String userLogin(String bbsName, String bbsPassword);
    String userIdOnly(String bbsName);
    int userInsert(BBS bbs);
}
