package com.example.demo.dao.impl;

import com.example.demo.dao.ModuleDao;
import com.example.demo.domain.Module;
import com.example.demo.domain.ModuleViews;
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

    @Override
    public List<Module> showAllNodeChildNode(int NodeId) {
        String sql="SELECT * FROM Module WHERE left_number BETWEEN (select left_number from Module where module_id=?) AND (select right_number from Module where module_id=?) ORDER BY left_number ASC;";
        List<Module> modules = new ArrayList<>();
        ResultSet resultSet = executeQuery(sql,NodeId,NodeId);
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

    @Override
    public int findNodeAllChildNumber(int NodeId) {
        String sql ="select countChild(?) from dual;";
        ResultSet resultSet= executeQuery(sql,NodeId);
        int num = 0;
        try {
            if (resultSet.next())
                num = Integer.parseInt( resultSet.getString(1));

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return num;
    }

    @Override
    public int findNodeLevel(int NodeId) {
        String sql ="select whichLevel(?)from dual;";
        ResultSet resultSet= executeQuery(sql,NodeId);
        int num = 0;
        try {
            if (resultSet.next())
            num = Integer.parseInt( resultSet.getString(1));
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return num;
    }

    @Override
    public List<ModuleViews> findAllChildNodeLevel(int NodeId) {
        String sql="call module_children(?);";
        List<ModuleViews> moduleViews = new ArrayList<>();
        ResultSet resultSet = executeQuery(sql,NodeId);
        try{
            while (resultSet.next())
                moduleViews.add(new ModuleViews(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getInt(3),
                        resultSet.getInt(4),
                        resultSet.getInt(5)
                ));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return moduleViews;
    }

    @Override
    public List<ModuleViews> findNodeParentPath(int NodeId) {
        String sql="call module_parent(?);";
        List<ModuleViews> modules = new ArrayList<>();
        ResultSet resultSet = executeQuery(sql,NodeId);
        try{
            while (resultSet.next())
                modules.add(new ModuleViews(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getInt(3),
                        resultSet.getInt(4),
                        resultSet.getInt(5)
                ));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return modules;
    }

    @Override
    public int saveChild(int id, String moduleName) {
        String sql ="call add_child(?, ?);";
        return executeUpdate(sql,id,moduleName);
    }

    @Override
    public int delChild(int id) {
        String sql ="call del_child(?);";
        return executeUpdate(sql,id);
    }
}
