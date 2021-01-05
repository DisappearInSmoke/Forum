package dao;

import util.BaseDao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BBSDaoImpl extends BaseDao implements BBSDao {

    @Override
    public String findAll(String bbsName, String bbsPassword) {
        ResultSet set = executeQuery("select * from users where user_name = ? and user_password = ?",bbsName,bbsPassword);
        String userName = null;
        if(set != null){
            try{
                if(set.next()){
                    userName = set.getString(1);
                }

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return userName;
    }

    @Override
    public String select(String bbsName) {
        ResultSet set = executeQuery("select users_name from users where users_name = ?",bbsName);
        if(set != null){
            try{
                set.next();
                return set.getString(1);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return "";
    }
}
