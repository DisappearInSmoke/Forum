package dao;

import domain.Jurisdiction;

import java.util.List;

public interface JurisdictionDao {
    List<Jurisdiction> selectJurisdictionAll();
    Jurisdiction selectJurisdiction(int id);
    int insertJurisdiction(Jurisdiction jurisdiction);
    int deleteJurisdiction(int id);
    int updateJurisdiction(int id);

}
