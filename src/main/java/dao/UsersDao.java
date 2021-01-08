package dao;

import domain.Jurisdiction;
import domain.Users;

import java.util.List;

public interface UsersDao {
    List<Users> selectJurisdictionAll();
    Users selectJurisdiction(int id);
    int insertJurisdiction(Users users);
    int deleteJurisdiction(int id);
    int updateJurisdiction(int id);
}
