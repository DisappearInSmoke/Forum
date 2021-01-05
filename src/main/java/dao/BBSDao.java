package dao;


public interface BBSDao {
    String findAll(String bbsName, String bbsPassword);
    String select(String bbsName);
}
