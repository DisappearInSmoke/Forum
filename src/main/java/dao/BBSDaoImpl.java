package dao;

import domain.BBS;
import util.BaseDao;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BBSDaoImpl extends BaseDao implements BBSDao {

    @Override
    public String userLogin(String bbsName, String bbsPassword) {
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
    public String userIdOnly(String bbsName) {

        return null;
    }

    @Override
    public int userInsert(BBS bbs) {
        return 0;
    }

}
