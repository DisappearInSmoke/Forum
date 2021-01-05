package com.example.demo.dao.impl;

import com.example.demo.dao.ModuleDao;
import com.example.demo.domain.Module;
import com.example.demo.util.BaseDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ModuleDaoImpl extends BaseDao implements ModuleDao {

    @Override
    public List<Module> showAllModule() {
        String sql="select * from Module";
        List<Module> modules = new ArrayList<>();
        ResultSet resultSet = executeQuery(sql);
        try {
            while (resultSet.next())
                modules.add(new Module(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getInt(3),
                        resultSet.getInt(4)
                ));
            return modules;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
